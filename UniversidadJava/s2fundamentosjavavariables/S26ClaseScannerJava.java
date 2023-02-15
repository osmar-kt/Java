package s2fundamentosjavavariables;

import java.util.Scanner;

public class S26ClaseScannerJava {

    public static void main(String[] args) {
        System.out.print("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("Usuario = " + usuario);
        System.out.print("Escribe tu Edad: ");
        var edad = consola.nextLine();
        System.out.println("Edad = " + edad);
    }
}
