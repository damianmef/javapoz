package Heap;

public class List {
    private ListElement first = null;
    private ListElement last = null;

    public void add(int el) {
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

    public int get()
    {
        if ((this.first != null) && (this.last != null)) {
            //pobieram wartosc pierwszego elelemtu kolejki
            int value = this.first.getValue();

            //pierwszy elememt kolejki ustawiam na element ktory znajduje sie natepy w klejce
            this.first = this.first.getNext();

            if (this.first != null) {
                //usuwam refeencje w starym, pierwszym elemencie kolejki
                this.first.getPrev().setNext(null);
                this.first.setPrev(null);
            }

            //zwaracam wartosc
            return value;
        }
        return -1;
    }

    public void print()
    {
        ListElement current = this.first;

        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public void printReverse()
    {
        ListElement current = this.last;

        while (current != null) {
            System.out.println(current.getValue());
            current = current.getPrev();
        }
    }

    public void addSorted(int el)
    {
        ListElement tmp = new ListElement(el);

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
