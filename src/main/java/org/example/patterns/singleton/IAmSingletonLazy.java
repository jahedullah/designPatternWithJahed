package org.example.patterns.singleton;

/*
* lazy way of creating singleton.
* well we have to make it threadsafe as well as we do not want to create any duplicate object.
* you can use also block level synchronization.
* */
public class IAmSingletonLazy {
    private static IAmSingletonLazy iAmSingleTonLazy;

    private IAmSingletonLazy() {

    }

    public synchronized static IAmSingletonLazy getiAmSingletonLazy() {
        if (iAmSingleTonLazy == null) {
            iAmSingleTonLazy = new IAmSingletonLazy();
        }

        return iAmSingleTonLazy;
    }
}
