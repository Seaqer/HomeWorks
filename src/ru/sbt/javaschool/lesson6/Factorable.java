package ru.sbt.javaschool.lesson6;

public interface Factorable {

    <T> T getBean(Class<T> cls);

    void close();
}
