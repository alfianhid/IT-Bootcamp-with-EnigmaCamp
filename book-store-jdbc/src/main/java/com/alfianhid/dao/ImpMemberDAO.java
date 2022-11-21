package com.alfianhid.dao;

import com.alfianhid.model.Member;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ImpMemberDAO implements MemberDAO {
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void insertMember(Member memberData) {
        try {
            Connection connection = dataSource.getConnection();
            String insertSQL = "INSERT INTO members (first_name,last_name,email," +
                    "username,password) VALUES (?,?,?,?,?)";
            PreparedStatement insertPS = connection.prepareStatement(insertSQL);
            insertPS.setString(1, memberData.getFirstName());
            insertPS.setString(2, memberData.getLastName());
            insertPS.setString(3, memberData.getEmail());
            insertPS.setString(4, memberData.getUsername());
            insertPS.setString(5, memberData.getPassword());
            insertPS.execute();
            System.out.println("Success! Member has been added to the database.");
            insertPS.close();
            connection.close();
        } catch (SQLException errors) {
            errors.printStackTrace();
        }
    }

    @Override
    public Member getMemberByID(Integer memberID) {
        ResultSet resultSet = null;
        Member memberData = new Member();

        try {
            Connection connection = dataSource.getConnection();
            String getMemberSQL = "SELECT * FROM members WHERE id = " + memberID;
            Statement getMemberStat = connection.createStatement();
            resultSet = getMemberStat.executeQuery(getMemberSQL);

            if (resultSet.next()) {
                memberData.setId(resultSet.getInt("id"));
                memberData.setFirstName(resultSet.getString("first_name"));
                memberData.setLastName(resultSet.getString("last_name"));
                memberData.setEmail(resultSet.getString("email"));
                memberData.setUsername(resultSet.getString("username"));
                memberData.setPassword(resultSet.getString("password"));
            } else {
                System.out.println("Sorry! Your member ID is not registered in the database yet.");
            }

            getMemberStat.close();
            connection.close();
        } catch (SQLException errors) {
            errors.printStackTrace();
        }

        return memberData;
    }

    @Override
    public List<String> getMemberList() {
        List<String> memberList = new ArrayList<>();
        Member memberData = new Member();

        try {
            Connection connection = dataSource.getConnection();
            String memberListSQL = "SELECT * FROM members";
            Statement memberListStat = connection.createStatement();
            ResultSet resultSet = memberListStat.executeQuery(memberListSQL);

            while (resultSet.next()) {
                memberData.setId(resultSet.getInt("id"));
                memberData.setFirstName(resultSet.getString("first_name"));
                memberData.setLastName(resultSet.getString("last_name"));
                memberData.setEmail(resultSet.getString("email"));
                memberData.setUsername(resultSet.getString("username"));
                memberData.setPassword(resultSet.getString("password"));
                memberList.add(String.valueOf(memberData));
            }

            memberListStat.close();
            connection.close();
        } catch (SQLException errors) {
            errors.printStackTrace();
        }

        return memberList;
    }

    @Override
    public void updateMember(Member memberData, Integer memberID) {
        try {
            Connection connection = dataSource.getConnection();
            memberData.setId(memberID);
            String updateSQL = "UPDATE members SET first_name = ?, last_name = ?, email = ?," +
                    "username = ?, password = ? WHERE id = ?";
            PreparedStatement updatePS = connection.prepareStatement(updateSQL);

            updatePS.setString(1, memberData.getFirstName());
            updatePS.setString(2, memberData.getLastName());
            updatePS.setString(3, memberData.getEmail());
            updatePS.setString(4, memberData.getUsername());
            updatePS.setString(5, memberData.getPassword());
            updatePS.setInt(6, memberData.getId());
            updatePS.executeUpdate();
            System.out.println("Success! Member data has been updated.");
            updatePS.close();
            connection.close();
        } catch (SQLException errors) {
            errors.printStackTrace();
        }
    }

    @Override
    public void deleteMember(Member memberData, Integer memberID) {
        try {
            Connection connection = dataSource.getConnection();
            memberData.setId(memberID);
            String deleteSQL = "DELETE FROM members WHERE id = ?";
            PreparedStatement deletePS = connection.prepareStatement(deleteSQL);

            deletePS.setInt(1, memberData.getId());
            deletePS.executeUpdate();
            System.out.println("Success! Member has been deleted.");
            deletePS.close();
            connection.close();
        } catch (SQLException errors) {
            errors.printStackTrace();
        }
    }
}
