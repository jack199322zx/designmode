package factory;


public class Main {

    public static void main(String[] args) {
        SpiderFactory spiderFactory = new SpecificSpiderFactory();
        Spider spider = spiderFactory.create();
        spider.spide();
    }
}
