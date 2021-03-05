package dataStructure.c3;

import java.util.Iterator;

/**
 * 标题、简要说明.
 * <p>
 * Copyright: Copyright (c) 2021-03-01 18:01
 * <p>
 * Company: 布局未来
 * <p>
 *
 * @author zhangbin11
 * @email zhangbin11@xdf.cn
 */
public class MyLinkedList<T> implements Iterable<T>{

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private static class Node<T>{
        public Node(){}

        public Node(T data, Node<T> prev, Node<T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        public T data;
        private Node<T> prev;
        private Node<T> next;
    }

}
