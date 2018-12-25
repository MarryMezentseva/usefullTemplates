package com.marry.properties;

import java.io.*;
import java.util.Properties;

public class PropertiesApp {


    public static void main(String[] args) throws Exception {
        PropertiesApp propertiesApp = new PropertiesApp();
        propertiesApp.propertiesFromDirFile();
        propertiesApp.propertiesAsResources();
    }

    public void propertiesFromDirFile() throws IOException {
        final String FILE_PATH = "propertiesFilesExmpl\\src\\main\\resources\\com\\marry\\properties\\my-context.properties";
        InputStream is = new FileInputStream(FILE_PATH);

        Properties properties = new Properties();
        properties.load(is);
        is.close();

        String url = properties.getProperty("db.connection.url");
        String port = properties.getProperty("db.connection.port");
        String name = properties.getProperty("db.connection.user.name");
        String password = properties.getProperty("db.connection.password");

        System.out.println(url);
        System.out.println(port);
        System.out.println(name);
        System.out.println(password);

        int i = 1234;
        properties.setProperty("some.prop1", "hey!!!");
        properties.setProperty("db.connection.password", "qwerty");
        properties.setProperty("db.connection.port", String.valueOf(i));

        properties.store(new FileOutputStream("propertiesFilesExmpl\\src\\main\\resources\\com\\marry\\properties\\new-my-context.properties"), "Overwritten...");

    }

    public void propertiesAsResources() throws IOException {
        final String FILE_PATH = "my-context.properties";
        InputStream is = PropertiesApp.class.getResourceAsStream(FILE_PATH);

        Properties properties = new Properties();
        properties.load(is);
        is.close();

        String url = properties.getProperty("db.connection.url");
        String port = properties.getProperty("db.connection.port");
        String name = properties.getProperty("db.connection.user.name");
        String password = properties.getProperty("db.connection.password");

        System.out.println(url);
        System.out.println(port);
        System.out.println(name);
        System.out.println(password);
    }
}
