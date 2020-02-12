import java.util.Scanner;
import java.util.concurrent.*;

public class MyThreadPool {
    public static void main(String[] args) {
        System.out.print("Введите кол-во потоков: ");
        Scanner scanner = new Scanner(System.in);
        int in =scanner.nextInt();
        ExecutorService service = Executors.newFixedThreadPool(in);
        System.out.print("Введите кол-во заданий(которое должен обработать pool): ");
        int in1 =scanner.nextInt();

        for (int i = 0; i <= in1; i++) {
            Runnable work = new MyThread("" + i);
            service.execute(work);
        }

        service.shutdown();
        while (!service.isTerminated()) {
        }
        System.out.println("Все Thread завершены!!!");
    }
}