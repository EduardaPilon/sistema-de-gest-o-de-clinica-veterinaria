/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author eduar
 */
public class Controle {
    private ArrayList<Profissional>listaProfissional = new ArrayList<>();
    private ArrayList<Animal> listaAnimal;

    public Controle() {
        this.listaProfissional = new ArrayList<>();
        listaAnimal = new ArrayList<>();
    }

    
    //Get-------------------------------------------------------------------

    public ArrayList<Profissional> getListaProfissional() {
        return listaProfissional;
    }


    public ArrayList<Animal> getListaAnimal() {
        return listaAnimal;
    }
    
    //Set-------------------------------------------------------------------
    
    public void setListaProfissional(ArrayList<Profissional> listaProfissional) {
        this.listaProfissional = listaProfissional;
    }

    public void setListaAnimal(ArrayList<Animal> listaAnimal) {
        this.listaAnimal = listaAnimal;
    }
    
    //Adicionar---------------------------------------------------------------
    
    public void addProfissional(Profissional p){
        Profissional aux = buscarProfissional(p.getCodigo());
        if(aux == null){
            listaProfissional.add(p);
            return;
        }
        throw new IllegalArgumentException("Esse código de profissional já está cadastrado");
    }
    
    public void addAnimal(Animal a){
        Animal aux = buscarAnimal(a.getCodigo());
        if(aux == null){
            listaAnimal.add(a);
            return;
        }
        throw new IllegalArgumentException("Esse código de animal já está cadastrado");
    }
          
    
    
   //Buscar-------------------------------------------------------------------------
    
    public Profissional buscarProfissional(int cod){
        for(Profissional p : listaProfissional){
            if(p.getCodigo()== cod){
                return p;
            }
        }
        return null;
    }
    
    public Animal buscarAnimal(int cod){
        for(Animal a: listaAnimal){
            if(a.getCodigo() == cod){
                return a;
            }
        }
        return null;
    }
    
    //Excluir------------------------------------------------------------------------
    
    public boolean excluirProfissional(int cod){
        Profissional aux = buscarProfissional(cod);
        if(aux != null){
            listaProfissional.remove(aux);
            return true;
        }
        return false;
    }
    
    public boolean excluirAnimal(int cod){
        Animal aux = buscarAnimal(cod);
        if(aux != null){
            listaAnimal.remove(aux);
            return true;
        }
        return false;
        
    }
}
