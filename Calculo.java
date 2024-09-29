package calc; //pacote do nosso projeto

import java.util.Scanner; // importando a classe Scanner do pacote java.util, que le os dados da entrada do usuário.

public class Calculo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in); //criando um novo objeto e inicializando ele para ler a entrada do sistema.
    
    Numero n1 = new Numero ();
    Numero n2 = new Numero ();
    Numero res = new Numero ();
    //novos objetos que armazenam os valores dos números digitados.
    
    
    System.out.printf("Digite o primeiro valor: ");
    n1.setValor(sc.nextInt());
    
     System.out.printf("Digite o segundo valor: ");
    n2.setValor(sc.nextInt());
    
    res.setValor(n1.getValor() + n2.getValor()); //soma os valores armazenados
    
        System.out.printf("%nA soma de %d com %d e igual a %d", n1.getValor(), n2.getValor(), res.getValor());
    }
    
    
}
