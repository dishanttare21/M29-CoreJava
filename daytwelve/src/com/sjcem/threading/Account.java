package com.sjcem.threading;

public class Account {
	private int id;
	private String name;
	private int balance;
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	//methods
	public void deposit(int amount) {
		balance += amount;
	}
	
	public synchronized void withdraw(int amount) {
		balance -= amount;
	}
	
	
}
