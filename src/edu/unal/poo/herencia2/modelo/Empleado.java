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
public class Empleado extends Contrato {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario, String id) {
        super(id);
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return this.salario;
    }
    
}
