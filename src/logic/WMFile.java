/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Wojtek
 */
public class WMFile {

    @SuppressWarnings("empty-statement")
    public static int[] odczyt(String sciezka) throws FileNotFoundException, IOException {

        ArrayList zawPliku = new ArrayList();
        FileReader fr = new FileReader(sciezka);
        BufferedReader br = new BufferedReader(fr);

        String linia = "";
        while ((linia = br.readLine()) != null) {
            zawPliku.add(linia);
        }

        int [] plik = new int[zawPliku.size()];
        for (int i = 0; i < zawPliku.size(); i++) {
            plik[i] = Integer.parseInt(zawPliku.get(i).toString());
        }
        
        int[] liczby = {100, 124, 158, 111, 232, 251, 190, 123, 652, 212, 43, 234, 423, 122, 534, 124, 125, 356, 244, 132, 532, 663, 235, 135, 132, 256, 533, 234, 224, 123};
        return plik;
    }
}
