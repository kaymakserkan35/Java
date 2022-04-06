
package multithreading.anonim;


public class MultiThreadingAnonim {


    public static void main(String[] args) {
        
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                  System.out.println("myThread çalışıyor....");
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(500);
                    System.out.println(String.valueOf(i));
                }
                 System.out.println("myThread sonan erdi....");
            }
        });
        
        myThread.start();
        System.out.println("main thread çalışıyor....");
    }
    
}
