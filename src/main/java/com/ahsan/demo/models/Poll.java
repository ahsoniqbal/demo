package com.ahsan.demo.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "poll")
public class Poll {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String body;
	private Integer votes;
	
	@ManyToOne
	private Question question;
	private Date created_at;

	
	public Poll() {}
	public Poll(Integer id, String body, Integer votes, Question question, Date created_at) {
		super();
		this.id = id;
		this.body = body;
		this.votes = votes;
		this.question = question;
		this.created_at = created_at;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Integer getVotes() {
		return votes;
	}

	public void setVotes(Integer votes) {
		this.votes = votes;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	
}
