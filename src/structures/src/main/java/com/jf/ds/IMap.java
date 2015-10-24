package com.jf.ds;

public interface IMap<K, V> {

	V get(K key);

	void put(K key, V value);

	void remove(K key);

}