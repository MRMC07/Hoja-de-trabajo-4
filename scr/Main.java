package scr;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido a su calculadora!, ¿con que ocpción desea trabajar?");
        System.out.println("1. Con Stack");
        System.out.println("2. Con Lista");
        System.out.print("Seleccione una opcion: ");

        int opcionStack = scanner.nextInt();

        if (opcionStack == 1) {

            System.out.println("\n¿Con que tipo de de Stack?");
            System.out.println("1. ArrayList");
            System.out.println("2. Vector");
            System.out.println("3. Lista");

            int tipo = scanner.nextInt();

            IStack<Integer> stack = null;

            switch (tipo) {

                case 1:
                    stack = new StackArrayList<>();
                    break;

                case 2:
                    stack = new StackVector<>();
                    break;

                case 3:
                    System.out.println("\nSeleccione tipo de Lista:");
                    System.out.println("1. Simplemente Encadenada");
                    System.out.println("2. Doblemente Encadenada");

                    int tipoLista = scanner.nextInt();

                    IList<Integer> list = null;

                    if (tipoLista == 1) {
                        list = new SinglyLinkedList<>();
                    } else if (tipoLista == 2) {
                        list = new DoublyLinkedList<>();
                    } else {
                        System.out.println("Opcion invalida");
                        return;
                    }

                    stack = new StackList<>(list);
                    break;

                default:
                    System.out.println("Opcion invalida");
                    return;
            }

            System.out.println("\nStack creado exitosamente: "
                    + stack.getClass().getSimpleName());
        }

        else if (opcion == 2) {
            System.out.println("Parte de listas aún no implementada.");
        }

        else {
            System.out.println("Opcion invalida.");
        }

        scanner.close();
    }

    //aquí continuar con las opciones para la Lista :)
}

