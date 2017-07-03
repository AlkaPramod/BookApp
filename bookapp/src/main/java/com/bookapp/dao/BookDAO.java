package com.bookapp.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bookapp.model.Book;
import com.bookapp.util.ConnectionUtil;

public class BookDAO
{

	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	
	
	public void save(Book book)
	{
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();



		String sql = "insert into Books(name,price) values(?,?)";
		Object[] params = { book.getName(), book.getPrice() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);

	}
}

	/*public void update(Book book) {

		String sql = "update Books set name=? where name=?";
		Object[] params = { book.getName(), book.getName() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows updated: " + rows);

	}

	public void delete(int id) {

		String sql = "delete from Books where name=?";
		int rows = jdbcTemplate.update(sql, id);
		System.out.println("No of rows deleted: " + rows);

	}

	}*/
