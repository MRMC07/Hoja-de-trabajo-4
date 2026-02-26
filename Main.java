package scr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a su calculadora!");
        System.out.println("1. Pila");
        System.out.println("Escoja una opción:");

        int opcion = scanner.nextInt();

        if (opcion == 1) {
            IStack stack = StackFactory.createStack(1, scanner);
            System.out.println("Pila creada correctamente.");
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
