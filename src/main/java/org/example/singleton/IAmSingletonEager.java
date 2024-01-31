package org.example.singleton;

public class IAmSingletonEager {
    /*
     * this is the eager strategy to create a singleton object.
     * not good for bulk usages. Only use when you are sure that client must have to use this object.
     *
     * */
    private static IAmSingletonEager iAmSingletonEager = new IAmSingletonEager();

    public static IAmSingletonEager getiAmSingletonEager() {
        return iAmSingletonEager;
    }
}
