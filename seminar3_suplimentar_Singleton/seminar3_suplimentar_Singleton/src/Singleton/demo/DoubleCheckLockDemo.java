package Singleton.demo;

import Singleton.atribute.DoubleCheckLock;

public class DoubleCheckLockDemo {
    public static void main(String[] args) {

        DoubleCheckLock doubleCheckLock = DoubleCheckLock.getInstance();
    }
}
