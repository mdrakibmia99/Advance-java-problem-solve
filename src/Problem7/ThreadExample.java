//Write a program that executes two threads. One thread displays "Threadl" every 2,000 milliseconds, 
//and the other displays "Thread2" every 4,000 milliseconds. Create the threads by extending the 
//Thread class
package Problem7;

//class DisplayThread extends Thread {
//    private String message;
//    private long interval;
//
//    public DisplayThread(String message, long interval) {
//        this.message = message;
//        this.interval = interval;
//    }
//
//    @Override
//    public void run() {
//        int i=0;
//        while (i<=1) {
//            System.out.println(message);
//            try {
//                Thread.sleep(interval);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            i++;
//        }
//    }
//}
class DisplayThread extends Thread{
 public String message;
 public int time;
 
   DisplayThread(String message,int time){
  this.message=message;
  this.time=time;}
 @Override
 public void run(){
  
     while(true){
         System.out.println(message);
         try{
             Thread.sleep(time);
         }catch(Exception e){
             System.out.println(e.getMessage());}
         
     }
 }

}

public class ThreadExample {
    public static void main(String[] args) {
//        DisplayThread thread1 = new DisplayThread("Thread1", 2000);
//        DisplayThread thread2 = new DisplayThread("Thread2", 4000);

//        thread1.start();
//        thread2.start();

DisplayThread newThread=new DisplayThread("ONe",1000);
 newThread.start();
 DisplayThread newThread2=new DisplayThread("Two",1000);

 newThread2.start();
 

    }
}

