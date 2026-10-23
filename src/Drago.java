public class Drago implements Runnable {

    String nome;
    int num_battiti;

    public Drago( int num_battiti, String nome) {
        this.nome = nome;
        this.num_battiti = num_battiti;

    }
    @Override
    public void run(){

            for (int i = 0; i < num_battiti; i++) {
                System.out.println(this.nome + " battito ali " + (i + 1));

            }
        }


    }
