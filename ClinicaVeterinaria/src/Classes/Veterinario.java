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
public class Veterinario extends Profissional{
    private String crmv, especialidade;

    public Veterinario() {
    }

    public Veterinario(String crmv, String especialidade) {
        this.crmv = crmv;
        this.especialidade = especialidade;
    }

    public Veterinario(int codigo, String nome, ArrayList<String> telefones, String crmv, String especialidade) {
        super(codigo, nome, telefones);
        this.crmv = crmv;
        this.especialidade = especialidade;
    }

    public String getCrmv() {
        return crmv;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Veterinario{" + "crmv=" + crmv + ", especialidade=" + especialidade + '}';
    }
    
    
}
