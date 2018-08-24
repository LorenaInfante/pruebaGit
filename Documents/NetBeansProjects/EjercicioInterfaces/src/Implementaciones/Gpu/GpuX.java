/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementaciones.Gpu;

import Interfaces.Gpu;

/**
 *
 * @author m.infante.redondo
 */
public class GpuX implements Gpu{

    @Override
    public String mostrarMarca() {
        return  "X";
    }

    @Override
    public String mostrarVelocidad() {
        return  "DDR7";
    }

    @Override
    public String mostrarCapacVideo() {
        return  "600";
    }
    
}
