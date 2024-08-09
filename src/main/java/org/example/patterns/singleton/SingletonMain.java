package org.example.patterns.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        IAmSingletonLazy iAmSingletonLazy1 = IAmSingletonLazy.getiAmSingletonLazy();
        IAmSingletonLazy iAmSingletonLazy2 = IAmSingletonLazy.getiAmSingletonLazy();

        System.out.println(iAmSingletonLazy1.hashCode() + " " + iAmSingletonLazy2.hashCode());
        System.out.println(iAmSingletonLazy1.equals(iAmSingletonLazy2));

        IAmSingletonEager iAmSingletonEager1 = IAmSingletonEager.getiAmSingletonEager();
        IAmSingletonEager iAmSingletonEager2 = IAmSingletonEager.getiAmSingletonEager();

        System.out.println(iAmSingletonEager1.hashCode() + " " + iAmSingletonEager2.hashCode());
        System.out.println(iAmSingletonEager1.equals(iAmSingletonEager2));
    }
}
