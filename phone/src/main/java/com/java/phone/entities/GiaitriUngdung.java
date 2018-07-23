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
 * GiaitriUngdung generated by hbm2java
 */
@Entity
@Table(name = "giaitri_ungdung", catalog = "dienthoai")
public class GiaitriUngdung implements java.io.Serializable {

	private Integer idGiaitri;
	private String xemphim;
	private String nghenhac;
	private String denpin;
	private String ghiam;
	private Set<Chitietdt> chitietdts = new HashSet<Chitietdt>(0);

	public GiaitriUngdung() {
	}

	public GiaitriUngdung(String xemphim, String nghenhac, String denpin, String ghiam) {
		this.xemphim = xemphim;
		this.nghenhac = nghenhac;
		this.denpin = denpin;
		this.ghiam = ghiam;
	}

	public GiaitriUngdung(String xemphim, String nghenhac, String denpin, String ghiam, Set<Chitietdt> chitietdts) {
		this.xemphim = xemphim;
		this.nghenhac = nghenhac;
		this.denpin = denpin;
		this.ghiam = ghiam;
		this.chitietdts = chitietdts;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_giaitri", unique = true, nullable = false)
	public Integer getIdGiaitri() {
		return this.idGiaitri;
	}

	public void setIdGiaitri(Integer idGiaitri) {
		this.idGiaitri = idGiaitri;
	}

	@Column(name = "xemphim", nullable = false, length = 100)
	public String getXemphim() {
		return this.xemphim;
	}

	public void setXemphim(String xemphim) {
		this.xemphim = xemphim;
	}

	@Column(name = "nghenhac", nullable = false, length = 100)
	public String getNghenhac() {
		return this.nghenhac;
	}

	public void setNghenhac(String nghenhac) {
		this.nghenhac = nghenhac;
	}

	@Column(name = "denpin", nullable = false, length = 50)
	public String getDenpin() {
		return this.denpin;
	}

	public void setDenpin(String denpin) {
		this.denpin = denpin;
	}

	@Column(name = "ghiam", nullable = false, length = 50)
	public String getGhiam() {
		return this.ghiam;
	}

	public void setGhiam(String ghiam) {
		this.ghiam = ghiam;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "giaitriUngdung")
	public Set<Chitietdt> getChitietdts() {
		return this.chitietdts;
	}

	public void setChitietdts(Set<Chitietdt> chitietdts) {
		this.chitietdts = chitietdts;
	}

}
