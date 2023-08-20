/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/*Write a program in Java to demonstrate use of synchronization of threads when multiple threads
are trying to update common variable.*/

class  Table{

    public static synchronized void printTable(int n){
    
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
        System.out.println("Next");
    }
    
}

class MyThread extends Thread{
    @Override
    public void run(){
    
        Table.printTable(5);
    }
}

class MyThread1 extends Thread{

    @Override
    public void run(){
    
        Table.printTable(10);
    }
}

public class syncronize {
    public static void main(String[] args) {
      
    MyThread t1=new MyThread();
    MyThread1 t2=new MyThread1();
         t1.start();
         t2.start();
    }
}

