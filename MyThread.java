public class MyThread implements Runnable {

        private String zadanie;

        public MyThread(String k){
            this.zadanie=k;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+" Начал выполнять задание - "+zadanie);
            processSlip();
            System.out.println(Thread.currentThread().getName()+" Закончил.");
        }

        private void processSlip() {
            try {
                Thread.sleep(999);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}
