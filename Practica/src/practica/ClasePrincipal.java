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
        int costo = 1330;
        int ciudad; 
        int edad;
        int estadocivil;
        int cargafamiliar;
        int costofinal;
        // importamos a la libreria para poder ingresar datos por teclado
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("-----------------Menú---------------");
        System.out.println("| Ingrese al momento de responder  |");
        System.out.println("| solo los numeros dados.          |");
        System.out.println("| Ciudad a la que pertenece:       |");
        System.out.println("| 1 Loja                           |");
        System.out.println("| 2 Zamora                         |");
        System.out.println("| 3 Otra                           |");
        System.out.println("------------------------------------");
        
        System.out.print(Porcentaje1.mensaje1);
        ciudad = entrada.nextInt();
        
        System.out.print(Porcentaje2.mensaje2);
        edad = entrada.nextInt();
        
        System.out.println("-----------------Menú---------------");
        System.out.println("| Ingrese al momento de responder  |");
        System.out.println("| solo los numeros dados.          |");
        System.out.println("| Estado civil:                    |");
        System.out.println("| 1 Soltero                        |");
        System.out.println("| 2 Casdo                          |");
        System.out.println("---------------------------------- -");
        
        System.out.print(Porcentaje3.mensaje3);
        estadocivil = entrada.nextInt();
        
        System.out.println("-----------------Menú---------------");
        System.out.println("| Ingrese al momento de responder  |");
        System.out.println("| solo los numeros dados.          |");
        System.out.println("| Tiene carga familiar:            |");
        System.out.println("| 1 Si                             |");
        System.out.println("| 2 No                             |");
        System.out.println("------------------------------------");
        
        System.out.print(Porcentaje4.mensaje4);
        cargafamiliar = entrada.nextInt();
        
        if (ciudad == 1 && ciudad == 2){
            Porcentaje1.descuento1 = costo * 0.2; 
            System.out.printf("%s %d\n",Porcentaje1.mensajedescuento1, 
                    Porcentaje1.descuento1);
        }
        
        if (edad >= 17 && edad < 20){
            Porcentaje1.descuento1 = costo * 0.2; 
            System.out.printf("%s %d\n",Porcentaje2.mensajedescuento2, 
                    Porcentaje2.descuento2);
        }
        
        if (ciudad == 1 && ciudad == 2){
            Porcentaje1.descuento1 = costo * 0.2; 
            System.out.printf("%s %d\n",Porcentaje3.mensajedescuento3, 
                    Porcentaje3.descuento3);
        }
        
        if (ciudad == 1 && ciudad == 2){
            Porcentaje1.descuento1 = costo * 0.2; 
            System.out.printf("%s %d\n",Porcentaje4.mensajedescuento4, 
                    Porcentaje4.descuento4);
        }
        
    }
}
