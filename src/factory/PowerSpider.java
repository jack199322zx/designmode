package factory;

/**
 * 力量型爬虫
 */
public class PowerSpider implements Spider{

    private String name;

    public PowerSpider(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PowerSpider{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void spide() {
        System.out.println(this);
    }

}
