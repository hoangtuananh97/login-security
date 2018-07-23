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
 * Camera generated by hbm2java
 */
@Entity
@Table(name = "camera", catalog = "dienthoai")
public class Camera implements java.io.Serializable {

	private Integer idCamera;
	private String videocall;
	private String dophangia;
	private String quanphim;
	private String denfalsh;
	private String chupanhnangcao;
	private String thongtinkhac;
	private Set<Chitietdt> chitietdts = new HashSet<Chitietdt>(0);

	public Camera() {
	}

	public Camera(String videocall, String dophangia, String quanphim, String denfalsh, String chupanhnangcao,
			String thongtinkhac) {
		this.videocall = videocall;
		this.dophangia = dophangia;
		this.quanphim = quanphim;
		this.denfalsh = denfalsh;
		this.chupanhnangcao = chupanhnangcao;
		this.thongtinkhac = thongtinkhac;
	}

	public Camera(String videocall, String dophangia, String quanphim, String denfalsh, String chupanhnangcao,
			String thongtinkhac, Set<Chitietdt> chitietdts) {
		this.videocall = videocall;
		this.dophangia = dophangia;
		this.quanphim = quanphim;
		this.denfalsh = denfalsh;
		this.chupanhnangcao = chupanhnangcao;
		this.thongtinkhac = thongtinkhac;
		this.chitietdts = chitietdts;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_camera", unique = true, nullable = false)
	public Integer getIdCamera() {
		return this.idCamera;
	}

	public void setIdCamera(Integer idCamera) {
		this.idCamera = idCamera;
	}

	@Column(name = "videocall", nullable = false, length = 100)
	public String getVideocall() {
		return this.videocall;
	}

	public void setVideocall(String videocall) {
		this.videocall = videocall;
	}

	@Column(name = "dophangia", nullable = false, length = 100)
	public String getDophangia() {
		return this.dophangia;
	}

	public void setDophangia(String dophangia) {
		this.dophangia = dophangia;
	}

	@Column(name = "quanphim", nullable = false, length = 100)
	public String getQuanphim() {
		return this.quanphim;
	}

	public void setQuanphim(String quanphim) {
		this.quanphim = quanphim;
	}

	@Column(name = "denfalsh", nullable = false, length = 100)
	public String getDenfalsh() {
		return this.denfalsh;
	}

	public void setDenfalsh(String denfalsh) {
		this.denfalsh = denfalsh;
	}

	@Column(name = "chupanhnangcao", nullable = false, length = 100)
	public String getChupanhnangcao() {
		return this.chupanhnangcao;
	}

	public void setChupanhnangcao(String chupanhnangcao) {
		this.chupanhnangcao = chupanhnangcao;
	}

	@Column(name = "thongtinkhac", nullable = false, length = 100)
	public String getThongtinkhac() {
		return this.thongtinkhac;
	}

	public void setThongtinkhac(String thongtinkhac) {
		this.thongtinkhac = thongtinkhac;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "camera")
	public Set<Chitietdt> getChitietdts() {
		return this.chitietdts;
	}

	public void setChitietdts(Set<Chitietdt> chitietdts) {
		this.chitietdts = chitietdts;
	}

}