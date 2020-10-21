
package com.mycompany.calculadora;

public class Calcula {
    public int Media(int x, int y){
    int r;
    System.out.println("Cálculo de Média de Inteiros");
    r = (x + y)/2;

    return r;
    }

        public float Media(float x, float y){
        float r;
        System.out.println("Cálculo de Média de floats");
        r = (x + y)/2;

        return r;
        }
            public float Media(float nota_1, float nota_2, float peso_1, float peso_2){
            float media;
            System.out.println("Cálculo de Média ponderada");
            media = (nota_1 * peso_1 + nota_2 * peso_2) / (peso_1 + peso_2);

            return media;
            }
            
 /*
 Incluir um método com cálculo de médias ponderadas, usando polimorfismo
 - Nome do método: Media
 - Tipo float
 - Recebe duas notas (float) e dois pesos do tipo inteiro
 - media = (n1*p1 + n2*p2) / (p1+p2)
 */
}

