package main.java.com.volkova.rethrowing;

public class RethrowingApp {
    public void someMethod() throws ArithmeticException {
        someMethod2();
    }

    public void someMethod2() throws ArithmeticException {
        throw new ArithmeticException();
    }
}