package com.company;

public class MyArch <T>{
    MyNode<T> from;
    MyNode<T> to;
    float weight;

    public MyArch(MyNode<T> from, MyNode<T> to, float weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public MyNode<T> getFrom() {
        return from;
    }

    public void setFrom(MyNode<T> from) {
        this.from = from;
    }

    public MyNode<T> getTo() {
        return to;
    }

    public void setTo(MyNode<T> to) {
        this.to = to;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
