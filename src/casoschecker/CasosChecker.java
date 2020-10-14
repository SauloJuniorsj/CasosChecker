package casoschecker;

import com.github.LuizCzaikowski.APICovid19.CuritibaCovid19;
import com.github.LuizCzaikowski.APICovid19.PessoasRep;
import java.io.IOException;
/**
 *
 * @author Saulo Jr
 */
public class CasosChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        CuritibaCovid19 obj = new CuritibaCovid19();
        PessoasRep pessoa = new PessoasRep();
        pessoa = obj.run();
        obj.printar(pessoa);
       
    }
}
