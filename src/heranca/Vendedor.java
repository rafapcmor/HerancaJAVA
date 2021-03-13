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
public class Vendedor extends Empregado{

       ArrayList<Venda> conjuntoVendas;

    public Vendedor(String nome, char sexo, int idade, String cnpj, double salario, int matricula) {
        super(nome, sexo, idade, cnpj, salario, matricula);
        conjuntoVendas = new ArrayList<>();
    }

    public ArrayList<Venda> getConjuntoVendas() {
        return conjuntoVendas;
    }

    public void setConjuntoVendas(ArrayList<Venda> conjuntoVendas) {
        this.conjuntoVendas = conjuntoVendas;
    }
    
    public double obterValorTotalVendas(){
        double soma=0;
           for (Venda v: conjuntoVendas) {
               soma += v.obterValorVendas();
           }
        return soma;   
    }
    
    public Venda obterVendaMenorValor(){
  
        Venda vMenor = conjuntoVendas.get(0);
        double valorMenor = conjuntoVendas.get(0).obterValorVendas();
        for(int i = 1; i < conjuntoVendas.size();i++){
            if(conjuntoVendas.get(i).obterValorVendas() < valorMenor){
                vMenor = conjuntoVendas.get(i);
                valorMenor = conjuntoVendas.get(i).obterValorVendas();
            }
        }
        return vMenor;
    }
    public double obterValorVendaMedia(){
        
        double vendaMedia = 0;
   
        // completar
        return vendaMedia;
    }
}
