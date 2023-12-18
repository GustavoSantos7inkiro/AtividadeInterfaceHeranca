public class Motocicleta extends Veiculo implements Ligavel {

    public Motocicleta(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void ligar() {
        System.out.println("Motocicleta ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("Motocicleta desligada.");
    }

    void empinar() {
        System.out.println("Motocicleta empinando.");
    }
}
