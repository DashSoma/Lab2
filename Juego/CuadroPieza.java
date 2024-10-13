/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

import Juego.Tablero;
import Piezas.Pieza;

/**
 *
 * @author Usuario
 */
public class CuadroPieza {
    
    private int posX;
    private int posY;
    private Pieza pieza = null;

    public CuadroPieza(int x, int y) {
        this.posX = x;
        this.posY = y;
        
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
      
    }
    
    public int getPosX() {
        return posX;
    }

    public void setPorX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    
    
}
