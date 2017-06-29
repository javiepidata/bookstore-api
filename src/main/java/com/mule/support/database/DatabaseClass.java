package com.mule.support.database;

import java.util.HashMap;
import java.util.Map;

import com.mule.support.model.Book;

public class DatabaseClass {
	
	private static Map<Integer, Book> books = new HashMap<>();
	public static Integer NEXT_ID = 0;
	
	public static Map<Integer, Book> getBooks(){
		Book book1 = createBook(NEXT_ID++, "Roberto Fontanarrosa", "El mundo ha vivido equivocado", 347);
		Book book2 = createBook(NEXT_ID++, "Eduardo Mendoza", "Sin noticias de Gurb", 426);
		Book book3 = createBook(NEXT_ID++, "John Kennedy Toole", "La conjura de los necios", 538);
		books.put(book1.getId(), book1);
		books.put(book2.getId(), book2);
		books.put(book3.getId(), book3 );
		return books;
	}
	
	public static Book createBook(Integer id, String author, String title, Integer pages){
		Book book = new Book();
		book.setId(id);
		book.setAuthor(author);
		book.setTitle(title);
		book.setPages(pages);
		return book;
	}

}
