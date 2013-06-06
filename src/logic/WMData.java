/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.awt.Color;

/**
 *
 * @author Wojtek
 */
public class WMData {

    private static String sciezka;
    private static Integer margines;
    private static Color kolor;

    public static Color getKolor() {
        return kolor;
    }

    public static void setKolor(Color kolor) {
        WMData.kolor = kolor;
    }

    public static Integer getMargines() {
        return margines;
    }

    public static void setMargines(Integer margines) {
        WMData.margines = margines;
    }

    public WMData() {
    }

    public static String getSciezka() {
        return sciezka;
    }

    public static void setSciezka(String sciezka) {
        WMData.sciezka = sciezka;
    }

    public static int getMaxData(int[] values) {
        int maxValue;

        maxValue = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
            }
        }
        return maxValue;
    }
}
