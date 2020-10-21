
package celular;


public class Celular {

    public static void main(String[] args) {
   
        ClasseCelular cell = new ClasseCelular();
        
        cell.marca = "Xiaomi";
        cell.modelo = "Redmi Note 8";
        cell.ano = 2019;
        cell.cor = "Pearly white";
        cell.imei = 123456;
        cell.semChip();
        cell.numeroChip = 1234571;
        cell.ligar();
        cell.comCamera();
        cell.valor = 1400;
        cell.status();
        cell.ligacao();
        cell.sms();
        cell.tirarFoto();
        
      
    }
    
}
