package fr.diginamic.chaine;

public class TestStringBuilder {
    public static void main(String[] args) {
        long debut1 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= 100000; i++) {
            stringBuilder.append(i);
        }

        long fin1 = System.currentTimeMillis();
        System.out.println("Temps écoulé avec StringBuilder en millisecondes : " + (fin1 - debut1));

        long debut2 = System.currentTimeMillis();
        String result = "";

        for (int i = 1; i <= 100000; i++) {
            result += i;
        }

        long fin2 = System.currentTimeMillis();
        System.out.println("Temps écoulé avec String en millisecondes : " + (fin2 - debut2));
    }
}
