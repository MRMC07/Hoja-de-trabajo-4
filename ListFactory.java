package scr;

public class ListFactory {

    public static <E> IList<E> createList(int opcion) {

        switch (opcion) {
            case 1:
                return new SimpleLinkedList<E>();

            case 2:
                return new DoubleLinkedList<E>();

            default:
                System.out.println("Opción inválida. Se usará SimpleLinkedList por defecto.");
                return new SimpleLinkedList<E>();
        }
    }
}
