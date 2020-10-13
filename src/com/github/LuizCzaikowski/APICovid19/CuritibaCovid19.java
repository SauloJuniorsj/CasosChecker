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

    public void run() throws IOException {
        
        String arquivoCSV = "CasosCovid.csv";
        String linha = "";
        String csvDivisor = ",";
        FileReader fileReader = new FileReader(arquivoCSV);
            try(BufferedReader br = new BufferedReader(fileReader)){
            while ((linha = br.readLine()) != null) {

                String[] pais = linha.split(csvDivisor);

                System.out.println("Teste: " + arquivoCSV );

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } 

    }
}
