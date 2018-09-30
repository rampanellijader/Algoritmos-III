
package hash;

import java.util.Scanner;


public class MinhaApp {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int chave;
        
       // Registro r1, r2, r3, r4;
        MapaHash mapa = new MapaHash();
        
        mapa.put(new Registro(7865, "Isidro"));
        mapa.put(new Registro(123, "Josineidson"));
        mapa.put(new Registro(987, "Nilson"));
        mapa.put(new Registro(9832, "Godofredo"));
        
        do{
            System.out.println("Digite um cod de registro:");
            chave = teclado.nextInt();
            if(chave != -1){
                Registro r = mapa.get(chave);
                if(r != null){
                    System.out.println("Registro recuperado= "+r.getChave()+" - "+r.getValor());
                }
                else{
                    System.out.println("Registro não existente!");
                }
            }   
        }while(chave != -1);
        
        
        
     /*   System.out.println("Registro "+r1.getChave()+ " - "+ r1.getValor()+ "( "+r1.hashCode()+ ")");
        System.out.println("Registro "+r2.getChave()+ " - "+ r2.getValor()+ "( "+r2.hashCode()+ ")");
        System.out.println("Registro "+r3.getChave()+ " - "+ r3.getValor()+ "( "+r3.hashCode()+ ")");
        System.out.println("Registro "+r4.getChave()+ " - "+ r4.getValor()+ "( "+r4.hashCode()+ ")");
    */
    }
    
}
