/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

class Table{
 public static synchronized void multiplication(int n ){
      for (int i=1;i<=10;i++){
          System.out.println(n+"*"+ i + "=" + n*i);
      }
 } 
}

class ThreadOne extends Thread{
 @Override
 public void run(){
 Table.multiplication(10);}
}
class ThreadTwo extends Thread{
 public void run(){
  Table.multiplication(20);
 }
}
public class syncro {
    public static void main(String[] args) {
         ThreadOne one = new ThreadOne();
         ThreadTwo two= new ThreadTwo();
          one.start();
          two.start();
                 
    }
}
