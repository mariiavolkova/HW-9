package main.java.com.volkova.executor;

import main.java.com.volkova.division.SafeDivision;
import main.java.com.volkova.exception.ExceptionA;
import main.java.com.volkova.exception.ExceptionB;
import main.java.com.volkova.rethrowing.RethrowingApp;

import java.io.IOException;

public class Executor {
    public void start() {
        try {
            throw new ExceptionA();
        } catch (ExceptionA Exception) {
            Exception.printStackTrace();
        }

        try {
            throw new ExceptionB();
        } catch (ExceptionB Exception) {
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