package deque;

public class LinkedListDeque<T> {
    private int size;
    private Node<T> sentinel;
    private static class Node<T>{
        public T item;
        public Node<T> next;
        public Node<T> last;
        public Node(T i, Node<T> n, Node<T> l)
        {
            item = i;
            next = n;
            last = l;
        }


    }
    public LinkedListDeque()
    {
        size = 0;
        sentinel = new Node<T> (null,null, null);
        sentinel.last = sentinel;
        sentinel.next = sentinel;

    }
    public T getRecursive(int index)
    {
       if(index<0||index>=size) return null;
       return null;
    }
    public void addFirst(T item)
    {
        size += 1;
        Node<T> first = new Node<T>(item, sentinel.next, sentinel);
        sentinel.next.last = first;
        sentinel.next = first;
    }
    public void addLast(T item)
    {
        size += 1;
        Node<T> last = new Node<T>(item,sentinel,sentinel.last);
        sentinel.last.next = last;
        sentinel.last = last;
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public int size(){
        return size;
    }
    public void printDeque(){
        Node<T> p = sentinel.next;
        while(p != sentinel)
        {
            System.out.printf(p.item + " ");
            p = p.next;
        }
        System.out.println("\n");

    }
    public T removeFirst()
    {
        if(size==0) return null;
        size--;
        T removed = sentinel.next.item;
        sentinel.next = sentinel.next.next;
        return removed;

    }
    public T removeLast()
    {
        if(size==0) return null;
        size--;
        T removed = sentinel.last.item;
        sentinel.last = sentinel.last.last;
        return removed;

    }
    public T get(int index)
    {
       if(index<0||index>=size) return null;
       Node<T> p = sentinel;
       for(int i=0;i<=index;i++)
       {
           p = p.next;
       }
       return p.item;
    }


}
