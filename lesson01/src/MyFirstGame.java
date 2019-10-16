public class MyFirstGame {

    public static void main(String[] args) {
        int question = 25; // 0-100
        int answer = 5;

        while (answer != question) {
            if (answer > question) {
                System.out.println("You answer too big");
            } else {
                System.out.println("You answer too small");
            }

            // TO DO здесь должен быть ввод с клавиатуры
            answer = 25;
        }

        System.out.println("You win!");
    }
}
