public class Threading1 extends Thread{
    public void run(){
        int x = 100;
        while (x-->0){
            System.out.println("Thread 1 is Runnning!!!");
        }
    }
}