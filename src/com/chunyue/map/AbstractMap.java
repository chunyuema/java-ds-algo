package com.chunyue.map;

import com.chunyue.Entry;

import java.util.Iterator;

public abstract class AbstractMap<K, V> implements Map<K, V> {
    public boolean isEmpty(){
        return size() == 0;
    }
    public Iterable<K> keySet() { return new KeyIterable(); }
    public Iterable<V> values() { return new ValueIterable();}

    // This is the inner class for a map entry
    protected static class MapEntry<K, V> implements Entry<K, V> {
        private K k;
        private V v;

        public MapEntry(K k, V v) {
            this.k = k;
            this.v = v;
        }

        public K getKey() {
            return k;
        }

        public void setKey(K key) {
            this.k = key;
        }

        public V getValue() {
            return v;
        }

        public V setValue(V value) {
            V old = v;
            v = value;
            return old;
        }
    }

    // The key iterator supports the keySet method
    private class KeyIterator implements Iterator<K> {
        private Iterator<Entry<K, V>> entries = entrySet().iterator();
        public boolean hasNext() { return entries.hasNext(); }
        public K next() { return entries.next().getKey();}
        public void remove() { throw new UnsupportedOperationException(); }
    }

    // The value iterator supports the values method
    private class ValueIterator implements Iterator<V> {
        private Iterator<Entry<K, V>> entries = entrySet().iterator();
        public boolean hasNext() { return entries.hasNext(); }
        public V next() { return entries.next().getValue(); }
        public void remove() { throw new UnsupportedOperationException(); }
    }

    private class KeyIterable implements Iterable<K> {
        public Iterator<K> iterator(){
            return new KeyIterator();
        }
    }

    private class ValueIterable implements Iterable<V> {
        public Iterator<V> iterator() {
            return new ValueIterator();
        }
    }


}
