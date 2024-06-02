
package array1;


public class Array1 {

  
    public static void main(String[] args) {
        
        
        int[] numeros = {10, 20, 30, 40, 50, 100};
        
        int soma= 0;
        for (int i = 0; i < numeros.length ; i++)
           soma += numeros[i]; 
        System.out.println("a soma dos numeros inteiros " + soma );
        
    }
    
}
