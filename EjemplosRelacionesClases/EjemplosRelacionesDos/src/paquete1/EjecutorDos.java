/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;
import java.util.Scanner;
/**
 *
 * @author spart
 */
public class EjecutorDos {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    System.out.println("Ingrese el nombre del barrio: ");
    String nBarrio = entrada.nextLine();
    Barrio b1 = new Barrio(nBarrio);
    
    System.out.println("Ingrese el nombre de la persona: ");
    String nombrePersona = entrada.nextLine();
    System.out.println("Ingrese la cedula de la persona: ");
    String cedulaPersona = entrada.nextLine();
    
    Persona personaObjeto = new Persona(nombrePersona, cedulaPersona, b1);
    
    System.out.printf("%s\n", personaObjeto);
}
    
}
