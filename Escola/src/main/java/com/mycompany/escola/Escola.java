package com.mycompany.escola;
/**
 *
 * @author Erik Alves
 */
public class Escola {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Limpeza","Manhã",1200,"Cleide",123456789,"cleide@cleide.com",37);
        
        System.out.println("#-#-# Funcionario #-#-#");
        System.out.println(f.mostrar_funcionario());
        f.aniversario();
        System.out.println("\n#-#-# Funcionario após Aniversario #-#-#");
        System.out.println(f.mostrar_funcionario());
        
        Professor p = new Professor("Matemática","Matemática",18.75F,"Noslen",987654321,"noslen@noslen.com",41);
        
        System.out.println("\n#-#-# Professor #-#-#");
        System.out.println(p.mostrar_professor());
        p.aniversario();
        System.out.println("Salário do mês: " + p.Salario());
        System.out.println("\n#-#-# Professor após Aniversario #-#-#");
        System.out.println(p.mostrar_professor());
        System.out.println("Salário do mês: " + p.Salario());
        
        Aluno a = new Aluno("Desenvolvimento de Sistemas","2º ETIM","Marllon Araujo",159378426,"marllonaraujo.silva@gmail.com",15);
        
        System.out.println("\n#-#-# Aluno #-#-#");
        System.out.println(a.mostrar_aluno());
        a.aniversario();
        System.out.println("\n#-#-# Aluno após Aniversário #-#-#");
        System.out.println(a.mostrar_aluno());
  
    }
    
}
