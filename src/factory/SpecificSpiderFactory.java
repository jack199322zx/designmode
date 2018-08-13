package factory;

import java.util.Random;

/**
 *  具体工厂，生产什么样的爬虫自己内部决定，可扩展多个具体工厂
 */
public class SpecificSpiderFactory extends SpiderFactory {

    private static Random random = new Random();

    @Override
    public Spider create() {
        Spider spider = null;
        switch (random.nextInt(2)) {
            case 0:
                spider = new SpeedSpider("speed");
                break;
            case 1:
                spider = new PowerSpider("power");
        }
        return spider;
    }

}
