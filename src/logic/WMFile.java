/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Wojtek
 */
public class WMFile {

    @SuppressWarnings("empty-statement")
    public static int[] odczyt(String sciezka) throws FileNotFoundException, IOException {

        /*
         FileReader FR = new FileReader(sciezka);
         BufferedReader BR = new BufferedReader(FR);
         int[] zawPliku = null;
         String textLine;
         int i = 0;

         while ((textLine = BR.readLine()) != null) {
         zawPliku[i] = Integer.parseInt(textLine);
         i++;
         }*/
        int[] zawPliku = {100, 124, 158, 111, 232, 251, 190, 123, 652, 212, 43, 234, 423, 122, 534, 124, 125, 356, 244, 132, 532, 663, 235, 135, 132, 256, 533, 234, 224, 123};
        return zawPliku;
    }
}
