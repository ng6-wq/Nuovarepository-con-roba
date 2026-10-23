import java.time.Duration;

public class Cacciatore {
    private String nome;
    public Cacciatore(String nome){
        this.nome = nome;
    }
    public void lanciaDardi(Thread d){
        for ( int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(Duration.ofMillis(10));
            } catch (InterruptedException e) {
                System.out.println("sleep error"+e);
            }
            System.out.println("il cacciatore"+nome+" sta lanciando il dardo = " + i);
            d.interrupt();
        }
    }
}
