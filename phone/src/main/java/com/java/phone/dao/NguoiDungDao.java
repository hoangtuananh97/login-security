package com.java.phone.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java.phone.entities.Nguoidung;

@Repository(value="NguoiDungDao")
@Transactional(noRollbackFor= Exception.class)
public class NguoiDungDao {

	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * @Autowired private BCryptPasswordEncoder bCryptPasswordEncoder;
	 * 
	 * public void createAccount(Nguoidung nd){ Session session =
	 * this.sessionFactory.getCurrentSession(); Nguoidung nguoidung = new
	 * Nguoidung();
	 * nguoidung.setMatkhau(bCryptPasswordEncoder.encode(nguoidung.getMatkhau())
	 * ); session.save(nd); }
	 */
	public Nguoidung loadUserByUsername(final String gmail) {
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("1.");
		List<Nguoidung> users = new ArrayList<Nguoidung>();
		users = session.createQuery("from Nguoidung where gmail= :gmail", Nguoidung.class)
				.setParameter("gmail", gmail).list();
		System.out.println("2.Nguoidung "+users.get(0).getTenNguoidung());
		if (users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}
	}
}
