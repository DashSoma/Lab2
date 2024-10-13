/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas;

import Juego.Tablero;

/**
 *
 * @author dashs
 */
public class Caballo extends Pieza {
    
    public Caballo(boolean blanca, int x, int y) {
        super(blanca, x, y);
    }

    public Caballo() {
        this(false,0,0) ;
    }
    
    @Override
    public boolean puedeMoverse(CuadroPieza dest, Tablero tabl) {
        if (Math.abs((getCuadroPieza().getPosX() - dest.getPosX())) == 2) {
            if (Math.abs(getCuadroPieza().getPosY() - dest.getPosY()) == 1) {
                return super.ComprobarMovimientos(dest, tabl);
            }
        }

        if (Math.abs(getCuadroPieza().getPosY() - dest.getPosY()) == 2) {
            if (Math.abs(getCuadroPieza().getPosY()- dest.getPosY()) == 1) {
                return super.ComprobarMovimientos(dest, tabl);
            }
        }
        return false;
    }
}
