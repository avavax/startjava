package com.startjava.lesson01.unicode;

public class Unicode {

    public static void main (String[] args) {
        for (int i = 9398; i <= 10178; i++) {
            System.out.print((char)i);
        }
    }

    // Запуск
    // java -cp build -Dfile.encoding=UTF-8 Unicode
}
