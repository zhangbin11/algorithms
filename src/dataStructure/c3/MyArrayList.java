package dataStructure.c3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 标题、简要说明.
 * <p>
 * Copyright: Copyright (c) 2021-02-25 17:02
 * <p>
 * Company: 布局未来
 * <p>
 *
 * @author zhangbin11
 * @email zhangbin11@xdf.cn
 */
public class MyArrayList<T> implements Iterable<T>{

    private static final int DEFAULT_CAPACITY = 10;

    private T[] items;
    private int size;

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }

    public MyArrayList(){
        doClear();
    }

    public int size(){
        return size;
    }

    public void clear(){
        doClear();
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public void trimToSize(){
        ensureCapaccity(size);
    }

    public T get(int idx){
        if(idx<0 || idx>size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        return items[idx];
    }


    public T set(int idx,T newVal){
        if(idx<0 || idx>size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        T old = items[idx];
        items[idx] = newVal;
        return old;
    }

    public boolean add(T newVal){
        set(size(),newVal);
        return true;
    }

    public boolean add(int idx,T newVal){
        if(items.length==size()){
            ensureCapaccity(size()*2+1);
        }
        for(int i=size;i>idx;i--){
            items[i]=items[i-1];
        }
        items[idx]=newVal;
        return true;
    }

    public T remove(int idx){
        T removedItem = items[idx];
        for(int i=idx;i<size-1;i++){
            items[i]=items[i+1];
        }
        size--;
        return removedItem;
    }


    private void doClear(){
        size=0;
        ensureCapaccity(DEFAULT_CAPACITY);
    }

    public void ensureCapaccity(int newCapacity) {
        if(newCapacity < size){
            return;
        }

        T[] old = items;

        items = (T[]) new Object[newCapacity];

        for(int i=0;i<size();i++){
            items[i]=old[i];
        }

    }

    private class ArrayListIterator implements Iterator<T>{

        private int current = 0;


        @Override
        public boolean hasNext() {
            return current < size();
        }

        @Override
        public T next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            return items[current++];
        }

        @Override
        public void remove() {
            MyArrayList.this.remove(--current);
        }
    }

}
