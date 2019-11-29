public class MyThread implements Runnable{
    @Override
    public void run() {

    }

    public static void main(String[] args) {
        Runnable target;
        Thread t = new Thread(new MyThread());
        t.start();
    }
}
