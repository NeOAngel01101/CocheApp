package Model;

/**
 * Created by Neo on 13/05/2017.
 * Clase enum con las tres tipos de tracciones de coche que hay
 */
public enum Traccion {
    DELANTERA("Delantera"),
    TRASERA("Trasera"),
    TODAS("A las 4 ruedas");

    private final String traccion;

    private Traccion(String traccion) {
        this.traccion = traccion;
    }

    public String getTraccion() {
        return this.traccion;
    }
}