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
public abstract class Contrato {
    protected String id;

    public Contrato(String id) {
        this.id = id;
    }
    
    public abstract double calcularSalario();
}
