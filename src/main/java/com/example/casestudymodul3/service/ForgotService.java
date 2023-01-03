package com.example.casestudymodul3.service;

import com.example.casestudymodul3.dao.ForgotDAO;
import com.example.casestudymodul3.model.Account;

public class ForgotService {
    ForgotDAO forgotDAO = new ForgotDAO();
    public Account finduser(String username){
        return forgotDAO.finduser(username);
    }
    public boolean updatepass(Account account){
        return forgotDAO.updatepass(account);
    }

}
