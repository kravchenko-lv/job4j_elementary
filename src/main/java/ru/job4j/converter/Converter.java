package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static float euroToDollar(float value) {
        float result = value * 70 / 60;
        return result;
    }

    public static float euroToRub(float value) {
        float result = value * 70;
        return result;
    }

    public static float usdToEuro(float value) {
        float result = value * 60 / 70;
        return result;
    }

    public static float usdToRub(float value) {
        float result = value * 60;
        return result;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float usd = Converter.rubleToDollar(180);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + usd + " dollar.");
        float rub = Converter.euroToRub(20);
        System.out.println("20 euro are " + rub + " rubles.");
        rub = Converter.usdToRub(30);
        System.out.println("30 dollar are " + rub + " rubles.");
        euro = Converter.usdToEuro(100);
        System.out.println("100 dollar are " + euro + " euro.");
        usd = Converter.euroToDollar(100);
        System.out.println("100 euro are " + usd + " dollar.");
    }
}
