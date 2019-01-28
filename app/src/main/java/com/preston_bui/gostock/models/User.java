package com.preston_bui.gostock.models;

import java.util.ArrayList;

/**
 * Created by prestonbui on 1/27/19.
 */

public class User {

    private String name;
    private String email;
    private String password;
    private String created_at;
    private String token;
    private double balance;
    private ArrayList<String> watchList;
    private ArrayList<String> stocksHold;

    public User(String name, String email, String password, String created_at, String token, double balance, ArrayList<String> watchList, ArrayList<String> stocksHold) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.created_at = created_at;
        this.token = token;
        this.balance = balance;
        this.watchList = watchList;
        this.stocksHold = stocksHold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<String> getWatchList() {
        return watchList;
    }

    public void setWatchList(ArrayList<String> watchList) {
        this.watchList = watchList;
    }

    public ArrayList<String> getStocksHold() {
        return stocksHold;
    }

    public void setStocksHold(ArrayList<String> stocksHold) {
        this.stocksHold = stocksHold;
    }
}
