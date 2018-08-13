package builder;

public class Hero {

    private int id;
    private String name;
    private String age;
    private String country;

    public Hero(int id, String name, String age, String country) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int id;
        private String name;
        private String age;
        private String country;

        public Builder id(int id) {
            this.id =  id;
            return this;
        }
        public Builder name(String name) {
            this.name =  name;
            return this;
        }
        public Builder age(String age) {
            this.age =  age;
            return this;
        }
        public Builder country(String country) {
            this.country =  country;
            return this;
        }

        public Hero build() {
            return new Hero(id, name, age, country);
        }
    }


}
