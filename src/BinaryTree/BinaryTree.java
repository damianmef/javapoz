package BinaryTree;

public class BinaryTree {
    public static void main(String[] args) {

        randomBinaryTree(6, 10, 0.5);
    }

    /*
    * n - liczba elementów drzewa
    * z - zakres losowania
    * p - prawdopodobieństwo lewego poddrzewa
    * node - element drzewa
    * */
    public static Node randomBinaryTree(int n, int z, double p)
    {
        /* Tworzymy korzeń */
        Node rootElement = new Node();
        rootElement.setKey( (int)(Math.random()*z));

        /* Tworzymy element "chwilowy", początkowo to korzeń a później to kolejne niepuste elementy
        * słuzy on do przesuwania się po drzewie */
        Node currentElement = rootElement;

        /* Wykonujemy n-1 (korzeń już mamy, jest pierwszym elementem) tworzenie nowego elementu i szukania dla
         * niego miejsca */
        for (int i = 1; i < n; i++) {
            Node newElement = new Node();
            newElement.setKey( (int)(Math.random()*z));

            /* Ustawiamy flagę dodania, szukamy miejsca dla elementu dopóki nie natrafimy na pusty wskaźnik */
            boolean added = false;
            do {
                /* Losujemy czy szukamy miejsca dla nowego elementu w lewym poddrzewie (if) lub w prawym (else) */
                if(Math.random() < p) {
                    /* Jesli wskaźnik elementu jest pusty, to można dodać element */
                    if( currentElement.getLeft() == null) {
                        currentElement.setLeft(newElement);
                        added = true;
                    } else {
                        /* W przeciwnym wypadku przeskocz do tego elementu, czyli uaktualnij "chwilowy" element */
                        currentElement = currentElement.getLeft();
                    }
                } else {
                    if( currentElement.getRight() == null) {
                        currentElement.setRight(newElement);
                        added = true;
                    } else {
                        currentElement = currentElement.getRight();
                    }
                }

            } while (!added);

        }

        /* Zwracamy korzeń drzewa, który zawiera wskaźniki na poddrzewa, które mają wskaźniki na kolejne poddrzewa itd. */
        return rootElement;
    }
}
