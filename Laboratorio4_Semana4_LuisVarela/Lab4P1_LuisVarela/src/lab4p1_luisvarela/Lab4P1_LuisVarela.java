/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_luisvarela;
import java.util.Scanner;
/**
 *
 * @author Luis Andres Varela
 */
public class Lab4P1_LuisVarela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        boolean salir=true;
        while(salir){
            System.out.println("\n\n1.Conjuntos");
            System.out.println("2.Contraseña mejorada");
            System.out.println("3.Salir");
            int opciones=lea.nextInt();
            switch(opciones){
                case 1:{
                    System.out.print("Ingrese el primer conjunto:");
                    String conA;
                    conA=lea.next();;
                    while(conA.charAt(2)!='='){
                        
                    }
                }
                break;
                case 2:{
                    System.out.print("Ingrese la contraseña:");
                    String cont;
                    cont=lea.next();
                    boolean si_hay=true;
                    String comp="1234567";
                    if((int)cont.length()<=(int)comp.length()){
                        System.out.println("La contraseña no es segura porque tiene menos de 8 caracteres");
                        si_hay=false;
                    }
                    
                    if(si_hay){
                        
                        String letra="zxcvbnmasdfghjklqwertyuiopñ";
                        int a=cont.length();
                        int s=letra.length();
                        boolean no_hay_caracteres=true;
                        for(int f=0;f<a;f++){
                            for(int g=0;g<s;g++)
                            if(cont.charAt(f)==letra.charAt(g)){ 
                              no_hay_caracteres=false;
                            }
                        }
                        if(no_hay_caracteres){
                            System.out.println("No hay caracteres ");
                        }
                        
                        String numero="0123456789";
                        int c=numero.length();
                        boolean no_hay_numero=true;
                        for(int f=0;f<a;f++){
                            for(int g=0;g<c;g++)
                            if(cont.charAt(f)==numero.charAt(g)){  
                              no_hay_numero=false;
                            }
                        }
                        if(no_hay_numero){
                            System.out.println("No hay numero ");
                        }
                        if(si_hay&&no_hay_caracteres!=true&&no_hay_numero!=true){
                            System.out.println("Ingrese un número:");
                            int num1=lea.nextInt();
                            System.out.println("La nueva contraseña es:");
                            int contador=0;
                            for(int o=0;o<a;o++){
                                System.out.print(cont.charAt(o));
                                contador++;
                                if(contador==2){
                                    System.out.print(num1);
                                    num1++;
                                    contador=0;
                                }
                            }
                        }
                    }
                }
                break;
                case 3:{
                    salir=false;
                }
                break;
                default:
                    System.out.println("Error");
            }
        }
        // TODO code application logic here
    }
    
}
