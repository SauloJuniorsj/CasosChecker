/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.LuizCzaikowski.APICovid19;

import casoschecker.FactoryJBDC;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Saulo Jr
 */
public class PessoasRepDB implements RepositoryInterface<Integer, Pessoas> {

    @Override
    public List<Pessoas> all() {
        List<Pessoas> lista = new ArrayList<>();

        try (Connection connec = FactoryJBDC.conexao()) {
            String sql = "SELECT * FROM Pessoas";
            Statement statement = connec.createStatement();
            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                Pessoas p = null;
                p = new Pessoas(
                        p.getPosicao(),
                        p.getDataInclude(),
                        p.getClassificacao(),
                        p.getIdade(),
                        p.getSexo(),
                        p.getEncerramento(),
                        p.getDataObito());

                lista.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PessoasRepDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    @Override
    public void Media(Pessoas entidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Moda(Pessoas entidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
