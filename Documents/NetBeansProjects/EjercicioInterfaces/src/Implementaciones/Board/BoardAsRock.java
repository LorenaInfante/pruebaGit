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
public class BoardAsRock implements Board {

    @Override
    public String mostrarMarca() {
        return  "AsRock";
    }

    @Override
    public String mostrarSocket() {
        return "Socket1";
    }
    
    
}
