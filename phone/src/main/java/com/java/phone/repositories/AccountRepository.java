package com.java.phone.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.phone.entities.Nguoidung;

@Repository("AccountRepository")
public interface AccountRepository extends CrudRepository<Nguoidung, Integer> {
	public Nguoidung findByGmail(String gmail);
}
