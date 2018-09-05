package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("boo")
public class Books {
	
	
	private String book1;
	private String book2;
	public void setBook1(String book1) {
		this.book1 = book1;
	}
	public void setBook2(String book2) {
		this.book2 = book2;
	}
	@Override
	public String toString() {
		return "Books [book1=" + book1 + ", book2=" + book2 + "]";
	}

}
