package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class MyGraph<T> implements MyGraphBase<T>{

    private ArrayList<MyNode<T>> nodi;
    private ArrayList<ArrayList<MyArch<T>>> archi;
    private int size;

    public MyGraph(){
        nodi = new ArrayList<>();
        archi = new ArrayList<>();
        size=0;
    }


    @Override
    public MyGraph<T> addNode(MyNode<T> n) {
        if(!nodi.contains(n)) {
            nodi.add(n);
            archi.add(new ArrayList<>());
            size++;
        }
        return this;
    }

    @Override
    public MyGraph<T> addArch(MyNode<T> from, MyNode<T> to, int weight) {
        if(contains(from) && contains(to)){
            archi.get(nodi.indexOf(from)).add(new MyArch<>(from,to,weight));
        }
        return this;
    }

    @Override
    public Boolean contains(MyNode<T> node) {
        for(MyNode<T> n : nodi){
            if(n==node || n.val==node.val) return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public Iterator<MyNode<T>> getNodeIterator() {
        return nodi.iterator();
    }

    @Override
    public Iterator<MyArch<T>> getNodeArchIterator(MyNode<T> node) {
        final int idx = nodi.indexOf(node);
        return idx == -1 ? null : archi.get(idx).iterator();
    }

    @Override
    public Iterator<MyArch<T>> getOutArchIterator(MyNode<T> node) {
        return getNodeArchIterator(node);
    }

    @Override
    public Iterator<MyArch<T>> getInArchIterator(MyNode<T> node) {
        ArrayList<MyArch<T>> res = new ArrayList<>();
        int i=0;
        for(ArrayList<MyArch<T>> a : archi){
            if(i!=nodi.indexOf(node)){
                for(MyArch<T> a2 : a){
                    if(a2.to==node) res.add(a2);
                }
            }
        }
        return res.iterator();
    }

    @Override
    public Boolean deleteArch(MyArch<T> arco) {
        return null;
    }

    @Override
    public Boolean deleteArch(MyNode<T> from, MyNode<T> to) {
        return null;
    }

    @Override
    public Boolean deleteNode(MyNode<T> node) {
        return null;
    }

    @Override
    public Boolean deleteNode(T val) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public MyGraph<T> getMst() {
        return null;
    }

    @Override
    public Boolean isTree() {
        return null;
    }

    @Override
    public Boolean thereIsNegativeCicle() {
        return null;
    }

    @Override
    public int getWeightOfRoute(MyNode<T> from, MyNode<T> to) {
        return 0;
    }

    public Boolean isHamiltonian(){
        return null;
    }

}
