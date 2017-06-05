package Model;

/**
 * Created by Neo on 13/05/2017.
 * Clase enum con todos los tipos de coches
 */
public enum Tipo {
    TODOTERRENO("Todoterreno"),
    COUPE("Coupe"),
    SEDAN("Sedan"),
    FURGONETA("Furgoneta"),
    DEPORTIVO("Deportivo");


    private final String tipo;

    private Tipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }
}

