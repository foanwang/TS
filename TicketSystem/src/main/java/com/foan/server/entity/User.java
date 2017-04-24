package com.foan.server.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User implements Serializable{
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "uid")
	private String uid;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "roleid")
	private int roleid;
	
	@Column(name = "memo")
	private String memo;
	 
	@Column(name = "createtime")
	private Date Datetime;
	
	public User(){}
	
	public User(User user){
		this.id = user.getId();
		this.uid = user.getUid();
		this.password = user.getPassword();
		this.roleid = user.getRoleid();
		this.memo = user.getMemo();
//		Date now = new Date();
//		String pattern = "YYYY-MM-DD HH:MM:SS";
//		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
//		String mysqlDateString = formatter.format(now);
//		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd:HH:mm:ss");
//		Date current = new Date();
		this.Datetime = new Date();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleId(int roleId) {
		this.roleid = roleId;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getDatetime() {
		return Datetime;
	}

	public void setDatetime(Date datetime) {
		Datetime = datetime;
	}
	
}
