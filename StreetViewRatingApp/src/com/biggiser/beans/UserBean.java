package com.biggiser.beans;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Jiale Wang, Yao Yao
 * HPSCIL & LIESMARS
 */
public class UserBean implements Serializable{
	private static final long serialVersionUID = -6692566841441444753L;

	private Integer id;
	private String username;
	private String password;
	private String country;
	private String province;
	private String city;
	private String occupation;
	private int gender;
	private int incomelevel;
	private String last_ip;
	private Date last_visit; 

	public UserBean() {
		super();
	}

	public UserBean(Integer id, String username, String password, String country, String province, String city,
			String occupation, int gender, int incomelevel, String last_ip, Date last_visit) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.country = country;
		this.province = province;
		this.city = city;
		this.occupation = occupation;
		this.gender = gender;
		this.incomelevel = incomelevel;
		this.last_ip = last_ip;
		this.last_visit = last_visit;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getIncomelevel() {
		return incomelevel;
	}

	public void setIncomelevel(int incomelevel) {
		this.incomelevel = incomelevel;
	}

	public String getLast_ip() {
		return last_ip;
	}

	public void setLast_ip(String last_ip) {
		this.last_ip = last_ip;
	}

	public Date getLast_visit() {
		return last_visit;
	}

	public void setLast_visit(Date last_visit) {
		this.last_visit = last_visit;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return String.format(
				"UserBean [id=%s, username=%s, password=%s, country=%s, province=%s, city=%s, occupation=%s, gender=%s, incomelevel=%s, last_ip=%s, last_visit=%s]",
				id, username, password, country, province, city, occupation, gender, incomelevel, last_ip, last_visit);
	}
}
