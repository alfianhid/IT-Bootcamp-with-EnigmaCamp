package com.alfianhid.dao;

import com.alfianhid.model.Book;
import com.alfianhid.model.Member;
import com.alfianhid.model.Transaction;

import java.util.List;

public interface TransDAO {
    public void purchaseBook(Integer bookID, Integer memberID, Transaction trans);
    public List<String> getTransList();
}
