/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.herencia2.modelo;

/**
 *
 * @author Estudiante
 */
public class Programador extends Empleado {
    protected String lenguaje;

    public Programador(String lenguaje, String nombre, double salario, String id) {
        super(nombre, salario, id);
        this.lenguaje = lenguaje;
    }
    
    @Override
    public double calcularSalario(){
        if(this.lenguaje.equals("java")){
            return (this.salario)+(this.salario*0.1);
        }else{
            return (this.salario);
        }
    }
    
}
