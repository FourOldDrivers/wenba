package com.old.drivers.bean;

import java.sql.Date;
import java.util.ArrayList;

/**
 * 答案
 * 
 * @author Xyu
 *
 */
public class Answer {
	/*
	 * 回答的编号
	 */
	private Long id;

	/*
	 * 回答的内容
	 */
	private String content;

	/*
	 * 回答的时间
	 */
	private Date time;

	/*
	 * 回答的状态
	 */
	private int state;

	/*
	 * 回答的评论列表
	 */
	private ArrayList<Comment> answersList = new ArrayList<Comment>();

	public Answer() {

	}

	public Answer(String content, Date time, int state, ArrayList<Comment> answersList) {
		super();
		this.content = content;
		this.time = time;
		this.state = state;
		this.answersList = answersList;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public ArrayList<Comment> getAnswersList() {
		return answersList;
	}

	public void setAnswersList(ArrayList<Comment> answersList) {
		this.answersList = answersList;
	}

	public void addComment(Comment comment) {
		answersList.add(comment);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void removeComment(Comment comment) {
		answersList.remove(comment);
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", content=" + content + ", time=" + time + ", state=" + state + ", answersList="
				+ answersList + "]";
	}

}
