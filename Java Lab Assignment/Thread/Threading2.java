public class Threading2 extends Thread{
    public void run(){
        int x = 100;
        while (x-->0){
            System.out.println("Thread 2 is Runnning!!!");
        }
    }
}