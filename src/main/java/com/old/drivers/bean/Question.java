package com.old.drivers.bean;

import java.sql.Date;
import java.util.ArrayList;

/**
 * 问题类
 * 
 * @author Xyu
 *
 */
public class Question {

	/**
	 * 问题id
	 */
	private Long id;

	/**
	 * 问题内容
	 */
	private String content;

	/**
	 * 提问时间
	 */
	private Date date;

	/**
	 * 问题回答列表
	 */
	private ArrayList<Answer> answerList;

	/**
	 * 问题状态 0：打开回答，1：关闭回答，2：问题不可见
	 */
	private int state;

	public Question() {

	}

	public Question(String content, Date date, ArrayList<Answer> answerList, int state) {
		super();
		this.content = content;
		this.date = date;
		this.answerList = answerList;
		this.state = state;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the answerList
	 */
	public ArrayList<Answer> getAnswerList() {
		return answerList;
	}

	/**
	 * @param answerList
	 *            the answerList to set
	 */
	public void setAnswerList(ArrayList<Answer> answerList) {
		this.answerList = answerList;
	}

	/**
	 * 新增一个回答
	 * 
	 * @param answer
	 */
	public void addAnswer(Answer answer) {
		answerList.add(answer);
	};

	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(int state) {
		this.state = state;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Question [id=" + id + ", content=" + content + ", date=" + date + ", answerList=" + answerList
				+ ", state=" + state + "]";
	}

}
