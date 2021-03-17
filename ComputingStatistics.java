import java.util.ArrayList;

public class ComputingStatistics {
   /**
   * The ArrayList containing all of the loan data.
   */
   private ArrayList<Loan> data;
   
   /**
    * Creates a new ComputingStatistics object with an empty ArrayList 
    */
   public ComputingStatistics() {
      data = new ArrayList<Loan>();
   }
   
   /**
    * Creates a new ComputingStatistics object with the data passed in
    */
   public ComputingStatistics(ArrayList<Loan> d) {
      data = d;
   }
   
   /**
    * Calclates the total amount funded from all of the loans in the file.
    * @return the total loan amount.
    */
   public double totalAmount() {
      double amount = 0.0;
      for(int i = 0; i < data.size(); i++) {
         amount = amount + data.get(i).getLoanAmount();
      }
      return amount;
   }

   public double avgLoan(){
     double average = this.totalAmount() / data.size();
     return average;
   }

////////////////////////////////////working methods /////////////////////////////////////

public double largestLoan(){
  //create int largest set as 0
  double largest = 0;
  //for each loop
  for(Loan x: data){
    //if loan at x is greater than largeset
    if(x.getLoanAmount() > largest){
      largest = x.getLoanAmount();
    }
  }

  //return largest
  return largest;
}

public double smallestLoan(){
  //create int smallest set as first loan
  double smallest = data.get(0).getLoanAmount();
  //for each loop
  for(Loan x: data){
    //if loan at x is lesser than largeset
    if(x.getLoanAmount() < smallest){
      smallest = x.getLoanAmount();
    }
  }

  //return smallest
  return smallest;
}

public String largestLoanCountry(){
  //create int variable index
  int index = 0;
  //create int variable largest
  double largest = 0;
  //for loop
  for(int x = 0; x < data.size(); x++){
    //if value at x is greater than largest
    if(data.get(x).getLoanAmount() > largest){
      //set value at x for largest
      largest = data.get(x).getLoanAmount();
      //set index at x
      index = x;
    }
  }

  //set String country as country at data index
  String country = data.get(index).getCountry();

  //return country
  return country;
}

public String smallestLoanCountry(){
  //create int variable index
  int index = 0;
  //create int variable smallest
  double smallest = data.get(0).getLoanAmount();
  //for loop
  for(int x = 0; x < data.size(); x++){
    //if value at x is lesser than smallest
    if(data.get(x).getLoanAmount() < smallest){
      //set value at x for smallest
      smallest = data.get(x).getLoanAmount();
      //set index at x
      index = x;
    }
  }

  //set String country as country at data index
  String country = data.get(index).getCountry();

  //return country
  return country;
}

public double avgDaysToFund(){
  //create double total
  double total = 0;
  //for each loop 
  for(Loan x: data){
    //add days to total
    total = total + x.getDaysToFund();
  }

  //return average
  return total/data.size();
}

public double largestLoanKenya(){
  //create double largest
  double largest = 0;

  //for each loop 
  for(Loan x: data){
    //if country at x is Kenya
    if(x.getCountry().equals("Kenya")){
      //if loan at x is larger than largest
      if(x.getLoanAmount() > largest){
        //set largest to loan
        largest = x.getLoanAmount();
      }

    }
  }

  //return largest
  return largest;
}

public double avgLoanPhilippines(){
  double total = 0;
  int loanCount = 0;
  for(Loan i:data){
    if(i.getCountry().equals("Philippines")){
      total += i.getLoanAmount();
      loanCount++;
    }
  }
  if(loanCount == 0){
    return 0;
  }
  return (double)total/loanCount;
}

public String longestToFundCountry(){
  int longest = Integer.MIN_VALUE;
  Loan longestLoan = data.get(0);
  for(Loan i:data){
    if(i.getDaysToFund() > longest){
      longest = i.getDaysToFund();
      longestLoan = i;
    }
  }
  return longestLoan.getCountry();
}

public double variance(){
  double sum = 0.0;
  for(Loan i:data){
    sum += Math.pow(i.getLoanAmount() - this.avgLoan(), 2);
  }
  return (double)sum/data.size(); 
  }
  public double standardDeviation(){
    return Math.sqrt(this.variance());
  }

public boolean empiricalRule(){
  int count = 0;
  double max = this.avgLoan() + this.standardDeviation();
  double min = this.avgLoan() - this.standardDeviation();
  for(Loan i:data){
    if(i.getLoanAmount() <= max && i.getLoanAmount() >= min){
      count++;
    }
  }
  System.out.println(count);
  int percent = (int)((double)count/data.size()*100);
  System.out.println(percent);
  if(percent == 68){
    return true;
  }
  else{
    return false;
  }
}
}