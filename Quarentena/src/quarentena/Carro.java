package quarentena;


public class Carro {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
      System.out.println("Modelo: " + this.modelo);
      System.out.print("Uma caneta" + this.cor);
      System.out.println("Ponta: " + this.ponta);
      System.out.println("Carga:" + this.carga);
      System.out.println(" está tampada? " + this.tampada);

    }
    void rabiscar(){
        if(this.tampada == true){
           System.out.println("ERRO! Não posso rabiscar");
        }else{
           System.out.println("Estou rabiscando");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void metodo(){
        this.tampada = false;
    }
}
