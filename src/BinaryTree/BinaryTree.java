package BinaryTree;

public class BinaryTree {
    public static void main(String[] args) {

        Node firstNode = randomBinaryTree(6, 100, 0.5);
        System.out.println("Preorder");
		preorder(firstNode);
		System.out.println("Inorder");
		inorder(firstNode);
		System.out.println("Postorder");
		postorder(firstNode);

    }

    public static void preorder(Node node) {
        if (node != null) {
            System.out.println(node.getKey());
            preorder(node.getLeft());
            preorder(node.getRight());
        }
    }

    public static void inorder(Node node) {
        if (node != null) {
            inorder(node.getLeft());
            System.out.println(node.getKey());
            inorder(node.getRight());
        }
    }

    public static void postorder(Node node)
    {
        if (node != null) {
            postorder(node.getLeft());
            postorder(node.getRight());
            System.out.println(node.getKey());
        }
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
            newElement.setId(i);
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

                if(added) {
                    System.out.println(currentElement.toString());
                }
            } while (!added);

        }

        /* Zwracamy korzeń drzewa, który zawiera wskaźniki na poddrzewa, które mają wskaźniki na kolejne poddrzewa itd. */
        return rootElement;
    }
}
