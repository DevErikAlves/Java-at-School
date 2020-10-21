
package com.mycompany.calculadora;


public class calculadora {

    public static void main(String[] args) {
    int num1_i = 7;
    int num2_i = 8;
    float num1_f = 7;
    float num2_f = 8;
    float nota_1 = 7;
    float nota_2 = 8;
    float peso_1 = 7;
    float peso_2 = 8;
    float media = 0;



        Calcula calcula = new Calcula();
        System.out.println(calcula.Media(num1_i, num2_i));
        System.out.println(calcula.Media(num1_f, num2_f));
        System.out.println(calcula.Media(nota_1, nota_2, peso_1, peso_2));

    }
    
}
