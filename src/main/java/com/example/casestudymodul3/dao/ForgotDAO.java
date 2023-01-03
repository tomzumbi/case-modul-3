package com.example.casestudymodul3.dao;

import com.example.casestudymodul3.model.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ForgotDAO {
    private Connection connection = ConnectionMysql.getConnection();
    private Account account = new Account();
    public Account finduser(String username){
        String sql = "SELECT * from accounts WHERE username = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            String password = resultSet.getString("pasword");
            String email = resultSet.getString("email");
            String phone = resultSet.getString("phone");
            String address = resultSet.getString("address");
            String role = resultSet.getString("role");
            String status = resultSet.getString("status");
            String avatarurl = resultSet.getString("avatarurl");
            int idrole = resultSet.getInt("idrole");
            return new Account(username,password,email,phone,address,role,status,avatarurl,idrole);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public boolean updatepass(Account account1){
        String sql = "UPDATE casemodul3.accounts SET pasword = ? WHERE username = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,account1.getPassword());
            preparedStatement.setString(2,account1.getUsername());
            return preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
