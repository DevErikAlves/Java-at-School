package atv;

public class Celta {
    public static void main(String args[]){
        Atv c1 = new Atv();
        c1.marca = "Chevrolet";
        c1.modelo = "Celta";
        c1.ano = 2005;
        c1.cor = "Azul-Alguma coisa";
        c1.valor = 5000;
        c1.placa = "OIE-1234";
        c1.portas = 2;
        
        c1.ligar();
        c1.desligar();
        c1.status();
        c1.acelerar();
    }
}
