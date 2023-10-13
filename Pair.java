package org.example.calculator;

public class Pair {

    private final Object objFirst;
    private final Object objSecond;

    public Pair(Object objFirst, Object objSecond) {
        this.objFirst = objFirst;
        this.objSecond = objSecond;
    }

    public Object getFirst() {
        return objFirst;
    }

    public Object getSecond() {
        return objSecond;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "objFirst=" + objFirst +
                ", objSecond=" + objSecond +
                '}';
    }
}
