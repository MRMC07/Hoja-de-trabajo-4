package scr;

import java.util.Scanner;

public class StackFactory {

    public static IStack createStack(int opcionStack, Scanner scanner) {

        switch (opcionStack) {

            case 1: // Stack basado en lista

                System.out.println("Seleccione tipo de Lista:");
                System.out.println("1. SimpleLinkedList");
                System.out.println("2. DoubleLinkedList");

                int opcionLista = scanner.nextInt();

                IList<Integer> lista = ListFactory.createList(opcionLista);

                return new StackList(lista);

            default:
                System.out.println("Opción inválida.");
                return null;
        }
    }
}
