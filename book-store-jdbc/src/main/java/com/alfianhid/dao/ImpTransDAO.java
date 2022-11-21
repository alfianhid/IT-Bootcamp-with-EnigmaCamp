package com.alfianhid.dao;

import com.alfianhid.model.Book;
import com.alfianhid.model.Transaction;

import javax.sql.*;
import java.sql.*;
import java.util.List;

public class ImpTransDAO implements TransDAO {
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void purchaseBook(Integer bookID, Integer memberID, Transaction trans) {
        Book bookData = new Book();
        Transaction transData = new Transaction();
        Integer stock = null;
        Integer qty = 0;
        Integer price = null;
        ResultSet resultSet = null;

        try {
            Connection connection = dataSource.getConnection();
            connection.setAutoCommit(false);

            // Get stock & price from book tabel
            bookData.setId(bookID);
            String getBookDetails = "SELECT stock, price FROM books WHERE id = ?";
            PreparedStatement getBookStat = connection.prepareStatement(getBookDetails);
            getBookStat.setInt(1,bookData.getId());

            resultSet = getBookStat.executeQuery();
            if (resultSet.next()) {
                stock = resultSet.getInt("stock");
                price = resultSet.getInt("price");
                System.out.println("Success! Stock and price data has been retrieved.");
            } else {
                System.out.println("Sorry! We are failed in retrieving your data.");
            }
            getBookStat.close();

            // Insert to transaction table
            String insertTrans = "INSERT INTO transactions (date,member_id,book_id,qty,total)" +
                    "VALUES (?,?,?,?,?)";
            transData.setMemberID(memberID);
            transData.setBookID(bookID);
            transData.setQty(trans.getQty());
            transData.setTotal(transData.getQty(),price);
            PreparedStatement insertPS = connection.prepareStatement(insertTrans);
            insertPS.setString(1, transData.getDate());
            insertPS.setInt(2, transData.getMemberID());
            insertPS.setInt(3, transData.getBookID());
            insertPS.setInt(4, transData.getQty());
            insertPS.setInt(5, transData.getTotal());
            insertPS.executeUpdate();
            System.out.println("Success! Transaction has been added to the database.");
            insertPS.close();

            // Update stock in book table
            bookData.setId(bookID);
            String updateStock = "UPDATE books SET stock = ? WHERE id = ?";
            bookData.setStock(stock,qty);
            PreparedStatement updatePS = connection.prepareStatement(updateStock);
            updatePS.setInt(1, bookData.getStock());
            updatePS.setInt(2, bookData.getId());
            updatePS.executeUpdate();
            System.out.println("Success! Stock data has been updated.");
            updatePS.close();

            connection.commit();
            connection.close();
        } catch (SQLException errors) {
            errors.printStackTrace();
        }
    }

    @Override
    public List<String> getTransList() {
        return null;
    }
}
