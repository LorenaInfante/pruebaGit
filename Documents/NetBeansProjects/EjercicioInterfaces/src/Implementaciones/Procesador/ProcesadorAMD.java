/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementaciones.Procesador;

import Interfaces.Procesador;

/**
 *
 * @author m.infante.redondo
 */
public class ProcesadorAMD implements Procesador{

    @Override
    public String mostrarNucleos() {
        return "6";
    }

    @Override
    public String mostrarMarca() {
        return "AMD";
    }
    
}
