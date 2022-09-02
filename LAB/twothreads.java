class Thread1 implements Runnable {
    
    @Override
    public void run() {
        try {
            for(int i=1;i<=10;i++) {
                Thread.sleep(100);
                System.out.println(i);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Thread2 implements Runnable {

    @Override
    public void run() {
        try {
            String aj = "ABCDEFGHIJ";
            for(int i=0;i<aj.length();i++) {
                Thread.sleep(100);
                System.out.println(aj.charAt(i));
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

class TwoThreads {
    public static void main(String ar[]) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread myThread1 = new Thread(t1);
        Thread myThread2 = new Thread(t2);
        
        try {
            myThread1.start();
            myThread1.join();
            myThread2.start();
            myThread2.join();    
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}