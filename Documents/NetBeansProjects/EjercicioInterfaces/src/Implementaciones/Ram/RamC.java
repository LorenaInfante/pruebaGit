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
public class RamC implements Ram {

    @Override
    public String mostrarMarca() {
        return "c";
    }

    @Override
    public String mostrarCapacidad() {
        return "20GB";
    }

    @Override
    public String mostrarPrecio() {
        return "100000";
    }
    
}
