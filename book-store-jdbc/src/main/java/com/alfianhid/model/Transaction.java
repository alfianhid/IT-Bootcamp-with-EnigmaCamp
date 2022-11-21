package com.alfianhid.model;

import org.springframework.format.annotation.DateTimeFormat;

public class Transaction {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String date;
    private Integer memberID, bookID, qty, price, total;

    public Transaction() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getMemberID() {
        return memberID;
    }

    public void setMemberID(Integer memberID) {
        this.memberID = memberID;
    }

    public Integer getBookID() {
        return bookID;
    }

    public void setBookID(Integer bookID) {
        this.bookID = bookID;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getTotal() {
        return qty * price;
    }

    public void setTotal(Integer qty, Integer price) {
        this.qty = qty;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", memberID=" + memberID +
                ", bookID=" + bookID +
                ", qty=" + qty +
                ", price=" + price +
                ", total=" + total +
                '}';
    }
}
