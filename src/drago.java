public class drago implements Runnable {

    String nome;
    int num_battiti;

    public void drago(String nome, int num_battiti) {
        this.nome = nome;
        this.num_battiti = num_battiti;

    }

    public void run() {
        for (int i = 0; i < num_battiti; i++) {
            System.out.println(this.nome + " battito ali " + (i + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}