import java.time.Duration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner inTastiera = new Scanner(System.in);
        System.out.println("Inserisci il numero di battiti di ali: ");
        int num_battiti = inTastiera.nextInt();

        Cacciatore sangiorgio = new Cacciatore("Giorgio");
        Thread Drago1 = new Thread(new Drago(num_battiti,"Argo"));
        Drago1.start();

        sangiorgio.lanciaDardi(Drago1);

        for ( int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(Duration.ofMillis(500));
            } catch (InterruptedException e) {
                System.out.println("sleep error"+e);
            }
            System.out.println("main continua a fare cose .. i = " + i);
        }
    }
}