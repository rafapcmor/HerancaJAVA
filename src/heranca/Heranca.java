/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

import java.util.ArrayList;

/**
 *
 * @author rafa
 */
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Vendedor v1 = new Vendedor("Nathan", 'M', 21, "53453498548345", 6000, 34);
        Vendedor v2 = new Vendedor("Samuel", 'M', 22, "53388964325", 6000, 31);
        
        ArrayList<Vendedor> vendedores = new ArrayList<>();
        
        vendedores.add(v1);
        vendedores.add(v2);
        
        
        Gerente g = new Gerente("Julio", 'M', 36, "653543345", 12000, 2, "Eletrodoméstico");
        
        g.setConjuntoVendedor(vendedores);
        
        Produto p1 = new Produto("Liquidificador", 160);
        Produto p2 = new Produto("Sanduicheira", 80);
        Produto p3 = new Produto("Ventilador", 200);
        
        Cliente c = new Cliente("João", 'M', 20, "654457654");
        
        Venda ve1 = new Venda(p1, c, 5);
        Venda ve2 = new Venda(p2, c, 2);
        Venda ve3 = new Venda(p3, c, 10);
        
        ArrayList<Venda> vendas = new ArrayList<>();
        vendas.add(ve1);
        vendas.add(ve2);
        vendas.add(ve3);
        
        v1.setConjuntoVendas(vendas);
        
        System.out.println("O valor total de vendas do vendedor "+ v1.getNome() + " e R$ "+ v1.obterValorTotalVendas());
        System.out.println("A menor venda do vendedor "+ v1.getNome() + " e "+ v1.obterVendaMenorValor().getProdutoVendido().getNome());
        
        System.out.println("O valor total da venda do cliente " + c.getNome() +" e R$ "+ ve1.obterValorVendas());
        
    }
    
}
