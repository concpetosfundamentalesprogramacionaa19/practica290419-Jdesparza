/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;
// Importamos a la biblioteca
import java.util.Scanner;
import porcentaje1.*;
import porcentaje2.*;
import porcentaje3.*;
import porcentaje4.*;
/**
 *
 * @author PC
 */
public class ClasePrincipal {
    public static void main (String[] args) {
        // Se declaran las variables y en algunos casos se les asigna un valor
        // ya sea de cadena, entera o decimal.
        int costo = 1330;
        double descuento_ciudad = Porcentaje1.descuento;
        double descuento_edad = Porcentaje2.descuento;
        double descuento_estadocivil = Porcentaje3.descuento;
        double descuento_cargafamiliar = Porcentaje4.descuento;
        int ciudad; 
        int edad;
        int estadocivil;
        int carga_familiar;
        double descuento1;
        double descuento2;
        double descuento3;
        double descuento4;
        double valor_pago;
        double iva;
        double costo_final;
        
        // importamos a la libreria para poder ingresar datos por teclado
        Scanner entrada = new Scanner(System.in);
        
        // Agragamos un menú con opciones para el estudiante
        System.out.println("-----------------Menú---------------");
        System.out.println("| Ingrese al momento de responder  |");
        System.out.println("| solo los numeros dados.          |");
        System.out.println("| Ciudad a la que pertenece:       |");
        System.out.println("| 1 Loja                           |");
        System.out.println("| 2 Zamora                         |");
        System.out.println("| 3 Otra                           |");
        System.out.println("------------------------------------");
        
        // Se pide datos por teclado al estudiante
        System.out.print(Porcentaje1.mensaje1);
        ciudad = entrada.nextInt();
        
        // Se pide datos por teclado al estudiante
        System.out.print(Porcentaje2.mensaje2);
        edad = entrada.nextInt();
        
        // Agragamos un menú con opciones para el estudiante
        System.out.println("-----------------Menú---------------");
        System.out.println("| Ingrese al momento de responder  |");
        System.out.println("| solo los numeros dados.          |");
        System.out.println("| Estado civil:                    |");
        System.out.println("| 1 Soltero                        |");
        System.out.println("| 2 Casado                          |");
        System.out.println("---------------------------------- -");
        
        // Se pide datos por teclado al estudiante
        System.out.print(Porcentaje3.mensaje3);
        estadocivil = entrada.nextInt();
        
        // Agragamos un menú con opciones para el estudiante
        System.out.println("-----------------Menú---------------");
        System.out.println("| Ingrese al momento de responder  |");
        System.out.println("| solo los numeros dados.          |");
        System.out.println("| Tiene carga familiar:            |");
        System.out.println("| 1 Si                             |");
        System.out.println("| 2 No                             |");
        System.out.println("------------------------------------");
        
        // Se pide datos por teclado al estudiante
        System.out.print(Porcentaje4.mensaje4);
        carga_familiar = entrada.nextInt();
        
        /*
         * Se usa el ciclo if-else debido a que si no se cumple la primera
         * condición propuesta se llegue a cumplir la segunda.
         *
         * Y de esta forma imprima el mensaje propuesto es la condicion
         * acertada.
        */
        if (ciudad == 1 || ciudad == 2){
            descuento1 = costo * descuento_ciudad; 
            System.out.printf("%s %.2f\n", Porcentaje1.mensajedescuento1, 
                    descuento1);
        } else {
            descuento1 = 0;
            System.out.printf("%s %.2f\n", Porcentaje1.mensajedescuento1, 
                    descuento1);
        }
        
        if (edad >= 17 && edad < 20){
            descuento2 = costo * descuento_edad; 
            System.out.printf("%s %.2f\n",Porcentaje2.mensajedescuento2, 
                    descuento2);
        } else {
            descuento2 = 0;
            System.out.printf("%s %.2f\n",Porcentaje2.mensajedescuento2, 
                    descuento2);
        }
        
        if (estadocivil == 2){
            descuento3 = costo * descuento_estadocivil; 
            System.out.printf("%s %.2f\n",Porcentaje3.mensajedescuento3, 
                    descuento3);
        } else {
            descuento3 = 0; 
            System.out.printf("%s %.2f\n",Porcentaje3.mensajedescuento3, 
                    descuento3);
        }
        
        if (carga_familiar == 1){
            descuento4 = costo * descuento_cargafamiliar; 
            System.out.printf("%s %.2f\n",Porcentaje4.mensajedescuento4, 
                    descuento4);
        } else {
            descuento4 = 0; 
            System.out.printf("%s %.2f\n",Porcentaje4.mensajedescuento4, 
                    descuento4);
        }
        
        
        valor_pago = costo - descuento1 - descuento2 - descuento3 - descuento4;
        iva = valor_pago * 0.02;
        costo_final = valor_pago + iva;
        
        System.out.printf("El impuesto a pagar es de: %.2f\nSu costo "
                + "final es: %.2f\n", iva, costo_final);
    }
}
