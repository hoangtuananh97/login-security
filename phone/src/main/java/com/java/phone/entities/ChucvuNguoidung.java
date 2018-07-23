package com.java.phone.entities;
// Generated Jul 19, 2018 3:39:19 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ChucvuNguoidung generated by hbm2java
 */
@Entity
@Table(name = "chucvu_nguoidung", catalog = "dienthoai")
public class ChucvuNguoidung implements java.io.Serializable {

	private Integer id;
	private Chucvu chucvu;
	private Nguoidung nguoidung;

	public ChucvuNguoidung() {
	}

	public ChucvuNguoidung(Chucvu chucvu, Nguoidung nguoidung) {
		this.chucvu = chucvu;
		this.nguoidung = nguoidung;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_chucvu", nullable = false)
	public Chucvu getChucvu() {
		return this.chucvu;
	}

	public void setChucvu(Chucvu chucvu) {
		this.chucvu = chucvu;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_nguoidung", nullable = false)
	public Nguoidung getNguoidung() {
		return this.nguoidung;
	}

	public void setNguoidung(Nguoidung nguoidung) {
		this.nguoidung = nguoidung;
	}

}