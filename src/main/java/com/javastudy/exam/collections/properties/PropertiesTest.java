package com.javastudy.exam.collections.properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("autosave", "5");
        p.setProperty("language", "한글");
        p. setProperty("time","tick");

        System.out.println(p); //tostring 으로 출력
        System.out.println(p.get("time"));
        System.out.println(p.getProperty("to","totn"));
        System.out.println(p.getProperty("language","totn"));

        try {
            p.store(new FileOutputStream("./output.txt"), "Properties Example"); // 텍스트로 저장, 여기서는 한글이 깨짐
            p.storeToXML(new FileOutputStream("output.xml"), "Properties Example"); // xml로 저장
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
