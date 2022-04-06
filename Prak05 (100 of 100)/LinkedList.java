/**
 * LinkedList.java
 * Menyimpan deretan elemen dalam sebuah list
 * @author 18220008 Zhillan Attarizal Rezyarifin
 */

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    /**
     * Konstruktor
     * buat linked list dengan size = 0 dan head = tail = null
     */
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    /**
     * Cari elemen yang terletak pada posisi position
     * @param position
     * @return elemen pada posisi position jika ada, null jika tidak ada
     */
    public Node<T> getNode(int position) {
        int i = 0;
        Node<T> loc = this.head;
        while ((loc != null) && (i < position)) {
            loc = loc.getNext();
            i++;
        }
        // loc at i=location
        return loc;
    }

    /**
     * Tambah elemen dengan nilai item dengan menambahkan
     * node sebagai elemen paling belakang
     * @param item
     */
    public void add(T item) {
        Node<T> loc = new Node<T>(item, this.tail, null);
        if (this.size == 0) {
            // list kosong
            this.head = loc;
        }
        else {
            this.tail.setNext(loc);
        }
        this.tail = loc;
        this.size++;
    }

    /**
     * Cari nilai elemen pada posisi position
     * @param position
     * @return nilai elemen pada posisi position jika ada, null jika tidak ada
     */
    public T get(int position) {
        int i = 0;
        Node<T> loc = this.head;
        T info = null;
        while ((loc != null) && (i < position)) {
            loc = loc.getNext();
            i++;
        }
        // loc at location or loc at end null
        if (loc != null) {
            info = loc.getInfo();
        }
        return info;
    }

    /**
     * Ubah nilai elemen pada posisi position menjadi nilai item jika ada
     * @param position
     * @param item
     */
    public void set(int position, T item) {
        int i = 0;
        Node<T> loc = this.head;
        while ((loc != null) && (i < position)) {
            loc = loc.getNext();
            i++;
        }
        // loc at i=position or loc at end null
        if (loc != null) {
            loc.setInfo(item);
        }        
    }

    /**
     * Hapus elemen pada posisi position jika ada
     * @param position
     */
    public void remove(int position) {
        int i = 0;
        Node<T> loc = this.head;
        Node<T> prev = null;
        if (position < this.getSize()) {
            while ((loc != null) && (i < position)) {
                prev = loc;
                loc = loc.getNext();
                i++;
            }
            // loc at position
            if ((loc.getNext() != null) && prev != null) {
                // loc at middle
                prev.setNext(loc.getNext());
                (loc.getNext()).setPrev(prev);
            }
            if (loc.getPrev() == null) {
                // loc at head
                this.head = loc.getNext();
                if (this.head != null) {
                    (this.head).setPrev(null);
                }
            }
            if (loc.getNext() == null) {
                // loc at tail
                this.tail = loc.getPrev();
                if (this.tail != null) {
                    (this.tail).setNext(null);
                }
            } 
            loc.setNext(null);
            loc.setPrev(null);
            this.size--;
        }
    }

    /**
     * Hapus semua elemen dari Linked List
     */
    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Getter size
     * @return size
     */
    public int getSize() {
        return this.size;
    }
}
