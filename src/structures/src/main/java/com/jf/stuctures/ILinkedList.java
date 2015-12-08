package com.jf.stuctures;

public interface ILinkedList<T> {

	boolean isEmpty();

	int size();

	void addFirst(T item);

	void addLast(T item);

	T removeFirst();

	T removeLast();

}