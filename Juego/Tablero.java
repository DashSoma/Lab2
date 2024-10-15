package Juego;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import Vista.ViewHorse;
import Vista.ViewReina;
//import vista.View;

/**
 *
 * Clase que representa el tablero del juego de Othello. Esta clase extiende
 * JPanel y maneja la lógica del juego, incluyendo la detección de movimientos
 * válidos, la actualización del tablero y la visualización gráfica de los
 * movimientos.
 *
 * @author Christian Paniagua Castro Y Reyman Barquero Ramírez
 */
public class Tablero extends JPanel {

    /**
     * Tamaño del tablero(8x8 celdas). Valor que representa una celda vacía en
     * el tablero. Valor que representa una celda con ficha negra (public porque
     * se utiliza en el JFrame). Valor que representa una celda con ficha
     * blanca(public porque se utiliza en el JFrame).
     */
    public static final int tamaño = 8;
    private static final int vacio = 0;
    public static final int negro = 1;
    public static final int blanco = 2;

    /**
     * jugador1, jugador2 Nombre de los dos jugadores
     */
    public String jugador1;
    public String jugador2;

    /**
     * Indica si el juego está en progreso. Se inicializa como false, indicando
     * que el juego no ha comenzado.
     */
    public boolean juegoEnProgreso = false;

    /**
     * Matriz que representa el estado actual del tablero. Color del jugador
     * actual. Puede ser negro o blanco. Objeto a partir del JFrame llamado View
     */
    private int[][] tablero;

    /**
     * Representa al jugador actual en turno. Puede ser negro o blanco.
     */
    public int jugadorActual;

    /**
     * Referencia al objeto View, que maneja la interfaz gráfica del juego. Es
     * final, lo que significa que se inicializa en el constructor y no cambia.
     */
    private ViewHorse viewHorse;

    private ViewReina viewReina;

    /**
     * filaSeleccionada, columnaSeleccionada Variables para almacenar la última
     * fila y columna seleccionada
     */
    public int filaSeleccionada;
    public int columnaSeleccionada;

    /**
     * Almacena el nombre del último jugador que ganó el juego. Se inicializa
     * como una cadena vacía.
     */
    public String ultimoGanador = "";

    /**
     * Constructor que inicializa el tablero y configura el listener para
     * detectar clics del ratón. Al hacer clic, se verifica si el movimiento es
     * válido y se actualiza el estado del tablero.
     *
     * @param viewHorse
     */
    public Tablero(ViewHorse viewHorse) {
        this.viewHorse = viewHorse;
        tablero = new int[tamaño][tamaño];
        jugadorActual = negro;

    }

    public Tablero(ViewReina viewReina) {
        this.viewReina = viewReina;
        tablero = new int[tamaño][tamaño];
        jugadorActual = negro;
    }

    /**
     * Clase propia de java, sobreecrita con por medio del @override. Dibuja el
     * tablero en el panel. Cada celda se pinta de verde con una línea negra, y
     * las fichas se dibujan en su color dependiedo de la parte de la selectiva
     * en la que entre.
     *
     * @param g Objeto Graphics utilizado para dibujar en el panel por medio de
     * los métodos.
     */
    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        int tamañoCelda = obtenerTamañoCelda();
        for (filaSeleccionada = 0; filaSeleccionada < Tablero.tamaño; filaSeleccionada++) {
            for (columnaSeleccionada = 0; columnaSeleccionada < Tablero.tamaño; columnaSeleccionada++) {
                // Alterna los colores de las celdas para simular un tablero de ajedrez
                if ((filaSeleccionada + columnaSeleccionada) % 2 == 0) {
                    g.setColor(Color.BLACK); // Color claro (café claro)
                } else {
                    g.setColor(Color.WHITE); // Color oscuro (café oscuro)
                }

                // Dibuja las celdas del tablero
                g.fillRect(columnaSeleccionada * tamañoCelda, filaSeleccionada * tamañoCelda, tamañoCelda, tamañoCelda);
                g.setColor(Color.BLACK);
                // Dibuja los bordes
                g.drawRect(columnaSeleccionada * tamañoCelda, filaSeleccionada * tamañoCelda, tamañoCelda, tamañoCelda);

                // Solo dibuja una ficha en la esquina superior izquierda
                if (filaSeleccionada == 0 && columnaSeleccionada == 0) {
                    g.setColor(new Color(135, 206, 250)); // Ficha de color celeste
                    g.fillOval(columnaSeleccionada * tamañoCelda, filaSeleccionada * tamañoCelda, tamañoCelda, tamañoCelda);
                }
            }
        }
    }

    /**
     * Obtiene el tamaño de cada celda en píxeles que se acopla a las
     * dimensiones del panel.
     *
     * @return Tamaño de cada celda en píxeles.
     */
    public int obtenerTamañoCelda() {
        return Math.min(getWidth(), getHeight()) / tamaño;
    }

//    /**
//     * Su función es colocar la fichas en su posición inicial cada vez que así
//     * se requiera.
//     */
//    public void mostrarTabla() {
//        // Iniciar juego
//        jugadorActual = negro;
//        tablero = new int[tamaño][tamaño];
//        // Colocar fichas iniciales
//        tablero[3][3] = blanco;
//        tablero[3][4] = negro;
//        tablero[4][3] = negro;
//        tablero[4][4] = blanco;
//        repaint();
//    }
}
