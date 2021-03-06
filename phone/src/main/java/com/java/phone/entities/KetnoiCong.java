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
 * KetnoiCong generated by hbm2java
 */
@Entity
@Table(name = "ketnoi_cong", catalog = "dienthoai")
public class KetnoiCong implements java.io.Serializable {

	private Integer idKetnoiCong;
	private int nfc;
	private int knUsb;
	private int bangtan2g;
	private int bangtan3g;
	private int bangtan4g;
	private int loaisim;
	private String khecam;
	private String wifi;
	private String gps;
	private String bluetool;
	private String congsac;
	private String jack;
	private Set<Chitietdt> chitietdts = new HashSet<Chitietdt>(0);

	public KetnoiCong() {
	}

	public KetnoiCong(int nfc, int knUsb, int bangtan2g, int bangtan3g, int bangtan4g, int loaisim, String khecam,
			String wifi, String gps, String bluetool, String congsac, String jack) {
		this.nfc = nfc;
		this.knUsb = knUsb;
		this.bangtan2g = bangtan2g;
		this.bangtan3g = bangtan3g;
		this.bangtan4g = bangtan4g;
		this.loaisim = loaisim;
		this.khecam = khecam;
		this.wifi = wifi;
		this.gps = gps;
		this.bluetool = bluetool;
		this.congsac = congsac;
		this.jack = jack;
	}

	public KetnoiCong(int nfc, int knUsb, int bangtan2g, int bangtan3g, int bangtan4g, int loaisim, String khecam,
			String wifi, String gps, String bluetool, String congsac, String jack, Set<Chitietdt> chitietdts) {
		this.nfc = nfc;
		this.knUsb = knUsb;
		this.bangtan2g = bangtan2g;
		this.bangtan3g = bangtan3g;
		this.bangtan4g = bangtan4g;
		this.loaisim = loaisim;
		this.khecam = khecam;
		this.wifi = wifi;
		this.gps = gps;
		this.bluetool = bluetool;
		this.congsac = congsac;
		this.jack = jack;
		this.chitietdts = chitietdts;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_ketnoi_cong", unique = true, nullable = false)
	public Integer getIdKetnoiCong() {
		return this.idKetnoiCong;
	}

	public void setIdKetnoiCong(Integer idKetnoiCong) {
		this.idKetnoiCong = idKetnoiCong;
	}

	@Column(name = "nfc", nullable = false)
	public int getNfc() {
		return this.nfc;
	}

	public void setNfc(int nfc) {
		this.nfc = nfc;
	}

	@Column(name = "kn_usb", nullable = false)
	public int getKnUsb() {
		return this.knUsb;
	}

	public void setKnUsb(int knUsb) {
		this.knUsb = knUsb;
	}

	@Column(name = "bangtan2g", nullable = false)
	public int getBangtan2g() {
		return this.bangtan2g;
	}

	public void setBangtan2g(int bangtan2g) {
		this.bangtan2g = bangtan2g;
	}

	@Column(name = "bangtan3g", nullable = false)
	public int getBangtan3g() {
		return this.bangtan3g;
	}

	public void setBangtan3g(int bangtan3g) {
		this.bangtan3g = bangtan3g;
	}

	@Column(name = "bangtan4g", nullable = false)
	public int getBangtan4g() {
		return this.bangtan4g;
	}

	public void setBangtan4g(int bangtan4g) {
		this.bangtan4g = bangtan4g;
	}

	@Column(name = "loaisim", nullable = false)
	public int getLoaisim() {
		return this.loaisim;
	}

	public void setLoaisim(int loaisim) {
		this.loaisim = loaisim;
	}

	@Column(name = "khecam", nullable = false, length = 50)
	public String getKhecam() {
		return this.khecam;
	}

	public void setKhecam(String khecam) {
		this.khecam = khecam;
	}

	@Column(name = "wifi", nullable = false, length = 50)
	public String getWifi() {
		return this.wifi;
	}

	public void setWifi(String wifi) {
		this.wifi = wifi;
	}

	@Column(name = "gps", nullable = false, length = 50)
	public String getGps() {
		return this.gps;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

	@Column(name = "bluetool", nullable = false, length = 50)
	public String getBluetool() {
		return this.bluetool;
	}

	public void setBluetool(String bluetool) {
		this.bluetool = bluetool;
	}

	@Column(name = "congsac", nullable = false, length = 100)
	public String getCongsac() {
		return this.congsac;
	}

	public void setCongsac(String congsac) {
		this.congsac = congsac;
	}

	@Column(name = "jack", nullable = false, length = 50)
	public String getJack() {
		return this.jack;
	}

	public void setJack(String jack) {
		this.jack = jack;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ketnoiCong")
	public Set<Chitietdt> getChitietdts() {
		return this.chitietdts;
	}

	public void setChitietdts(Set<Chitietdt> chitietdts) {
		this.chitietdts = chitietdts;
	}

}
