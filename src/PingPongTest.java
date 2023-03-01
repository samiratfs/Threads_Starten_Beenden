public class PingPongTest {
    public static void main(String[] args) {
        PingPongR thread1 = new PingPongR("Ping");
        PingPongR thread2 = new PingPongR("Pong");
        Thread t1 = new Thread(thread1);
        t1.start();
        Thread t2 = new Thread(thread2);
        t2.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
        thread1.end();
        thread2.end();

        PingPongT thread3 = new PingPongT("Ping");
        thread3.start();
        PingPongT thread4 = new PingPongT("Pong");
        thread4.start();
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){

        }
        thread3.end();
        thread4.end();
    }
}