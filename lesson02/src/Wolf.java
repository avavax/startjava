public class Wolf {

    private String name;
    private String color;
    private int weight;
    private int age;
    private boolean sex;

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void walk() {
        System.out.println("Wolf walk");
    }

    public void seat() {
        System.out.println("Wolf seat");
    }

    public void say() {
        System.out.println("Yyyyy!!!");
    }

    public void run() {
        System.out.println("Wolf run");
    }

    public void hunt() {
        System.out.println("Wolf hunt");
    }

}