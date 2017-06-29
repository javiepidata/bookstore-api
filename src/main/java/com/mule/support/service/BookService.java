package com.mule.support.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mule.module.apikit.exception.NotFoundException;

import com.mule.support.database.DatabaseClass;
import com.mule.support.exceptions.ConflictException;
import com.mule.support.model.Book;

public class BookService {
	private Map<Integer, Book> books = DatabaseClass.getBooks();

	public BookService() {
	}

	public List<Book> getAllBooks() {
		return new ArrayList<Book>(books.values());
	}

	public Book addBook(Book book) throws ConflictException {
		if (existsBook(book))
			throw new ConflictException("Book already exists");
		book.setId(DatabaseClass.NEXT_ID++);
		books.put(book.getId(), book);
		return book;
	}

	public boolean existsBook(Book book) {
		return books.containsValue(book);
	}

	public Book getBookByName(String name) {
		for (Map.Entry<Integer, Book> entry : books.entrySet()) {
			if (name.equals(entry.getValue().getTitle()))
				return entry.getValue();
		}
		return null;
	}

	public Book updateBook(Book book) throws NotFoundException {
		if (!books.containsKey(book.getId())) {
			throw new NotFoundException("Book " + book.getId() + " does not exist.");
		}
		books.put(book.getId(), book);
		return book;
	}

	public void deleteBook(String id) throws NotFoundException {
		Integer bookId = Integer.valueOf(id);
		if (id == null || !books.containsKey(bookId)) {
			throw new NotFoundException("Book " + id + " does not exist.");
		}
		books.remove(bookId);
	}

	public Book getBookById(String id) throws NotFoundException {
		Book book = books.get(Integer.valueOf(id));
		if (book == null)
			throw new NotFoundException("Book with id: " + id + " does not exist.");
		return book;
	}
}
