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
public class Gerente extends Empregado {
    
    ArrayList<Vendedor> conjuntoVendedor; 
    
    private String nomeGerencia;

    public Gerente(String nome, char sexo, int idade, String cnpj, double salario, int matricula, String nomeGerencia) {
        super(nome, sexo, idade, cnpj, salario, matricula);
        conjuntoVendedor = new ArrayList<>();
        this.nomeGerencia = nomeGerencia;
    }

    public ArrayList<Vendedor> getConjuntoVendedor() {
        return conjuntoVendedor;
    }

    public void setConjuntoVendedor(ArrayList<Vendedor> conjuntoVendedor) {
        this.conjuntoVendedor = conjuntoVendedor;
    }

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }
    
    
}
