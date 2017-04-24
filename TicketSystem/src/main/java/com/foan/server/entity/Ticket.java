package com.foan.server.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ticket")
public class Ticket implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "type")
	private int type;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "summary")
	private String summary;
	 
	@Column(name = "severity")
	private String severity;
	
	@Column(name = "priority")
	private String priority;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "createtime")
	private Date createtime; 
	
	@Column(name = "createuserid")
	private String createUserId; 
	
	@Column(name = "lastmodifyuserid")
	private String lastmodifyUserId;
	
	@Column(name = "memo")
	private String memo;
	
	public Ticket(){}
	
	public Ticket(Ticket ticket){
		this.type = ticket.getType();
		this.description = ticket.getDescription();
		this.title =  ticket.getTitle();
		this.summary = ticket.getSummary();
		this.severity = ticket.getSeverity();
		this.priority = ticket.getPriority();
		this.status = ticket.getStatus();
		this.createUserId = ticket.getCreateUserId();
		this.lastmodifyUserId =ticket.getLastmodifyUserId();
		this.memo = ticket.getMemo();
		System.out.println(" new Date():"+ new Date());
		this.createtime = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public String getLastmodifyUserId() {
		return lastmodifyUserId;
	}

	public void setLastmodifyUserId(String lastmodifyUserId) {
		this.lastmodifyUserId = lastmodifyUserId;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	};
}
