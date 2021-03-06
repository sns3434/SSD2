package com.example.jpetstore.dao;


import java.util.List;
import org.springframework.dao.DataAccessException;
import com.example.jpetstore.domain.Account;

public interface SellerDao {

  Account getAccount(String username) throws DataAccessException;

  Account getAccount(String username, String password) throws DataAccessException;

  void insertAccount(Account account) throws DataAccessException;

  void updateAccount(Account account) throws DataAccessException;
  
  List<String> getUsernameList() throws DataAccessException;
  

public interface SellerDao {


}
