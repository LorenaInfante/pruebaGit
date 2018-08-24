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
public class BoardIntel implements Board{

    @Override
    public String mostrarMarca() {
        return "Intel";
    }

    @Override
    public String mostrarSocket() {
        return "Socket3";
    }
    
}
