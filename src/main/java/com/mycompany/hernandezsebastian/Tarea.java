/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hernandezsebastian;

import java.util.Date;

/**
 *
 * @author sala4
 */
public class Tarea extends TareaProgramada {
    private boolean habilitada;
    private boolean deshabilitarSiFalla;

    public Tarea(boolean habilitada, boolean deshabilitarSiFalla) {
        this.habilitada = habilitada;
        this.deshabilitarSiFalla = deshabilitarSiFalla;
    }
    
    @Override
    public void ejecutar () {
        
    }
    public void doEjecutar (){
        
    }
    
    public Date ulitimaEjecucion (){
        return new Date();
    }
    public void vecesQueSeEjecuta(Date a, Date b){

    }
    
    public void vecesQueDioError (Date a, Date b){
        
    }

    /**
     * @return the habilitada
     */
    public boolean isHabilitada() {
        return habilitada;
    }

    /**
     * @param habilitada the habilitada to set
     */
    public void setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
    }

    /**
     * @return the deshabilitarSiFalla
     */
    public boolean isDeshabilitarSiFalla() {
        return deshabilitarSiFalla;
    }

    /**
     * @param deshabilitarSiFalla the deshabilitarSiFalla to set
     */
    public void setDeshabilitarSiFalla(boolean deshabilitarSiFalla) {
        this.deshabilitarSiFalla = deshabilitarSiFalla;
    }

    @Override
    public boolean correspondeEjecutar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}