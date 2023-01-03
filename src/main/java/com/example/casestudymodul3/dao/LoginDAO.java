package com.example.casestudymodul3.dao;

import com.example.casestudymodul3.model.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    private Connection connection = ConnectionMysql.getConnection();
    public Account checklogin(String username){
        String sql = "select * from accounts where username =?";
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
        }
        return null;
    }

    public String checkpass(String username){
        String sql = "select pasword from accounts where username=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            String password = resultSet.getString("pasword");
            return password;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


}
