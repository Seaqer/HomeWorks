package ru.sbt.javaschool.lesson8.browser.plugin.myplugin;

import  ru.sbt.javaschool.lesson8.browser.Plugin;

public class myplg implements Plugin {
    @Override
    public void doUsefull() {
        System.out.println("MyPlugin doUsefull 1");
        new Trace().traceConsole();
    }
}