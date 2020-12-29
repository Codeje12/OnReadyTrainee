package Logica;

public class Main {
    

    public static void main(String[] args) {

        /**
         * Vehiculos instanciados *
         */
        Concesionaria con = new Concesionaria();
        Peugeot peu = new Peugeot(4, "Peugeot", "206", 200000.00);
        Honda hon = new Honda("125cc", "Honda", "Titan", 60000.00);
        Peugeot peu2 = new Peugeot(5, "Peugeot", "208", 250000.00);
        Yamaha yam = new Yamaha("160cc", "Yamaha", "YBR", 80500.50);

        /**
         *Mostrar normal *
         */
        System.out.println(peu.mostrarInfo());
        System.out.println(hon.mostrarInfo());
        System.out.println(peu2.mostrarInfo());
        System.out.println(yam.mostrarInfo());
        
        System.out.println("=============================");
        
        /**
         *Mostrar El barato, el caro y el que tiene la letra 'y'*
         */
        con.caro(peu, hon, peu2, yam);
        con.barato(peu, hon, peu2, yam);
        con.letraY(peu, hon, peu2, yam);
        
        System.out.println("=============================");
        /**
         *Mostrar Ordenados *
         */

        con.ordenados(peu, hon, peu2, yam);
    }
}
