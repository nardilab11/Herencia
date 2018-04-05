/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.herencia2.modelo;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Lider extends Programador{
    private ArrayList<Programador> programadores;

    public Lider(String lenguaje, String nombre, double salario, String id) {
        super(lenguaje, nombre, salario, id);
        this.programadores = new ArrayList<>();
    }
    
    public boolean addProgramador(Programador programador){
        return this.programadores.add(programador);
    }
    
    @Override
    public double calcularSalario(){
        double salarioLider = super.calcularSalario();
        return (salarioLider)+(salarioLider*0.1*this.programadores.size());
    }

    //Para mostrar información se puede crear un método en contrato que sea mostrarInformación, y en líder se modifica para que muestra tanto la de él como la de las personas del grupo
}
