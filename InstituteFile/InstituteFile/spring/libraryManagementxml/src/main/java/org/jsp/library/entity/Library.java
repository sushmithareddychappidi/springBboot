package org.jsp.library.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the library database table.
 * 
 */
@Entity
@Table(name="library")
@NamedQuery(name="Library.findAll", query="SELECT l FROM Library l")
public class Library implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private String bookid;

	@Column(nullable=false, length=45)
	private String bookauthor;

	@Column(nullable=false, length=45)
	private String bookname;

	@Column(nullable=false, length=45)
	private String libraryname;

	@Column(nullable=false)
	private int noofbooks;

	@Column(nullable=false, length=45)
	private String publisheddate;

	public Library() {
	}

	public String getBookid() {
		return this.bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	public String getBookauthor() {
		return this.bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	public String getBookname() {
		return this.bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getLibraryname() {
		return this.libraryname;
	}

	public void setLibraryname(String libraryname) {
		this.libraryname = libraryname;
	}

	public int getNoofbooks() {
		return this.noofbooks;
	}

	public void setNoofbooks(int noofbooks) {
		this.noofbooks = noofbooks;
	}

	public String getPublisheddate() {
		return this.publisheddate;
	}

	public void setPublisheddate(String publisheddate) {
		this.publisheddate = publisheddate;
	}

}