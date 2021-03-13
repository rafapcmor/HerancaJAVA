/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author rafa
 */
public class Venda {
    
    private Produto produtoVendido;
    private Cliente comprador;
    private int quantVendida;
    
    
    public Venda(Produto p, Cliente c, int quant){
        this.produtoVendido = p;
        this.comprador = c;
        this.quantVendida = quant;
    }

    public Produto getProdutoVendido() {
        return produtoVendido;
    }

    public void setProdutoVendido(Produto produtoVendido) {
        this.produtoVendido = produtoVendido;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public int getQuantVendida() {
        return quantVendida;
    }

    public void setQuantVendida(int quantVendida) {
        this.quantVendida = quantVendida;
    }
    
    public double obterValorVendas(){
        return produtoVendido.getValor() * quantVendida;
    }
   
    
    
}
