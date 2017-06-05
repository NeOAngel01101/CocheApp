package Model;

import java.io.Serializable;
import java.util.Comparator;


/**
 * Created by Neo on 13/05/2017.
 * Implementa cloneable para poder clonar un array,comparable y comparator para que se analize
 * y asi se pueda ordenar un array.Serializable que nos permite poder guardar los avances del programa
 * en esta clase.
 * Aparte se crean tambien todos los atributos de Coches.
 */
public class Coche implements Cloneable,Comparable<Coche>,Comparator<Coche>,Serializable {

    private String nombre;
    private Tipo tipo;
    private int potencia;
    private int cilindros;
    private int parMaxima;
    private int velocidadMaxima;
    private double acceleracion;
    private boolean turbo;
    private Traccion traccion;
    private Marca marca;
    private int año;
    private double precio;

    /**
     * CONSTRUCTORES
     * El primero se crea por defecto
     * El segundo tiene todos los atributos de coche y lo que devuelve.
     */
    public Coche() {

    }

    public Coche(String nombre, Tipo tipo, int potencia, int cilindros, int parMaxima, int velocidadMaxima, double acceleracion, boolean turbo, Traccion traccion, Marca marca, int año, double precio) {
        setNombre(nombre);
        setTipo(tipo);
        setPotencia(potencia);
        setCilindros(cilindros);
        setParMaxima(parMaxima);
        setVelocidadMaxima(velocidadMaxima);
        setAcceleracion(acceleracion);
        setTurbo(turbo);
        setTraccion(traccion);
        setMarca(marca);
        setAño(año);
        setPrecio(precio);
    }

    /**
     * GETTER AND SHETTERS con sus respectivas funciones para proteger la estabilidad del programa
     * @return devuelve el valor
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Si no se pone nada en la casilla de nombre se pondra por defecto que el coche es desconocido
     */
    public void setNombre(String nombre) {
        if (nombre.equals("")) {
            this.nombre = "Coche Desconocido";
        } else {
            this.nombre = nombre;
        }
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return this.potencia;
    }

    /**
     * La potencia introducida solo puede ser mayor o igual a 20 hasta 4000.En caso de que no se ponga ,o se equivoque el
     * usuario ,se pondra por defecto 20
     * @param potencia
     */
    public void setPotencia(int potencia) {
        if (potencia <= 20 || potencia >= 4000) {
            this.potencia = 20;
        } else {
            this.potencia = potencia;
        }
    }

    public int getCilindros() {
        return this.cilindros;
    }

    /**
     * Los cilindros tienen que ser como minimo 2 y como maximo 16.En el caso de que no se pone 2 por defecto
     * @param cilindros
     */
    public void setCilindros(int cilindros) {
        if (cilindros <= 2 || cilindros > 17) {
            this.cilindros = 2;
        } else {
            this.cilindros = cilindros;
        }
    }

    public int getParMaxima() {
        return this.parMaxima;
    }

    /**
     * La par maxima tiene que ser como minimo 50 y como maximo 5000.En el caso de que no se pone 50 por defecto
     * @param parMaxima
     */
    public void setParMaxima(int parMaxima) {
        if (parMaxima <= 50 || parMaxima >= 5000) {
            this.parMaxima = 50;
        } else {
            this.parMaxima = parMaxima;
        }
    }

    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    /**
     * Se establece que la velocidad sea mayor o igual 50km/h.No superando 435km/h como maximo.Por
     * defecto se pondra 50km/h
     * @param velocidadMaxima
     */
    public void setVelocidadMaxima(int velocidadMaxima) {
        if (velocidadMaxima <= 50 || velocidadMaxima > 436) {
            this.velocidadMaxima = 50;
        } else {
            this.velocidadMaxima = velocidadMaxima;
        }
    }

    public double getAcceleracion() {
        return this.acceleracion;
    }

