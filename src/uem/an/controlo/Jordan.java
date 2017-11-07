
package uem.an.controlo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author José Seie
 * @author Claudio Sumburane
 * 
 */
public class Jordan {
   
    Scanner s = new Scanner(System.in);
    
    public String[][] lerMatriz()
    {
        System.out.println("DIgite  o sistema de equacoes valido: ");
        System.out.println("Insira a primeira linha do sistema ex: (2x1 - 4x2 + x3 = 4) ");
        
        String firstLine = s.nextLine();
        
        if(!linhaValida(firstLine))
        {
            this.mostreErros(firstLine);
            return null;
        }
        
        String secondLine = s.nextLine();
        
        if(!linhaValida(secondLine))
        {
            this.mostreErros(secondLine);
            return null;
        }
        
        String thirdLine = s.nextLine();
        
        if(!linhaValida(thirdLine))
        {
            this.mostreErros(thirdLine);
            return null;
        }
        
        return null;
    }
    
    public boolean linhaValida(String linhaLinha)
    {
        System.out.println(Arrays.toString(linhaLinha.split("x")));
        return false;
    }
    
    public boolean linhaTratada(String linhaLinha)
    {
        return false;
    }
    
    public void mostreErros(String linhaErrada)
    {
        System.err.println("A linha: "+linhaErrada+" eh invalida");
        System.err.println("O Sistema, vai terminar. recomece a operacao");
    }
    
    
    
    
}
