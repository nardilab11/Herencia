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
public class Compania {
    private ArrayList<Contrato> contratos;

    public Compania() {
        this.contratos = new ArrayList<>();
    }
    
    public boolean addContrato(Contrato contrato){
        return this.contratos.add(contrato);
    }
    
    public double calcularSalario(){
        double total = 0;
        for(Contrato contrato : contratos){
            total+=contrato.calcularSalario();
        }
        return total;
    }
}
