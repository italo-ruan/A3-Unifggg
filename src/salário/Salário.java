
package salário;

import java.util.Scanner;
public class Salário {

 
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("digite a quantidade de salário que vc recebe:");
        double salários = lerTeclado.nextDouble();
        
        double slrm = (1412);
       
  
        
        double salário = (salários * slrm);
        
        System.out.println("o resultado é:" + salário);
        
  

    }
   
    
}
