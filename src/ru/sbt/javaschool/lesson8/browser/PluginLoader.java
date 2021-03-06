package ru.sbt.javaschool.lesson8.browser;

/**
 * Created by Артём on 09.10.2016.
 */

import java.net.URL;
import java.net.URLClassLoader;

public class PluginLoader extends URLClassLoader {

    public PluginLoader(URL[] urls) {
        super(urls);
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        if (name.startsWith("ru.sbt.javaschool.lesson8") || name.startsWith("java")) {
            return super.loadClass(name);
        }
        return findClass(name);
    }
}
