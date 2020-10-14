package com.github.LuizCzaikowski.APICovid19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Luiz_
 */
public class CuritibaCovid19 {

    public PessoasRep run() throws IOException {

        PessoasRep lista = new PessoasRep();

        String arquivoCSV = "CasosCovid.csv";
        String linha = "";
        String csvDivisor = ";";
        FileReader fileReader = new FileReader(arquivoCSV);

        try (BufferedReader br = new BufferedReader(fileReader)) {
            while ((linha = br.readLine()) != null) {

                String[] dados = linha.split(csvDivisor);

                if (!dados[0].contains("POS")) {

                    Pessoas p = new Pessoas(Integer.parseInt(dados[0]), dados[1], dados[2].toString(), Integer.parseInt(dados[3]), dados[4].toString(), dados[5].toString(), dados[6].toString());
                    lista.lista.add(p);

                } else {
                    break;
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return lista;

    }
}
