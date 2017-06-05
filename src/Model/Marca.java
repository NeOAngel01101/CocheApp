package Model;

/**
 * Created by Neo on 13/05/2017.
 * Clase enum con todas las marcas de coche que existen
 */
public enum Marca {
    ABARTH("Abarth"),
    ALFAROMEO("Alfa Romeo"),
    ASTONMARTIN("Aston Martin"),
    AUDI("Audi"),
    BENTLEY("Bentley"),
    BMW("Bmw"),
    BUGATTI("Bugatti"),
    CADILLAC("Cadillac"),
    CHEVROLET("Chevrolet"),
    CHRYSLER("Chryster"),
    CITROEN("Citroen"),
    CORVETTE("Corvette"),
    DACIA("Dacia"),
    DODGE("Dodge"),
    DS("Ds"),
    FERRARI("Ferrari"),
    FIAT("Fiat"),
    FORD("Ford"),
    FSO("Fso"),
    HONDA("Honda"),
    HUMMER("Hummer"),
    HYUNDAI("Hyundai"),
    INFINITI("Infiniti"),
    JAGUAR("Jaguar"),
    JEEP("Jeep"),
    KIA("Kia"),
    LAMBORGHINI("Lamborghini"),
    LANCIA("Lancia"),
    LANDROVER("Land Rover"),
    LEXUS("Lexus"),
    LOTUS("Lotus"),
    MASERATI("Maserati"),
    MAZDA("Mazda"),
    MERCURY("Mercury"),
    MINI("Mini"),
    MITSUBISHI("Mitsubishi"),
    NISSAN("Nissan"),
    OPEL("Opel"),
    PEUGEOT("Peugeot"),
    PONTIAC("Pontiac"),
    PORSCHE("Porsche"),
    RENAULT("Renault"),
    ROLLSROYCE("Rolls Royce"),
    ROVER("Rover"),
    SAAB("Saab"),
    SEAT("Seat"),
    SKODA("Skoda"),
    SMART("Smart"),
    SSANGYONG("Ssangyong"),
    SUBARU("Subaru"),
    SUZUKI("Suzuki"),
    TESLA("Tesla"),
    TOYOTA("Toyota"),
    TVR("Tvr"),
    VOLKSWAGEN("Volkswagen"),
    VOLVO("Volvo");

    private final String marca;


    private Marca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }
}


