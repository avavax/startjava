public class Variable {

    public static void main(String[] args) {

        byte core = 4;
        short drivers = 3;
        int winDigits = 64;
        long price = 45000;
        float frequens = 3.2f;
        double ram = 8.19d;
        char operationSystem = 'w';
        boolean isNotebook = false;

        System.out.println("Количество ядер: " + core);
        System.out.println("Количество дисков: " + drivers);
        System.out.println("Разрядность ОС: " + winDigits);
        System.out.println("Цена, руб: " + price);
        System.out.println("Частота процессора, Ггц: " + frequens);
        System.out.println("Оперативная память, Гб: " + ram);
        System.out.println("Тип ОС: " + operationSystem);
        System.out.println("Ноутбук: " + isNotebook);
    }
}
