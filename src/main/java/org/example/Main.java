package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // Havlayan Köpek
    public static boolean shouldWakeUp(boolean barking, int clock) {
        if (clock < 0 || clock > 23) {
            return false;
        }
        return barking && (clock < 8 || clock >= 20);
    }

    // Yaş Tespiti
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);
    }

    // Oyuncu Kedi
    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int upperLimit = isSummer ? 45 : 35;
        return temp >= 25 && temp <= upperLimit;
    }

    // Dikdörtgen Alanı
    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1;
        }
        return width * height;
    }

    // Daire Alanı
    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }
}