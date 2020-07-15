package main.java.com.volkova.executor;

import main.java.com.volkova.division.SafeDivision;
import main.java.com.volkova.exception.exceptionA;
import main.java.com.volkova.exception.exceptionB;
import main.java.com.volkova.rethrowing.RethrowingApp;

import java.io.IOException;

public class Executor {
    public void start() {
        try {
            throw new exceptionA();
        } catch (exceptionA Exception) {
            Exception.printStackTrace();
        }

        try {
            throw new exceptionB();
        } catch (exceptionB Exception) {
            Exception.printStackTrace();
        }

        try {
            throw new NullPointerException();
        } catch (NullPointerException Exception) {
            Exception.printStackTrace();
        }

        try {
            throw new IOException();
        } catch (IOException Exception) {
            Exception.printStackTrace();
        }

        new SafeDivision().division();

        try {
            new RethrowingApp().someMethod();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}