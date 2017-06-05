package Controller;

import Model.Coche;
import Model.CochesDB;


import java.util.InputMismatchException;
import java.util.Scanner;



/**
 * Created by Neo on 13/05/2017.
 *
 */
public class CochesApp {
    Scanner scanner = new Scanner(System.in);

    Coche coche;
    CochesDB cocheoptions = new CochesDB();

    /**
     * Metodo al iniciar el programa llame al metodo cargarcoches para volver al estado ultimo del programa.
     */
    public CochesApp(){
        cocheoptions.cargarCoches();

    }

    /**
     * Metodo que inicia el programa.del cual se acciona el menu para que el usuario pueda elegir la opcion que desee
     * en el case 2 ponemos otro while para poder hacer otro menu con diferentes opciones
     */
    public void start() {

        Scanner scanner = new Scanner(System.in);
        int option;
        int option2;

        while ((option = showMenu()) != 0) {
            switch (option) {
                case 1:
                    cocheoptions.mostrarCoches();
                    break;
                case 2:
                    while ((option2 = MenuOrdenacion(option))!= 0) {
                        if (option2==1) {
                            cocheoptions.ordenarpornombre();
                        }else if (option2==2) {
                            cocheoptions.ordenarporvelocidad();
                        }else if (option2==3) {
                            cocheoptions.ordenarporprecio();
                        }else if (option2==4) {
                            cocheoptions.ordenarporcaballos();
                        }
                        if (option2<=0 || option2 >4) {
                            System.out.println("Introduzca una opcion correcta");
                        }
                        if(option2==0){
                            return ;
                        }
                    }
                    break;
                case 3:
                    cocheoptions.buscarcoche();
                    break;
                case 4:
                    cocheoptions.crearCoche(coche);
                    break;
                case 5:
                    cocheoptions.mostrarCoches();
                    cocheoptions.EliminarCoche();
                    break;
                case 6:
                    cocheoptions.mostrarCoches();
                    cocheoptions.añadirCocheFavoritos();
                    break;
                case 7:
                    cocheoptions.mostrarCochesFavoritos();
                    break;
                case 8:
                    cocheoptions.mostrarCochesFavoritos();
                    cocheoptions.EliminarCochedefavoritos();
                    break;
                default:
                    break;
            }
        }
        cocheoptions.guardarCoches();

    }

    private int showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;


        System.out.println("");
        System.out.println(" _____         _                                __---~~~~--__                      __--~~~~---__");
        System.out.println("|     |___ ___| |_ ___         ___ ___ ___   `\\---~~~~~~~~\\\\                    //~~~~~~~~---/'");
        System.out.println("|   --| . |  _|   | -_|       | .'| . | . |     \\/~~~~~~~~~\\||                  ||/~~~~~~~~~\\/ ");
        System.out.println("|_____|___|___|_|_|___|       |__,|  _|  _|                 `\\\\                //' ");
        System.out.println("                                  |_| |_|                    `\\\\             //'");
        System.out.println("******************************************                     ||            ||");
        System.out.println("****                                  ****             ______--~~~~~~~~~~~~~~~~~~--______  ");
        System.out.println("**      1 - Ver Todos los Coches        **        ___ // _-~                        ~-_ \\\\ ___   ");
        System.out.println("**      2 - Ordenar los coches          **       `\\__)\\/~      © 2017 SergioR          ~\\/(__/'");
        System.out.println("**      3 - Buscar Coche                **        _--`-___                            ___-'--_");
        System.out.println("**      4 - Añadir un Coche             **      /~     `\\ ~~~~~~~~------------~~~~~~~~ /'     ~\\");
        System.out.println("**      5 - Eliminar un coche           **     /|        `\\         ________         /'        |\\");
        System.out.println("**      6 - Añadir coche a favoritos    **    | \\   ______`\\_      \\------/      _/'______   /' |");
        System.out.println("**      7 - Lista de Coches Favoritos   **    |   `\\_~-_____\\ ~-________________-~ /_____-~_/'   | ");
        System.out.println("**      8 - Eliminar coche de favoritos **    `.     ~-__________________________________-~     .'  ");
        System.out.println("**      0 - Salir                       **     `.      [_______/------|~~|------\\_______]      .'");
        System.out.println("**                                      **      `\\--___((____)(________\\/________)(____))___--/' ");
        System.out.println("******************************************       |>>>>>>||                            ||<<<<<<|");
        System.out.println("Escriba la opcion que desee: ");

        try {
            option = scanner.nextInt();
            return option;
        } catch (InputMismatchException e) {
            System.out.println("Se a introducido una opcion incorrecta.Intentelo de nuevo");
        }
        return showMenu();
    }

    /**
     * Segundo menu del case 2
     * @param option
     * @return
     */
    public int MenuOrdenacion(int option) {
        Scanner scanner = new Scanner(System.in);

        int option2;

        System.out.println();
        switch (option) {
            case 2:
                System.out.println("");
                System.out.println(" _____         _                                 __---~~~~--__                      __--~~~~---__");
                System.out.println("|     |___ ___| |_ ___         ___ ___ ___     `\\---~~~~~~~~\\\\                    //~~~~~~~~---/'");
                System.out.println("|   --| . |  _|   | -_|       | .'| . | . |      \\/~~~~~~~~~\\||                  ||/~~~~~~~~~\\/ ");
                System.out.println("|_____|___|___|_|_|___|       |__,|  _|  _|                  `\\\\                //' ");
                System.out.println("                                  |_| |_|                     `\\\\            //'");
                System.out.println("******************************************                        ||          ||");
                System.out.println("****                                  ****             ______--~~~~~~~~~~~~~~~~~~--______  ");
                System.out.println("**      1 - Ordenar por nombre          **        ___ // _-~                        ~-_ \\\\ ___   ");
                System.out.println("**                                      **       `\\__)\\/~      © 2017 SergioR          ~\\/(__/'");
                System.out.println("**      2 - Ordenar por velocidad       **        _--`-___                            ___-'--_");
                System.out.println("**                                      **      /~     `\\ ~~~~~~~~------------~~~~~~~~ /'     ~\\");
                System.out.println("**      3 - Ordenar precio              **     /|        `\\         ________         /'        |\\");
                System.out.println("**                                      **    | \\   ______`\\_      \\------/      _/'______   /' |");
                System.out.println("**      4 - Ordenar por caballos        **    |   `\\_~-_____\\ ~-________________-~ /_____-~_/'   | ");
                System.out.println("**                                      **    `.     ~-__________________________________-~     .'  ");
                System.out.println("**      0 - Volver al menu principal    **     `.      [_______/------|~~|------\\_______]      .'");
                System.out.println("**                                      **      `\\--___((____)(________\\/________)(____))___--/' ");
                System.out.println("******************************************       |>>>>>>||                            ||<<<<<<|");
                try {
                    System.out.println("Escriba la opcion que desee: ");
                    option = scanner.nextInt();
                }catch (InputMismatchException e){
                    System.out.println("Por favor elija una opcion valida");
                }
                break;
            default:
                break;
        }

        return option;
    }
}