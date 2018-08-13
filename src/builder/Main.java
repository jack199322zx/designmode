package builder;

public class Main {
    public static void main(String[] args) {
        Hero hero = Hero.builder()
                .age("25")
                .id(1)
                .name("hero")
                .country("china")
                .build();
        System.out.println(hero);
    }
}
