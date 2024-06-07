package ru.job4j.calculator;

public class Fit {

    private static final double MAN_WEIGHT_COEFFICIENT = 1.15;
    private static final int MAN_HEIGHT_ADJUSTMENT = 100;
    private static final int WOMAN_HEIGHT_ADJUSTMENT = 110;

    public static double manWeight(int heightMan) {
        return calculateWeight(heightMan, MAN_HEIGHT_ADJUSTMENT, MAN_WEIGHT_COEFFICIENT);
    }

    public static double womanWeight(int heightWoman) {
        return calculateWeight(heightWoman, WOMAN_HEIGHT_ADJUSTMENT, MAN_WEIGHT_COEFFICIENT);
    }

    private static double calculateWeight(int height, int adjustment, double coefficient) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        return (height - adjustment) * coefficient;
    }

    public static void main(String[] args) {
        int heightMan = 187;
        int heightWoman = 164;
        double man = Fit.manWeight(heightMan);
        System.out.println(String.format("Man 187 cm is %.2f kg", man));
        double woman = Fit.womanWeight(heightWoman);
        System.out.println(String.format("Woman 164 cm is %.2f kg", woman));
    }
}
