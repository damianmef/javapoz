package BinaryTree;

public class BinaryTree {
    public static void main(String[] args) {

//        Node firstNode = randomBinaryTree(50, 500, 1);
//        System.out.println("Preorder");
//		preorder(firstNode);
//		System.out.println("Inorder");
//		inorder(firstNode);
//		System.out.println("Postorder");
//		postorder(firstNode);
//        System.out.println(findInTree(5, firstNode));
        System.out.println(setBalancedTree(10, 100).toString());
    }

    public static Node setBalancedTree(int n, int z) {
        Node tree = new Node();

        int nLeft = 0;
        int nRight = 0;
        if (n > 0) {
            nLeft = n /2;
            nRight = n - nLeft -1;

            int x = (int)(Math.random() *z);
            tree.setKey(x);
            tree.setLeft(setBalancedTree(nLeft, z));
            tree.setRight(setBalancedTree(nRight, z));

        }

        return tree;
    }

    public static int getTreeHeight(Node node){
        if(node == null) {
            return 0;
        } else {
            int leftHeight = getTreeHeight(node.getLeft());
            int rightHeight = getTreeHeight(node.getRight());
            if (leftHeight > rightHeight) {
                return leftHeight+1;
            } else {
                return rightHeight+1;
            }
        }
    }

    public static boolean findInTree(int x, Node node) {
        boolean isInTree = false;
        if(node != null) {
            if(x == node.getKey()) {
                isInTree = true;
            } else {
                isInTree = findInTree(x, node.getLeft());
                if(!isInTree) {
                    isInTree = findInTree(x, node.getRight());
                }
            }
        }
        return isInTree;
    }

    public static void preorder(Node node) {
        /* Jeśli element nie jest pusty */
        if (node != null) {
            /* wyświetl korzeń, lewe poddrzewo, prawe poddrzewo*/
            System.out.println(node.getKey());
            preorder(node.getLeft());
            preorder(node.getRight());
        }
    }

    public static void inorder(Node node) {
        if (node != null) {
            /* wyświetl lewe poddrzewo, korzeń, prawe poddrzewo*/
            inorder(node.getLeft());
            System.out.println(node.getKey());
            inorder(node.getRight());
        }
    }

    public static void postorder(Node node) {
        if (node != null) {
            /* wyświetl lewe poddrzewo, korzeń, prawe poddrzewo*/
            inorder(node.getLeft());
            System.out.println(node.getKey());
            inorder(node.getRight());
        }
    }

    public static void postorder(Node node)
    {
        if (node != null) {
            /* wyświetl lewe poddrzewo, prawe poddrzewo, korzeń */
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
