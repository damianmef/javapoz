package Heap;

public class Queue {
    private QueueElement first = null;
    private QueueElement last = null;

    public void add(int el) {
        QueueElement tmp = new QueueElement(el); //tworze nowy tymczasowy element kolejki
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
}
