package atv;

public class Atv {
    String modelo;
    String cor;
    String placa;
    String marca;
    int ano;
    int valor;
    int portas;
    boolean ligado;
    
    void status(){
        System.out.println("Marca:"+this.marca);
        System.out.println("Modelo:"+this.modelo);
        System.out.println("Cor:"+this.cor);
        System.out.println("Valor:"+this.valor);
        System.out.println("Placa:"+this.placa);
        System.out.println("Quantidade de portas:"+this.portas);
        System.out.println("O carro está ligado? "+this.ligado);
    }
    
    void ligar(){
        this.ligado = true;
    }
    
    void desligar(){
        this.ligado = false;
    }
    
    void acelerar(){
        if(this.ligado == true){
            System.out.println("Zuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuum");
        }else{
            System.out.println("Não fez manuntenção, olha no que deu......");
        }
    }
}
