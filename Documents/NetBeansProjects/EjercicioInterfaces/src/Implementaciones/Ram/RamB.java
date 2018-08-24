/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementaciones.Ram;

import Interfaces.Ram;

/**
 *
 * @author m.infante.redondo
 */
public class RamB implements Ram {

    @Override
    public String mostrarMarca() {
        return "B";
    }

    @Override
    public String mostrarCapacidad() {
        return "10 gb";
    }

    @Override
    public String mostrarPrecio() {
        return "1500000";
    }
    
}
