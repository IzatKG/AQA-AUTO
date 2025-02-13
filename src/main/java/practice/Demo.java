package practice;

public class Demo implements B,A {

    @Override
    public void print() {
        B.super.print();
    }
}
