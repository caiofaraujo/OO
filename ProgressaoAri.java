/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        // Regre de Negócio do método
        valorInicial = valorInicial + razao;
    }
    
    public int valorAtual() {
        return valorInicial;
    }
    
}
