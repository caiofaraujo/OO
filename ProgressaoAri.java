// Exercicio Classe 3

package OO;

/**
 *
 * @author caio.faraujo
 */
public class ProgressaoAri {
    public int valorInicial;
    public int razao;
    
    public ProgressaoAri (int valorInicial, int razao) {
        this.valorInicial = valorInicial;
        this.razao = razao;
    }
    
    public void proximoValor() {
        valorInicial = valorInicial + razao;
    }
    
    public int valorAtual() {
        return valorInicial;
    }
    
}
