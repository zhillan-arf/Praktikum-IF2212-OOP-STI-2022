interface Map<K,V> {
    /**
     * Menambahkan (key, value) ke dalam map
     * Melakukan overwrite jika sudah terdapat elemen dengan key yang sama.
     */
    void put(K key, V value);

    /**
     * Mengembalikan value yang tersimpan untuk key tertentu pada map
     * Mengembalikan NULL apabila map tidak mengandung key masukan.
     */
    V get(K key);

    /**
     * Menghitung jumlah elemen yang ada pada map
     */
    int size();

    /**
     * Menghapus semua (key, value) yang ada pada map
     */
    void clear();

    /**
     * Mengembalikan true apabila terdapat key di map, dan false bila tidak
     */
    boolean containsKey(K key);

     /**
     * Menghapus key dari map
     */
    void remove(K key);
}