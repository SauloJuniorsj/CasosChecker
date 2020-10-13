package casoschecker;

import com.github.LuizCzaikowski.APICovid19.CuritibaCovid19;
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
