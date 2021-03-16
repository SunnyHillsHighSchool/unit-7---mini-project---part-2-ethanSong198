//Programmers: Ethan Song and Quinn Cassady

import java.util.ArrayList;

public class Loan{
  //instance variables 
  private int ID; 
  private double loanAmount;
  private String country;
  private int daysToFund;
  int numLenders;
  
  //constructor
  public Loan(int ID, double loanAmount, String country, int daysToFund, int numLenders)
  {
    this.ID = ID;
    this.loanAmount = loanAmount;
    this.country = country;
    this.daysToFund = daysToFund;
    this.numLenders = numLenders;
  }

  //accessor methods
  public int getID()
  {
    return ID;
  }

  public double getLoanAmount()
  {
    return loanAmount;
  }

  public String getCountry()
  {
    return country;
  }

  public int getDaysToFund()
  {
    return daysToFund;
  }

  public int getNumLenders()
  {
    return numLenders;
  }

  //modifier methods
  public void setID(int newID)
  {
    ID = newID;
  }
  public void setLoanAmount(double newAmount)
  {
    loanAmount = newAmount;
  }
  public void setCountry(String newCountry)
  {
    country = newCountry;
  }
  public void setDaysToFund(int newDays)
  {
    daysToFund = newDays;
  }
  public void setNumLenders(int newNum)
  {
    numLenders = newNum;
  }
  
  //toString method 
  public String toString()
  {
    return "ID: " + ID + " loan amount: " + loanAmount + " country: " + country + " days to fund: " + daysToFund + " num lenders: " + numLenders;
  }


}