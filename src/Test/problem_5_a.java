/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;
class UserdeficeException extends Exception{public UserdeficeException(String message) {super(message);}}
class Calculator {
  int calculate(int bajjo,int bajok) throws UserdeficeException{
   if(bajok==0){ throw new UserdeficeException("0 diya ki bag kora jay??");} return bajjo/bajok;
  }
}



public class problem_5_a {
    public static void main(String[] args) {
         Calculator calculator=new Calculator();
         try{
           int result = calculator.calculate(10, 0);
             System.out.println(result);
         }catch(Exception e){System.out.println(e.getMessage());}
        System.out.println("this is last line");
    }
    
   
}
