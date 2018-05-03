package com.company;

import java.util.Iterator;

public interface MyGraphBase<T>{
    public MyGraph<T> addNode(final MyNode<T> n);
    public MyGraph<T> addArch(final MyNode<T> from,final MyNode<T> to,final int weight);
    public Boolean contains(final MyNode<T> node);
    public Iterator<MyNode<T>> getNodeIterator();
    public Iterator<MyArch<T>> getNodeArchIterator(final MyNode<T> node);
    public Iterator<MyArch<T>> getOutArchIterator(final MyNode<T> node);
    public Iterator<MyArch<T>> getInArchIterator(final MyNode<T> node);
    public Boolean deleteArch(MyArch<T> arco);
    public Boolean deleteArch(MyNode<T> from, MyNode<T> to);
    public Boolean deleteNode(MyNode<T> node);
    public Boolean deleteNode(T val);
    public int size();
    public MyGraph<T> getMst();
    public Boolean isTree();
    public Boolean thereIsNegativeCicle();
    public int getWeightOfRoute(MyNode<T> from, MyNode<T> to);
    public Boolean isHamiltonian();
}
