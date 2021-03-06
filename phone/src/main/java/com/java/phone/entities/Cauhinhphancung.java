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
 * Cauhinhphancung generated by hbm2java
 */
@Entity
@Table(name = "cauhinhphancung", catalog = "dienthoai")
public class Cauhinhphancung implements java.io.Serializable {

	private Integer idCauhinh;
	private String tocdocpu;
	private int sonhan;
	private String chipset;
	private String ram;
	private String chipdohoa;
	private String camungvantay;
	private Set<Chitietdt> chitietdts = new HashSet<Chitietdt>(0);

	public Cauhinhphancung() {
	}

	public Cauhinhphancung(String tocdocpu, int sonhan, String chipset, String ram, String chipdohoa,
			String camungvantay) {
		this.tocdocpu = tocdocpu;
		this.sonhan = sonhan;
		this.chipset = chipset;
		this.ram = ram;
		this.chipdohoa = chipdohoa;
		this.camungvantay = camungvantay;
	}

	public Cauhinhphancung(String tocdocpu, int sonhan, String chipset, String ram, String chipdohoa,
			String camungvantay, Set<Chitietdt> chitietdts) {
		this.tocdocpu = tocdocpu;
		this.sonhan = sonhan;
		this.chipset = chipset;
		this.ram = ram;
		this.chipdohoa = chipdohoa;
		this.camungvantay = camungvantay;
		this.chitietdts = chitietdts;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_cauhinh", unique = true, nullable = false)
	public Integer getIdCauhinh() {
		return this.idCauhinh;
	}

	public void setIdCauhinh(Integer idCauhinh) {
		this.idCauhinh = idCauhinh;
	}

	@Column(name = "tocdocpu", nullable = false, length = 100)
	public String getTocdocpu() {
		return this.tocdocpu;
	}

	public void setTocdocpu(String tocdocpu) {
		this.tocdocpu = tocdocpu;
	}

	@Column(name = "sonhan", nullable = false)
	public int getSonhan() {
		return this.sonhan;
	}

	public void setSonhan(int sonhan) {
		this.sonhan = sonhan;
	}

	@Column(name = "chipset", nullable = false, length = 100)
	public String getChipset() {
		return this.chipset;
	}

	public void setChipset(String chipset) {
		this.chipset = chipset;
	}

	@Column(name = "ram", nullable = false, length = 10)
	public String getRam() {
		return this.ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	@Column(name = "chipdohoa", nullable = false, length = 100)
	public String getChipdohoa() {
		return this.chipdohoa;
	}

	public void setChipdohoa(String chipdohoa) {
		this.chipdohoa = chipdohoa;
	}

	@Column(name = "camungvantay", nullable = false, length = 50)
	public String getCamungvantay() {
		return this.camungvantay;
	}

	public void setCamungvantay(String camungvantay) {
		this.camungvantay = camungvantay;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cauhinhphancung")
	public Set<Chitietdt> getChitietdts() {
		return this.chitietdts;
	}

	public void setChitietdts(Set<Chitietdt> chitietdts) {
		this.chitietdts = chitietdts;
	}

}
