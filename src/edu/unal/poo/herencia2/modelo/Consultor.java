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
public class Consultor extends Contrato {
    protected String labor;

    public Consultor(String labor, String id) {
        super(id);
        this.labor = labor;
    }

    @Override
    public double calcularSalario() {
        return 220;
    }
    
}
