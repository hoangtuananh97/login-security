package com.java.phone.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.phone.dao.NguoiDungDao;
import com.java.phone.entities.ChucvuNguoidung;
import com.java.phone.entities.Nguoidung;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private NguoiDungDao ndDao;

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(final String gmail) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("1");
		com.java.phone.entities.Nguoidung nd = ndDao.loadUserByUsername(gmail);

		if (null == nd) {
			return null;
		} else {
			boolean enabled = true;
			boolean accountNonExpired = true;
			boolean credentialsNonExpired = true;
			boolean accountNonLocked = true;
			System.out.println("2");
			System.out.println("2nguoi dung: " + nd.getMatkhau());
			System.out.println("hello: " + getAuthorities(nd));
			return new User(gmail, nd.getMatkhau(), enabled, accountNonExpired, credentialsNonExpired, accountNonLocked,
					getAuthorities(nd));
		}

	}

	public List<GrantedAuthority> getAuthorities(Nguoidung nd) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

		for (ChucvuNguoidung usersRoles : nd.getChucvuNguoidungs()) {
			System.out.println("usersRoles: " + usersRoles.getChucvu().getTenchucvu());
			authorities.add(new SimpleGrantedAuthority(usersRoles.getChucvu().getTenchucvu()));
		}
		System.out.println("size: " + authorities.size());
		return authorities;
	}
}
