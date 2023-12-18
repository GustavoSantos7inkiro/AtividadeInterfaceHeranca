public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro ("Fusca",1970);
        Motocicleta moto = new Motocicleta("Honda",2022);

        carro.ligar();
        carro.acelerar();
        carro.frear();
        carro.desligar();
        carro.abrirPorta();

        System.out.println();

        moto.ligar();
        moto.acelerar();
        moto.frear();
        moto.desligar();
        moto.empinar();

    }
}