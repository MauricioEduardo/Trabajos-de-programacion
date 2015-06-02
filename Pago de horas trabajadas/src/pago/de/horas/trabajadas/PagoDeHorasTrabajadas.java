/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pago.de.horas.trabajadas;
import java.util.Scanner;
/**
 *
 * @author yayo__000
 */
public class PagoDeHorasTrabajadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("Bienvenido");
       int horas, valorhora;
       Scanner entrada = new Scanner(System.in);
       System.out.println("Ingrese las horas de trabajo: ");
       horas = entrada.nextInt();
       System.out.println("Ingrese el valor de las horas: ");
       valorhora = entrada.nextInt();
       if (horas<=44){
           int pago = horas*valorhora;
           System.out.println("El total a pagar es de: $"+pago+" pesos");
      }else{
           int pago = (horas-44)*(valorhora+(valorhora/2))+(44*valorhora);
           System.out.println("El total a pagar con horas extras es de: $"+pago
           +" pesos");
            
        }
        
        
        
    }
    
}
