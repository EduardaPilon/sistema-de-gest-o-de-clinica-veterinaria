/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author eduar
 */
public class Animal {
    private String nome, especie, raca;
    private LocalDate dataNascimento;
    private Tutor tutor;

    public Animal(String nome, String especie, String raca, LocalDate dataNascimento, Tutor tutor) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.tutor = tutor;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaca() {
        return raca;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", especie=" + especie + ", raca=" + raca + ", dataNascimento=" + dataNascimento + ", tutor=" + tutor + '}';
    }
    
    
}
