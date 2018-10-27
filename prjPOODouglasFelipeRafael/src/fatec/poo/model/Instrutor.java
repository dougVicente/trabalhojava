/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author Dougla
 */
public class Instrutor {
private String  Formacao;
private String AreaAtuacao;


    public Instrutor(String Nome, String CPF) {
        this.Nome = Nome;
        this.CPF = CPF;
    }



    public void setFormacao(String Formacao) {
        this.Formacao = Formacao;
    }

    public void setAreaAtuacao(String AreaAtuacao) {
        this.AreaAtuacao = AreaAtuacao;
    }



  
}
