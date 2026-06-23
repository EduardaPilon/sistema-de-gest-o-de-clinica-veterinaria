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
public class Recepcionista extends Profissional{

    public Recepcionista() {
    }

    public Recepcionista(int codigo, String nome, ArrayList<String> telefones) {
        super(codigo, nome, telefones);
    }

    @Override
    public String toString() {
        return "Recepcionista{" + '}';
    }
    
}