    /**
     * Se establece que que la acceleracion sea mayor a 1 seg y menor a 21 segundos.Por defecto se pondra 1
     * @param acceleracion
     */
    public void setAcceleracion(double acceleracion) {
        if (acceleracion <= 1.0 || acceleracion >= 20.0) {
            this.acceleracion = 1;
        } else {
            this.acceleracion = acceleracion;
        }
    }

    public boolean isTurbo() {
        return this.turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;

    }

    public Traccion getTraccion() {
        return this.traccion;
    }

    public void setTraccion(Traccion traccion) {
        this.traccion = traccion;
    }

    public Marca getMarca() {
        return this.marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getAño() {
        return this.año;
    }

    /**
     * El año introducido solo puede ser mayor o igual a 1980 hasta 2017.En caso de que no se ponga nada por defecto se pondra 1980
     * @param año
     */
    public void setAño(int año) {
        if (año <= 1980 || año > 2017) {
            this.año = 1980;
        } else {
            this.año = año;
        }
    }

    public double getPrecio() {
        return this.precio;
    }

    /**
     * Se establece que el precio del coche tenga que ser obligatoriamente mayor a 0.
     * @param precio
     */
    public void setPrecio(double precio) {
        if (precio <= 1) {
            this.precio = 1;
        } else {
            this.precio = precio;
        }
    }

    //CochesDB


    /**
     * Metodo que permite clonar un Coche con todos sus atributos
     *
     * @return devuelve al valor clon
     */
    public Coche clone() {
        Coche clon = new Coche(this.nombre, this.tipo, this.potencia, this.cilindros, this.parMaxima, this.velocidadMaxima, this.acceleracion, this.turbo, this.traccion, this.marca, this.año, this.precio);
        return clon;
    }


    /**
     * ToString que imprime todos los datos que tiene el coche
     *
     * @return devuelve todos esos datos
     */
    @Override
    public String toString() {
        return "_______________________________________________________________________________________________________________________________________________________________________________________________________________" + "\n" +
                nombre +
                "     |  Tipo:" + tipo +
                "   Potencia:" + potencia +
                "   Cilindros:" + cilindros +
                "   ParMaxima:" + parMaxima +
                "   VelocidadMaxima:" + velocidadMaxima +
                "   Acceleracion:" + acceleracion + " Segundos" +
                "   Turbo:" + (turbo ? "Si" : "No") +
                "   Traccion:" + traccion +
                "   Marca:" + marca +
                "   Año:" + año +
                "   Precio: " + precio +
                '€';
    }

    /**
     * Metodo que compara los coches por nombre alfabeticamente
     */
    public static Comparator<Coche> comparadornombre = new Comparator<Coche>() {
        @Override
        public int compare(Coche coche1, Coche coche2) {
            int res = coche1.getNombre().compareToIgnoreCase(coche2.getNombre());
            return res;
        }
    };

    /**
     * Metodo que compara los coches por velocidad maxima de menor a mayor
     */
    public static Comparator<Coche> comparadorvelocidad = new Comparator<Coche>() {
        @Override
        public int compare(Coche coche1, Coche coche2) {
            return (coche1.getVelocidadMaxima() - coche2.getVelocidadMaxima());
        }
    };

    /**
     * Metodo que compara los coches por precio de menor a mayor
     */
    public static Comparator<Coche> comparadorprecio = new Comparator<Coche>() {
        @Override
        public int compare(Coche coche1, Coche coche2) {
            return (int) (coche1.getPrecio() - coche2.getPrecio());
        }
    };

    /**
     * Metodo que compara los coches por caballos de potencia de menor a mayor
     */
    public static Comparator<Coche> comparadorcaballos = new Comparator<Coche>() {
        @Override
        public int compare(Coche coche1, Coche coche2) {
            return (coche1.getPotencia() - coche2.getPotencia());
        }
    };


    /**
     * Compara los coches y los devulve segun la posicion
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(Coche o1, Coche o2) {
        return 0;
    }

    @Override
    public int compareTo(Coche o) {
        return 0;
    }
}
