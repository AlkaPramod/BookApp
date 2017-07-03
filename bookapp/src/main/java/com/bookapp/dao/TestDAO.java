package com.bookapp.dao;

import com.bookapp.model.Book;

public class TestDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book();
		
		book.setName("java");
		book.setPrice(200);
		BookDAO dao =new BookDAO();
		dao.save(book);
		System.out.println("inserted");


	}

}
