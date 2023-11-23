package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        // Création d'une instance de Date à la date du jour
        Date dateDuJour = new Date();
        afficherDateAuFormat(dateDuJour, "dd/MM/yyyy");

        // Création d'une instance de Date à la date du 19/05/2016 à 23:59:30
        Date dateSpecifique = new Date(116, 4, 19, 23, 59, 30);
        afficherDateAuFormat(dateSpecifique, "yyyy/MM/dd HH:mm:ss");

        // Création d'une instance de Date avec la date/heure système
        Date dateSysteme = new Date();
        afficherDateAuFormat(dateSysteme, "yyyy/MM/dd HH:mm:ss");

        // Création de la classe Calendar
        TestCalendar.testCalendar();
    }

    private static void afficherDateAuFormat(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        System.out.println(sdf.format(date));
    }
}

