package com.springproject.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POST")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "POST_ID")
	Integer postId;

	@Column(name = "TITLE")
	String title;

	@Column(name = "POST_DATE")
	Date postDate;

	@Column(name = "POST_IMAGEM")
	String Imagem;

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPostDate() {

		return postDate;
	}

	public void setPostDate(Date date) {
		this.postDate = date;
	}

	public String getImagem() {
		return Imagem;
	}

	public void setImagem(String imagem) {
		Imagem = imagem;
	}

	public void mostra() {

		String mensagem = "";
		mensagem += "Título do Post: " + this.getTitle();
		mensagem += "\nData do Post: " + this.getPostDate();
		mensagem += "\nCaminho da Imagem: " + this.getImagem();
		System.out.println(mensagem);
	}

}
