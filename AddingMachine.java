package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history = "0";
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {		//A method that returns the total
    return total;
  }
  
  public void add (int value) { //Method that adds a passed integer to the total variable
	  total = total + value;
	  history += " + " + value;
  }

  public void subtract (int value) { //Method that subtracts a passed integer from the total variable
	  total = total - value;
	  history += " - " + value;

  }

  public String toString () {	//A method that returns the history of transactions
    return history;
  }

  public void clear() {		//A method that clears the variables of AddingMachine
  total = 0;
  history = "0";
  }
}