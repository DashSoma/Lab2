/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas;

import Juego.CuadroPieza;
import Juego.CaballoTablero;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Reina extends Pieza {

    public Reina(boolean blanca, int x, int y) {
        super(blanca, x, y);
    }

    public Reina(int color) {
        super(color);
        setImagenPieza(new ImageIcon(getClass().getResource("/Imagenes/reina_" + (color == 1 ? "b" : "n"))));
        setPeso(8);
    }

    public String toString() {
        return "Reina" + (getColor() == 1 ? "blanco" : "negro");

    }

    @Override
    public boolean puedeMoverse(CuadroPieza dest, CaballoTablero tabl) {
        Caballo C = new Caballo();
        C.setCuadroPieza(getCuadroPieza());
        if (C.ComprobarMovimientos(dest, tabl)) {
            return super.ComprobarMovimientos(dest, tabl);
        }
        return false;
    }
}

