package pl.lublin.wsei.java.cwiczenia.test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestFileRead {
    public static void main(String[] args) throws java.io.IOException{
        try{
            String contents = new String(Files.readAllBytes(Paths.get("src/main/java/pl/lublin/wsei/java/cwiczenia/gusInfoGraphic.xml")));
            System.out.println("Zawartość Pliku");
            System.out.print(contents);
        }
        catch (IOException e){
            System.out.println("Blad wczytywania pliku"+e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
