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
public class Empregado extends Pessoa{
    
    private String cnpj;
    private double salario;
    private int matricula;

    public Empregado(String nome, char sexo, int idade, String cnpj, double salario, int matricula) {
        super(nome, sexo, idade);
        this.cnpj = cnpj;
        this.salario = salario;
        this.matricula = matricula;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
