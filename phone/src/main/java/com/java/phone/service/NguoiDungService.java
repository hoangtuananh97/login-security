package com.java.phone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.phone.dao.NguoiDungDao;
import com.java.phone.entities.Nguoidung;

@Service
@Transactional
public class NguoiDungService {
	
	@Autowired
	private NguoiDungDao nguoiDungDao;
	
	
}
