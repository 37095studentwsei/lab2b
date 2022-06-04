package pl.lublin.wsei.java.cwiczenia.test;

public class TestGusInfoGraphicList {
    public static void main(String[] args) {
        GusInfoGraphicList list = new GusInfoGraphicList("src/main/java/pl/lublin/wsei/java/cwiczenia/gusInfoGraphic.xml");
        for (Infografika ig: list.infografiki) ig.print();
    }
}