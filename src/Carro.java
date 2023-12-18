public class Carro extends Veiculo implements Ligavel {

    public Carro(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void ligar() {
        System.out.println("Carro ligado.");

    }

    @Override
    public void desligar() {
        System.out.println("Carro desligado.");
    }

    void abrirPorta() {
        System.out.println("Porta do carro aberta.");
    }
}

