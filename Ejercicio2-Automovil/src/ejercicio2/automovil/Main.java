
package ejercicio2.automovil;

public class Main {

    public static void main(String[] args) {
    //Variantes    
    
        Variante sedan = new Variante("Sedan", 230000);
        Variante familiar = new Variante("familiar", 245000);
        Variante coupe = new Variante("coupe", 270000);
        
    //Opciones
    
        Opcion TC = new Opcion("Techo Corredizo", 12000);
        Opcion AB = new Opcion("Airbag", 7000);
        Opcion AA = new Opcion("Aire Acondicionado", 20000);
        Opcion ABS = new Opcion("Sistema de Frenos", 14000);
        Opcion LL = new Opcion("Llantas de alineacion", 12000);
        
    //Autos  
    
        Auto auto1 = new Auto(sedan);
        auto1.agregarOpcion(TC);
        auto1.agregarOpcion(AA);
        auto1.calcularPrecioFinal();

        Auto auto2 = new Auto(coupe);
        auto2.agregarOpcion(ABS);
        auto2.agregarOpcion(AB);
        auto2.agregarOpcion(LL);
        auto2.calcularPrecioFinal();

        Auto auto3 = new Auto(familiar);
        auto3.agregarOpcion(TC);
        auto3.agregarOpcion(AA);
        auto3.agregarOpcion(ABS);
        auto3.agregarOpcion(AB);
        auto3.agregarOpcion(LL);
        auto3.calcularPrecioFinal();

        Auto auto4 = new Auto(familiar);
        auto4.calcularPrecioFinal();
    }
    }