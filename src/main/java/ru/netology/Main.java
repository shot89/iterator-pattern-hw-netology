package ru.netology;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int r : new Randoms(90, 100)) {
            System.out.println("Случайное число: " + r);
            Thread.sleep(1000);
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}