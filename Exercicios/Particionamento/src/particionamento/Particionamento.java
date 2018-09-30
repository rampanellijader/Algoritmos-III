
package particionamento;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Particionamento {

    
    public static void main(String[] args) {
       List<String> lista1 = Arrays.asList(
            "Rio Grande do Sul", "Santa Catarina", "Parana", "Brasília",
            "São Paulo", "Rio de Janeiro", "Acre", "Minas Gerais", "Ceará");
       
       
         System.out.println("Estados que iniciam com a letra R");         
          filtro(lista1, (s)-> s.startsWith("R"));
          
          System.out.println("");
          
          System.out.println("Estados que terminam com a letra a");
           filtro(lista1, (s)-> s.endsWith("a"));
           
          /* System.out.println("");
           
            System.out.println("todoss");
            filtro(lista1, (s)-> true);  */
    }
    
    public static void  filtro(List<String> lista, Predicate<String> condicao){
         for(String s: lista)
             if(condicao.test(s))
                 System.out.println(s);   
         
    }
}
