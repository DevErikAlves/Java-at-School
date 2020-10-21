package quarentena;

public class Quarentena {
    
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.rabiscar();
        c1.status();
    }
    
}
