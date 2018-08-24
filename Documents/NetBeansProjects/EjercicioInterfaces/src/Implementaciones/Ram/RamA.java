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
public class RamA implements Ram{

    @Override
    public String mostrarMarca() {
        return "A";
    }

    @Override
    public String mostrarCapacidad() {
        return "16 gb";
    }

    @Override
    public String mostrarPrecio() {
        return "500000";
    }
    
}
