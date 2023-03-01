public class PingPongT extends Thread {
    private boolean running;
    private String ausgabe;
    public PingPongT(String message){
        this.ausgabe = message;
    }

    @Override
    public void run() {
        running = true;
        while(running==true){
            System.out.println(ausgabe);
        }
    }
    public void end(){
        running = false;
    }
}
