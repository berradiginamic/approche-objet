package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void testCalendar() {
        // Création d'une instance de Calendar et initialisation à la date du 19 mai 2016 à 23:59:30
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2016, Calendar.MAY, 19, 23, 59, 30);
        Date dateCalendar1 = calendar1.getTime();
        afficherDateAuFormat(dateCalendar1, "dd/MM/yyyy");

        // Création d'une instance de Calendar et initialisation à la date du jour
        Calendar calendar2 = Calendar.getInstance();
        Date dateCalendar2 = calendar2.getTime();
        afficherDateAuFormat(dateCalendar2, "yyyy/MM/dd HH:mm:ss");

                afficherDateAvecLangues(dateCalendar2);
    }

    private static void afficherDateAuFormat(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        System.out.println(sdf.format(date));
    }

    private static void afficherDateAvecLangues(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);


        SimpleDateFormat sdfFrench = new SimpleDateFormat("dd MMMM yyyy", Locale.FRENCH);
        System.out.println("En français : " + sdfFrench.format(date));


        SimpleDateFormat sdfRussian = new SimpleDateFormat("dd MMMM yyyy", new Locale("ru", "RU"));
        System.out.println("En russe : " + sdfRussian.format(date));


        SimpleDateFormat sdfChinese = new SimpleDateFormat("yyyy年MM月dd日", Locale.CHINESE);
        System.out.println("En chinois : " + sdfChinese.format(date));


        SimpleDateFormat sdfGerman = new SimpleDateFormat("dd. MMMM yyyy", Locale.GERMAN);
        System.out.println("En allemand : " + sdfGerman.format(date));

        SimpleDateFormat sdfArrabe = new SimpleDateFormat("dd. MMMM yyyy", new Locale("ar", "SA"));
        System.out.println("En arrabe : " + sdfArrabe.format(date));

        SimpleDateFormat sdfArrabe1 = new SimpleDateFormat("dd. MMMM yyyy", new Locale("ar", "DZ"));
        System.out.println("En arrabe : " + sdfArrabe1.format(date));
    }
}
