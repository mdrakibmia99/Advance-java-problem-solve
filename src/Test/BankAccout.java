//Create a simple Java program to create a banking application in which the user deposits 
//BDT 1000 and begins withdrawing BDT 500, BDT 400, and then encounters an exception 
//with the message "Not Sufficient Fund" when the user withdraws BDT 300.
package Test;

class BallanceSuficient extends Exception {BallanceSuficient(String message) {super(message);}}

class BankAccount{
  private int ballance;
  public BankAccount(int balllance){
  this.ballance=balllance;
  }
  
  void deposit(int money){
   ballance+=money;
      System.out.println("Deposit="+money);
      System.out.println("Current Money="+ballance);
  }
  
  void withdraw(int money) throws BallanceSuficient{
   if(ballance >= money){
     ballance-=money;
       System.out.println("Withdraw="+money);
       System.out.println("Current Ballence="+ballance);
   }else{
   
    throw new BallanceSuficient("Tk besi nai dite parmo na !!");
   }}
  void getBallece(){System.out.println("Ballence="+ballance);  }
  
  

}

public class BankAccout {
    public static void main(String[] args) {
         BankAccount  account= new BankAccount(1000);
         account.getBallece();
         account.deposit(500);
         try{
         
         account.withdraw(500);
         account.withdraw(500);
         account.deposit(100);
         account.withdraw(600);
         account.withdraw(600);
         }catch(BallanceSuficient e){System.out.println(e.getMessage());}
         
    }
}
