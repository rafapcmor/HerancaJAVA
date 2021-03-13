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
public class Cliente extends Pessoa{
    private String cpf;

    public Cliente(String nome, char sexo, int idade, String cpf) {
        super(nome, sexo, idade);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

   
    
}
