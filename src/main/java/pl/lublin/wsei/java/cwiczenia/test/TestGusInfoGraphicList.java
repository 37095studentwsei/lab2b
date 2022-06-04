package pl.lublin.wsei.java.cwiczenia.test;

import pl.lublin.wsei.java.cwiczenia.test.GusInfoGraphicList;
import pl.lublin.wsei.java.cwiczenia.test.Infografika;

public class TestGusInfoGraphicList {
    public static void main(String[] args) {
        GusInfoGraphicList list = new GusInfoGraphicList("src/main/java/pl/lublin/wsei/java/cwiczenia/gusInfoGraphic.xml");
        for (Infografika ig: list.infografiki) ig.print();
    }
}