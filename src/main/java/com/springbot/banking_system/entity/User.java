package com.springbot.banking_system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity         // used to map to the table in db (schema/db == banking_app)
@Table(name = "accounts", schema = "banking_app")
public class User {  // each attribute in this class corresponds to a column in accounts table
  
  @Id       // declares id as primary key 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;  // maps to id column in table

  @Column(name = "account_holder_name", nullable = false)
  private String accountHolderName;
  
  @Column(nullable = false)
  private double balance;

  public long getid()
  {
    return id;
  }
  public void setid(long id){
    this.id = id;
  }
  public String getaccountHolderName()
  {
    return accountHolderName;
  }
  public void setaccountHolderName(String accountHolderName){
    this.accountHolderName = accountHolderName;
  }
  public double getbalance()
  {
    return balance;
  }
  public void setbalance(double balance){
    this.balance = balance;
  }

}
