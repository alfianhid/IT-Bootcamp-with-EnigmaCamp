package com.alfianhid.dao;

import com.alfianhid.model.Book;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ImpBookDAO implements BookDAO {
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void insertBook(Book bookData) {
        try {
            Connection connection = dataSource.getConnection();
            String insertSQL = "INSERT INTO books (title,description,publisher,language," +
                    "year,page,stock,price) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement insertPS = connection.prepareStatement(insertSQL);
            insertPS.setString(1, bookData.getTitle());
            insertPS.setString(2, bookData.getDescription());
            insertPS.setString(3, bookData.getPublisher());
            insertPS.setString(4, bookData.getLanguage());
            insertPS.setInt(5, bookData.getYear());
            insertPS.setInt(6, bookData.getPage());
            insertPS.setInt(7, bookData.getStock());
            insertPS.setInt(8, bookData.getPrice());
            insertPS.execute();
            System.out.println("Success! Your book has been added to the database.");
            insertPS.close();
            connection.close();
        } catch (SQLException errors) {
            errors.printStackTrace();
        }
    }

    @Override
    public Book getBookByID(Integer bookID) {
        ResultSet resultSet = null;
        Book bookData = new Book();

        try {
            Connection connection = dataSource.getConnection();
            String getBookSQL = "SELECT * FROM books WHERE id = " + bookID;
            Statement getBookStat = connection.createStatement();
            resultSet = getBookStat.executeQuery(getBookSQL);

            if (resultSet.next()) {
                bookData.setId(resultSet.getInt("id"));
                bookData.setTitle(resultSet.getString("title"));
                bookData.setDescription(resultSet.getString("description"));
                bookData.setPublisher(resultSet.getString("publisher"));
                bookData.setLanguage(resultSet.getString("language"));
                bookData.setYear(resultSet.getInt("year"));
                bookData.setPage(resultSet.getInt("page"));
                bookData.setStock(resultSet.getInt("stock"));
                bookData.setPrice(resultSet.getInt("price"));
            } else {
                System.out.println("Sorry! Your book ID is not registered in the database yet.");
            }

            getBookStat.close();
            connection.close();
        } catch (SQLException errors) {
            errors.printStackTrace();
        }

        return bookData;
    }

    @Override
    public void updateBook(Book bookData, Integer bookID) {
        try {
            Connection connection = dataSource.getConnection();
            bookData.setId(bookID);
            String updateSQL = "UPDATE books SET title = ?, description = ?, publisher = ?," +
                    "language = ?, year = ?, page = ?, stock = ?, price = ? WHERE id = ?";
            PreparedStatement updatePS = connection.prepareStatement(updateSQL);

            updatePS.setString(1, bookData.getTitle());
            updatePS.setString(2, bookData.getDescription());
            updatePS.setString(3, bookData.getPublisher());
            updatePS.setString(4, bookData.getLanguage());
            updatePS.setInt(5, bookData.getYear());
            updatePS.setInt(6, bookData.getPage());
            updatePS.setInt(7, bookData.getStock());
            updatePS.setInt(8, bookData.getPrice());
            updatePS.setInt(9, bookData.getId());
            updatePS.executeUpdate();
            System.out.println("Success! Your book has been updated.");
            updatePS.close();
            connection.close();
        } catch (SQLException errors) {
            errors.printStackTrace();
        }
    }

    @Override
    public void deleteBook(Book bookData, Integer bookID) {
        try {
            Connection connection = dataSource.getConnection();
            bookData.setId(bookID);
            String deleteSQL = "DELETE FROM books WHERE id = ?";
            PreparedStatement deletePS = connection.prepareStatement(deleteSQL);

            deletePS.setInt(1, bookData.getId());
            deletePS.executeUpdate();
            System.out.println("Success! Your book has been deleted.");
            deletePS.close();
            connection.close();
        } catch (SQLException errors) {
            errors.printStackTrace();
        }
    }

    @Override
    public List<String> getBookList() {
        List<String> bookList = new ArrayList<>();
        Book bookData = new Book();

        try {
            Connection connection = dataSource.getConnection();
            String bookListSQL = "SELECT * FROM books";
            Statement bookListStat = connection.createStatement();
            ResultSet resultSet = bookListStat.executeQuery(bookListSQL);

            while (resultSet.next()) {
                bookData.setId(resultSet.getInt("id"));
                bookData.setTitle(resultSet.getString("title"));
                bookData.setDescription(resultSet.getString("description"));
                bookData.setPublisher(resultSet.getString("publisher"));
                bookData.setLanguage(resultSet.getString("language"));
                bookData.setYear(resultSet.getInt("year"));
                bookData.setPage(resultSet.getInt("page"));
                bookData.setStock(resultSet.getInt("stock"));
                bookData.setPrice(resultSet.getInt("price"));
                bookList.add(String.valueOf(bookData));
            }

            bookListStat.close();
            connection.close();
        } catch (SQLException errors) {
            errors.printStackTrace();
        }

        return bookList;
    }
}
