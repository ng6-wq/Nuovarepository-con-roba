import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    Scanner inTastiera = new Scanner(System.in);
    System.out.println("Inserisci il numero di battiti: ");
    int num_battiti = inTastiera.nextInt();

    Thread Paolo = new Thread(new drago());

    }


}