package com.java.phone.entities;
// Generated Jul 19, 2018 3:39:19 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * DmManhinh generated by hbm2java
 */
@Entity
@Table(name = "dm_manhinh", catalog = "dienthoai")
public class DmManhinh implements java.io.Serializable {

	private Integer idDmManhinh;
	private String tenDmManhinh;
	private Set<Dienthoai> dienthoais = new HashSet<Dienthoai>(0);

	public DmManhinh() {
	}

	public DmManhinh(String tenDmManhinh) {
		this.tenDmManhinh = tenDmManhinh;
	}

	public DmManhinh(String tenDmManhinh, Set<Dienthoai> dienthoais) {
		this.tenDmManhinh = tenDmManhinh;
		this.dienthoais = dienthoais;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_dm_manhinh", unique = true, nullable = false)
	public Integer getIdDmManhinh() {
		return this.idDmManhinh;
	}

	public void setIdDmManhinh(Integer idDmManhinh) {
		this.idDmManhinh = idDmManhinh;
	}

	@Column(name = "ten_dm_manhinh", nullable = false, length = 100)
	public String getTenDmManhinh() {
		return this.tenDmManhinh;
	}

	public void setTenDmManhinh(String tenDmManhinh) {
		this.tenDmManhinh = tenDmManhinh;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dmManhinh")
	public Set<Dienthoai> getDienthoais() {
		return this.dienthoais;
	}

	public void setDienthoais(Set<Dienthoai> dienthoais) {
		this.dienthoais = dienthoais;
	}

}
