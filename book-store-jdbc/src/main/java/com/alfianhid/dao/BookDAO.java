package com.alfianhid.dao;
import com.alfianhid.model.Book;

import java.util.List;

public interface BookDAO {
    public void insertBook(Book bookData);
    public Book getBookByID(Integer bookID);
    public List<String> getBookList();
    public void updateBook(Book bookData, Integer bookID);
    public void deleteBook(Book bookData, Integer bookID);
}
