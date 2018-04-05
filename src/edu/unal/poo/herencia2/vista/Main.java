/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.herencia2.vista;
import edu.unal.poo.herencia2.modelo.Compania;
import edu.unal.poo.herencia2.modelo.Consultor;
import edu.unal.poo.herencia2.modelo.Contrato;
import edu.unal.poo.herencia2.modelo.Empleado;
import edu.unal.poo.herencia2.modelo.Admin;
import edu.unal.poo.herencia2.modelo.Programador;
import edu.unal.poo.herencia2.modelo.Lider;
/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        Compania compania = new Compania();
        compania.addContrato(new Consultor("C","C1"));
        Contrato c2 = new Programador("java","D1",200,"D2");
    }
}
