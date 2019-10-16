public class ConditionalStatement {

    public static void main(String[] args) {
        int age = 39;
        if (age > 20) {
            System.out.println("My age over twenty");
        }

        boolean isMale = true;
        if (isMale) {
            System.out.println("I am male");
        }

        if (!isMale) {
            System.out.println("I am female");
        }

        float height = 1.78f;
        if (height > 1.8) {
            System.out.println("My height above 1.80m");
        } else {
            System.out.println("My height smaller 1.80m");
        }

        char firstNameLetter = 'I';
        if (firstNameLetter == 'M') {
            System.out.println("My name started from M");
        } else if (firstNameLetter == 'I') {
            System.out.println("My name started from I");
        } else {
            System.out.println("My name started from another letter");
        }
    }
}
