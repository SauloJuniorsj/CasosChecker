package casoschecker;

import com.github.LuizCzaikowski.APICovid19.CuritibaCovid19;
import com.github.LuizCzaikowski.APICovid19.Pessoas;
import com.github.LuizCzaikowski.APICovid19.PessoasRep;
import com.github.LuizCzaikowski.APICovid19.PessoasRepDB;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.io.IOException;
import java.lang.Iterable;
/**
 *
 * @author Saulo Jr
 */
public class CasosChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        PessoasRepDB banco = new PessoasRepDB();
        CuritibaCovid19 obj = new CuritibaCovid19();
        PessoasRep pessoa = new PessoasRep();
        banco.DezDesc();
        banco.Media();
      /*  pessoa = obj.run();
        obj.printar(pessoa);
       
        for(Pessoas p : pessoa.lista){
            banco.Insert(p);
        }*/
    }
}
