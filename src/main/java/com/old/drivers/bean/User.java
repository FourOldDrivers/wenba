package com.old.drivers.bean;

import java.sql.Date;
import java.util.ArrayList;

/**
 * �û���
 * 
 * @author Xyu
 *
 */

public class User {

	/**
	 * 用户id
	 */
	private Long id;

	/**
	 * 用户名
	 */
	private String name;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 注册时间
	 */
	private Date date;

	/**
	 * 昵称
	 */
	private String nick;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 状态 0：打开，1：关闭
	 */
	private int state;

	/**
	 * �绰
	 */
	private String phone;

	/**
	 * 性别（默认男）
	 */
	private int sex;

	/**
	 *职业
	 */
	private String industry;

	/**
	 * 危险
	 */
	private String weChat;

	/**
	 * QQ号
	 */
	private String qq;

	/**
	 * 头像
	 */
	private String headImg;

	/**
	 * 用户问题列表
	 */
	private ArrayList<Question> questions = new ArrayList<Question>();

	/**
	 * 用户回答列表
	 */
	private ArrayList<Answer> answers = new ArrayList<Answer>();

	/**
	 * 用户评论列表
	 */
	private ArrayList<Comment> comments = new ArrayList<Comment>();

	/**
	 * 用户粉丝列表
	 */
	private ArrayList<User> fans = new ArrayList<User>();

	public User() {
	}

	/**
	 * @param name
	 * @param password
	 * @param nick
	 * @param email
	 */
	public User(String name, String password, String nick, String email) {
		super();
		this.name = name;
		this.password = password;
		this.nick = nick;
		this.email = email;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * @return the nick
	 */
	public String getNick() {
		return nick;
	}

	/**
	 * @param nick
	 *            the nick to set
	 */
	public void setNick(String nick) {
		this.nick = nick;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

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

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the sex
	 */
	public int getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(int sex) {
		this.sex = sex;
	}

	/**
	 * @return the industry
	 */
	public String getIndustry() {
		return industry;
	}

	/**
	 * @param industry
	 *            the industry to set
	 */
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	/**
	 * @return the weChat
	 */
	public String getWeChat() {
		return weChat;
	}

	/**
	 * @param weChat
	 *            the weChat to set
	 */
	public void setWeChat(String weChat) {
		this.weChat = weChat;
	}

	/**
	 * @return the qq
	 */
	public String getQq() {
		return qq;
	}

	/**
	 * @param qq
	 *            the qq to set
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}

	/**
	 * @return the headImg
	 */
	public String getHeadImg() {
		return headImg;
	}

	/**
	 * @param headImg
	 *            the headImg to set
	 */
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	/**
	 * @return the questions
	 */
	public ArrayList<Question> getQuestions() {
		return questions;
	}

	/**
	 * @param questions
	 *            the questions to set
	 */
	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}

	/**
	 * 增加一个问题
	 * 
	 * @param question
	 */
	public void addQuestion(Question question) {
		questions.add(question);
	}

	/**
	 * @return the answers
	 */
	public ArrayList<Answer> getAnswers() {
		return answers;
	}

	/**
	 * @param answers
	 *            the answers to set
	 */
	public void setAnswers(ArrayList<Answer> answers) {
		this.answers = answers;
	}

	/**
	 * ��ӻش�
	 * 
	 * @param answer
	 */
	public void addAnswer(Answer answer) {
		answers.add(answer);
	}

	/**
	 * @return the comments
	 */
	public ArrayList<Comment> getComments() {
		return comments;
	}

	/**
	 * @param comments
	 *            the comments to set
	 */
	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}

	/**
	 * �������
	 * 
	 * @param comment
	 */
	public void addComment(Comment comment) {
		comments.add(comment);
	}

	/**
	 * @return the fans
	 */
	public ArrayList<User> getFans() {
		return fans;
	}

	/**
	 * @param fans
	 *            the fans to set
	 */
	public void setFans(ArrayList<User> fans) {
		this.fans = fans;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", nick=" + nick + ", email=" + email
				+ ", phone=" + phone + ", sex=" + sex + ", industry=" + industry + ", weChat=" + weChat + ", qq=" + qq
				+ ", headImg=" + headImg + ", questions=" + questions + ", answers=" + answers + ", comments="
				+ comments + ", fans=" + fans + "]";
	}

}
