public class Veiculo {

    String modelo;
    int ano;

    public Veiculo(String modelo,int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }
    void acelerar() {
        System.out.println("Veiculo acelerando.");
    }

    void frear() {
        System.out.println("Veiculo freando.");
    }
}



