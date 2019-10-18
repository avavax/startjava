public class WolfTest {

    public static void main(String[] args) {
         Wolf wolf = new Wolf();
         System.out.println(wolf.getAge());
         wolf.setAge(9);
         wolf.setAge(3);
         System.out.println(wolf.getAge());
         wolf.say();
    }
}