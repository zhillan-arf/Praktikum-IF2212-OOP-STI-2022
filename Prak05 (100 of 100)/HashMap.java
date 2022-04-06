/**
 * HashMap.java
 * Menyimpan deretan elemen dalam sebuah hashmap
 * @author 18220008 Zhillan Attarizal Rezyarifin
 */

class HashMap<K, V> implements Map<K, V> {
    private static final int BUCKET_SIZE = 100;
    @SuppressWarnings("unchecked")
    private LinkedList<KeyValue<K, V>>[] buckets = new LinkedList[BUCKET_SIZE];

    HashMap() {
        for (int i = 0; i < BUCKET_SIZE; i++) {
            buckets[i] = new LinkedList<KeyValue<K, V>>();
        }
    }

    public static class KeyValue<K, V> {
        private K key;
        private V value;

        public KeyValue(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    /**
     * Hash function untuk Key
     * Gunakan method ini untuk menentukan lokasi penyimpanan Key-Value pada buckets
     * @param key
     * @return nilai hash dari key
     */
    private int getKeyHash(K key) {
        return (key.hashCode() % BUCKET_SIZE + BUCKET_SIZE) % BUCKET_SIZE;
    }

    /**
     * Menyimpan nilai (key, value) ke dalam map
     * Melakukan overwrite jika sudah terdapat elemen dengan key yang sama.
     * @param key
     * @param value
     */
    @Override
    public void put(K key, V value) {
        int hash = getKeyHash(key);

        if (containsKey(key)) {
            int pos = 0;
            for (int i = 0; i < buckets[hash].getSize(); i++) {
                if (buckets[hash].get(i).getKey().equals(key)) {
                    pos = i;
                }
            }
            
            buckets[hash].get(pos).setValue(value);
        }

        else {
            KeyValue<K, V> temp = new KeyValue<K, V>(key, value);
            buckets[hash].add(temp);
        }
    }

    

    /**
     * Mengembalikan value yang tersimpan untuk key tertentu pada map
     * Mengembalikan null apabila map tidak mengandung key masukan.
     * @param key
     * @return
     */
    @Override
    public V get(K key) {
        if (containsKey(key)) {
            int hash = getKeyHash(key);
            int pos = 0;
            for (int i = 0; i < buckets[hash].getSize(); i++) {
                if (buckets[hash].get(i).getKey().equals(key)) {
                    pos = i;
                }
            }

            return buckets[hash].get(pos).getValue();
        }

        else {
            return null;
        }
    }

    /**
     * @return banyak elemen di dalam map
     */
    @Override
    public int size() {
        int total = 0;
        for (int i = 0; i < BUCKET_SIZE; i++) {
            total += buckets[i].getSize();
        }
        return total;
    }

    /**
     * Menghapus semua elemen yang ada pada map
     */
    @Override
    public void clear() {
        for (int i = 0; i < BUCKET_SIZE; i++) {
            buckets[i].clear();
        }
    }

    /**
     * Mengembalikan true apabila terdapat elemen dengan Key = key di dalam map, dan false bila tidak
     * @param key
     * @return
     */
    @Override
    public boolean containsKey(K key) {
        int hash = getKeyHash(key);
        boolean contain = false;
        for (int i = 0; i < buckets[hash].getSize(); i++) {
            if (buckets[hash].get(i).getKey().equals(key)) {                
                contain = true;
            }
        }
        return contain;
    }
    
    /**
     * Menghapus elemen dengan Key = key dari map jika ada
     * @param key
     */
    @Override
    public void remove(K key) {
        if (containsKey(key)) {
            int hash = getKeyHash(key);
            int pos = 0;
            for (int i = 0; i < buckets[hash].getSize(); i++) {
                if (buckets[hash].get(i).getKey().equals(key)) {
                    pos = i;
                }
            buckets[hash].remove(pos);
            }
        }
    }
}
