/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author eduar
 */
public class Profissional {
    private int codigo;
    private String nome;
    private ArrayList<String> telefones;

    public Profissional() {
    }

    public Profissional(int codigo, String nome, ArrayList<String> telefones) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefones = telefones;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<String> getTelefones() {
        return telefones;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefones(ArrayList<String> telefones) {
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return "Profissional{" + "codigo=" + codigo + ", nome=" + nome + ", telefones=" + telefones + '}';
    }
    
    
}
