// Exercicio Classe 3 

package OO;

/**
 *
 * @author caio.faraujo
 */
public class Exercicio03 {
    
    
    public static void main(String[] args) {
        int valorInicial = 5;
        int razao = 3;
        
        ProgressaoAri pA = new ProgressaoAri(valorInicial, razao);    
    
        for (int i = 0; i < 10; i++) {
            System.out.println(pA.valorAtual() + "");
            pA.proximoValor();
        }
    }
}
