package com.bni.bookshop.service;

import com.bni.bookshop.constant.ResponseMessage;
import com.bni.bookshop.entity.Book;
import com.bni.bookshop.exception.DataNotFoundException;
import com.bni.bookshop.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getBookById(Integer id) {
        verifyId(id);
        return bookRepository.findById(id).get();
    }

    @Override
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public Book updateBook(Book book) {
        verifyId(book.getId());
        return bookRepository.save(book);
    }

    @Override
    public void deleteBookById(Integer id) {
        verifyId(id);
        bookRepository.deleteById(id);
    }

    private void verifyId(Integer id){
        if(!bookRepository.findById(id).isPresent()){
            String message = String.format(ResponseMessage.NOT_FOUND_MESSAGE, "book", id);
            throw new DataNotFoundException(message);
        }
    }
}
