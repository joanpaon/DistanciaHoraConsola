package org.japo.java.main;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Locale - Expresión alternativa
        Locale lcl = new Locale("EN", "uk");

        // Scanner
        Scanner scn = new Scanner(System.in, "ISO-8859-1");
        scn.useLocale(lcl);

        // Gregorian Calendar
        GregorianCalendar gc = new GregorianCalendar();

        // Proceso
        try {
            // Hora Entrada
            System.out.print("Hora inicio ......: ");
            int hEnt = scn.nextInt();
            scn.nextLine();
            System.out.print("Minuto inicio ....: ");
            int mEnt = scn.nextInt();
            scn.nextLine();
            System.out.print("Segundo inicio ...: ");
            int sEnt = scn.nextInt();
            scn.nextLine();

            // Hora Actual
            int hAct = gc.get(Calendar.HOUR_OF_DAY);
            int mAct = gc.get(Calendar.MINUTE);
            int sAct = gc.get(Calendar.SECOND);

            // Tiempos
            int tiempoEnt = hEnt * 3600 + mEnt * 60 + sEnt;
            int tiempoAct = hAct * 3600 + mAct * 60 + sAct;

            // Segundos
            int sDis = tiempoAct - tiempoEnt;

            // Minutos
            int mDis = sDis / 60;
            sDis = sDis % 60;

            // Horas
            int hDis = mDis / 60;
            mDis = mDis % 60;

            // Salidas
            System.out.printf("Hora inicio ......: %02d:%02d:%02d\n", hEnt, mEnt, sEnt);
            System.out.printf("Hora actual ......: %02d:%02d:%02d\n", hAct, mAct, sAct);
            System.out.printf("Tiempo de clase ..: %2d:%02d:%02d\n", hDis, mDis, sDis);
        } catch (Exception e) {
            System.out.println("Error de entrada");
            scn.nextLine();
        }
    }
}
