/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementaciones;

import Interfaces.Board;

/**
 *
 * @author m.infante.redondo
 */
public class BoardNVidia implements Board {

    @Override
    public String mostrarMarca() {
        return "NVidia";
    }

    @Override
    public String mostrarSocket() {
       return "Socket2";
    }
    
    
}
