package org.example.singleton;

public class IAmSingletonLazy {
    private static IAmSingletonLazy iAmSingleTonLazy;

    private IAmSingletonLazy() {

    }

    public static IAmSingletonLazy getiAmSingletonLazy() {
        if (iAmSingleTonLazy == null) {
            iAmSingleTonLazy = new IAmSingletonLazy();
        }

        return iAmSingleTonLazy;
    }
}
