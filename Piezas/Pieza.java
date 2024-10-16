package Piezas;

import Juego.CuadroPieza;
import Juego.CaballoTablero;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 *
 * @author DaniTiny
 */
public abstract class Pieza {

    private boolean blanca;
    private int x, y;
    private boolean firstmov = true;

    private static int cantMovimientosSinCambios = 0;

    public Pieza(boolean blanca, int x, int y) {
        this.blanca = blanca;
        this.x = x;
        this.y = y;
    }

    public abstract boolean puedeMoverse(CuadroPieza dest, CaballoTablero tabl);

    private int color;
    private int peso;
    private ImageIcon imagenPieza;
    private CuadroPieza cuadroPieza = null;

    public Pieza(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    /**
     *
     * @param color Blanco: 1 Negro: -1
     */
    public static void setCantMovimientosSinCambios(int cantMovimientosSinCambios) {
        Pieza.cantMovimientosSinCambios = cantMovimientosSinCambios;
    }

    public void setFirstmov(boolean firstmov) {
        this.firstmov = firstmov;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getPeso() {
        return peso;

    }

    public static int getCantMovimientosSinCambios() {
        return cantMovimientosSinCambios;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public ImageIcon getImagenPieza() {
        return imagenPieza;
    }

    public void setImagenPieza(ImageIcon imagenPieza) {
        this.imagenPieza = imagenPieza;
    }

    public CuadroPieza getCuadroPieza() {
        return cuadroPieza;
    }

    /**
     * @param cuadroPieza the cuadroPieza to set
     */
    public void setCuadroPieza(CuadroPieza cuadroPieza) {
        this.cuadroPieza = cuadroPieza;
    }

    public boolean ComprobarMovimientos(CuadroPieza Destino, CaballoTablero tbl) {
        if (Destino.getPieza() != null) {
            if (Destino.getPieza().getColor() == getCuadroPieza().getPieza().getColor()) {
                return false;
            }
        }
        return false;

    }

    public boolean MoverPieza(CuadroPieza Destino, CaballoTablero tbl) {
        if (ComprobarMovimientos(Destino, tbl)) {
            getCuadroPieza().setPieza(null);//Le paso al cuadro donde actualmente esta la pieza el valor de null, que quiere decir que ya no tiene pieza
            if (Destino.getPieza() != null) {//Si hay una pieza en el destino
                setCantMovimientosSinCambios(0);//Si come a alguna pieza, reseteo el contador de movimientos sin cambios.
            } else {
                setCantMovimientosSinCambios(getCantMovimientosSinCambios() + 1);//Si no come alguna pieza, el contador aumenta en uno.
            }
            Destino.setPieza(this);//Muevo la pieza al cuadro destino
            setFirstmov(false);//El siguiente movimiento, ya no sería el primero.
            return true;
        } else {
            return false;
        }
    }
}
