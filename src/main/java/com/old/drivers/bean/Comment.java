package com.old.drivers.bean;

import java.sql.Date;

/**
 * 评论
 * 
 * @author Xyu
 *
 */
public class Comment {
	/*
	 * 评论的编号
	 */
	private Long id;
	
	/*
	 * 评论的内容
	 */
	private String content;
	
	/*
	 * 评论的时间
	 */
	private Date date;
	
	/*
	 * 评论的状态 
	 */
	private int state;
	
	public Comment(){
		
	}

	public Comment(String content, Date date, int state) {
		super();
		this.content = content;
		this.date = date;
		this.state = state;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", content=" + content + ", date=" + date + ", state=" + state + "]";
	}
	
	
}
