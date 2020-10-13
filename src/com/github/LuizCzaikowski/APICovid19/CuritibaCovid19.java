package com.github.LuizCzaikowski.APICovid19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Luiz_
 */
public class CuritibaCovid19 {

    public void run() {
        
        String arquivoCSV = "C:\\Users\\Luiz_\\Documents\\NetBeansProjects\\CasosChecker\\CasosCovid.csv";
        BufferedReader br = null;
        String linha = "";
        String csvDivisor = ",";
        try {

            br = new BufferedReader(new FileReader(arquivoCSV));
            while ((linha = br.readLine()) != null) {

                String[] pais = linha.split(csvDivisor);

                System.out.println("Teste: " + arquivoCSV );

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
