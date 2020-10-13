/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casoschecker;

import com.github.LuizCzaikowski.APICovid19.CuritibaCovid19;
import java.io.IOException;

/**
 *
 * @author Saulo Jr
 */
public class CasosChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuritibaCovid19 obj = new CuritibaCovid19();
        obj.run();
    }
    
}
