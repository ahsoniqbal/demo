package com.ahsan.demo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "questions")
public class Question {
		
	@NotNull
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

//	@NotNull
//	@NotEmpty
//	@Size(min = 6, max = 50)
//	private String title;

	@NotNull
	@NotEmpty
	@Size(min = 10, max = 150)
	private String question;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="posted_at")
	private Date postedAt;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "asked_by_id")
	private User askedBy;
	

	public Question() {}
//	@NotNull @NotEmpty @Size(min = 6, max = 50) String title
	public Question(@NotNull Long id,
			@NotNull @NotEmpty @Size(min = 10, max = 150) String question, @NotNull Date postedAt,
			@NotNull User askedBy) {
		super();
		this.id = id;
//		this.title = title;
		this.question = question;
		this.postedAt = postedAt;
		this.askedBy = askedBy;
	}





	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	

//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}

	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public Date getPostedAt() {
		return postedAt;
	}


	public void setPostedAt(Date postedAt) {
		this.postedAt = postedAt;
	}


	public User getAskedBy() {
		return askedBy;
	}


	public void setAskedBy(User askedBy) {
		this.askedBy = askedBy;
	}
	
	
}