package Heap;

public class ListMergeSort {
    private ListElement first = null;
    private ListElement last = null;
    private int counter = 0;

    public ListMergeSort(ListElement first, ListElement last, int counter)
    {
        this.first = first;
        this.last = last;
        this.counter = counter;
    }

    public ListMergeSort() {}

    public ListElement getFirst() {
        return this.first;
    }

    public ListElement getLast() {
        return this.last;
    }

    public void sort()
    {
        int newCounter = this.counter / 2;

        ListElement current = this.first;

        for (int i = 0; i < newCounter; i++) {
            current = current.getNext();
        }

        ListMergeSort newList1 =
                new ListMergeSort(this.first, current.getPrev(), newCounter);
        ListMergeSort newList2 =
                new ListMergeSort(current, this.last, this.counter - newCounter);

        current.getPrev().setNext(null);
        current.setPrev(null);

        //newList1
        if (newCounter > 1) {
            newList1.sort();
        }

        //newList2
        if ((this.counter - newCounter) > 1) {
            newList2.sort();
        }
        newList1.mergeLists(newList2);

        this.first = newList1.getFirst();
        this.last = newList1.getLast();
    }

    public void add(int el) {
        this.counter++;
        ListElement tmp = new ListElement(el); //tworze nowy tymczasowy element kolejki
        tmp.setPrev(this.last); //ustawiam go na koncu kolejki - jego poprzednikem bedze obecny koniec kolejki

        if (this.last != null) {
            this.last.setNext(tmp);
            //jesli istnieje jakis element na liscie, ustawiam jego nastepnik na nowoutworzony element
        }

        this.last = tmp; //wskaznik konca kolejki ustawiam na nowo dodany element

        if (this.first == null) {
            //jesli kolejk byla pusta, to poczatek kolejki bedzie wskazywal na nowo utworzony element
            this.first = tmp;
        }
    }


    public void print()
    {
        ListElement current = this.first;

        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public void mergeLists(ListMergeSort listToMerge)
    {
        ListElement element = null;
        ListElement current = this.first;

        while ((element = listToMerge.get()) != null) {
            boolean isAdded = false;

            while (current != null && !isAdded) {
                if (current.getValue() > element.getValue()) {
                    element.setPrev(current.getPrev());
                    current.setPrev(element);
                    element.setNext(current);
                    if (element.getPrev() != null) {
                        element.getPrev().setNext(element);
                    } else {
                        this.first = element;
                    }
                    isAdded = true;
                } else {
                    current = current.getNext();
                }
            }

            if (!isAdded) {
                current = element;
                element.setPrev(this.last);
                this.last.setNext(element);
                this.last = element;
            }

        }
    }

    public ListElement get()
    {
        if ((this.first != null) && (this.last != null)) {
            //pobieram wartosc pierwszego elelemtu kolejki
            ListElement value = this.first;

            //pierwszy elememt kolejki ustawiam na element ktory znajduje sie natepy w klejce
            this.first = this.first.getNext();

            if (this.first != null) {
                //usuwam refeencje w starym, pierwszym elemencie kolejki
                this.first.getPrev().setNext(null);
                this.first.setPrev(null);
            }

            this.counter--;
            value.setNext(null);
            value.setPrev(null);
            //zwaracam wartosc
            return value;
        }
        return null;
    }

    public void addSorted(ListElement tmp)
    {
        if (this.first == null) {
            //dodanie elementu do pustej listy
            this.first = tmp;
            this.last = tmp;
        } else {
            ListElement current = this.first;
            boolean isAdded = false;

            while (current != null && !isAdded) {
                if (current.getValue() > tmp.getValue()) {
                    tmp.setPrev(current.getPrev());
                    current.setPrev(tmp);
                    tmp.setNext(current);
                    if (tmp.getPrev() != null) {
                        tmp.getPrev().setNext(tmp);
                    } else {
                        this.first = tmp;
                    }
                    isAdded = true;
                }

                current = current.getNext();
            }

            if (!isAdded) {
                tmp.setPrev(this.last);
                this.last.setNext(tmp);
                this.last = tmp;
            }
        }
    }
}
