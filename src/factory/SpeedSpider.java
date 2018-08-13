package factory;

/**
 * 速度型爬虫
 */
public class SpeedSpider implements Spider{

    private String name;

    public SpeedSpider(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SpeedSpider{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void spide() {
        System.out.println(this);
    }
}
