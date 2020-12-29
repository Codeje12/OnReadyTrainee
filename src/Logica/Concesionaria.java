package Logica;

public class Concesionaria {

    /**
     * Verifica el Vehiculo mas caro*
     */
    public void caro(Peugeot p, Honda h, Peugeot p2, Yamaha y) {

        if (p.getPrecio() > h.getPrecio() && p.getPrecio() > p2.getPrecio() && p.getPrecio() > y.getPrecio()) {
            System.out.println("Vehículo más caro: " + p.getMarca() + " " + p.getModelo());

        } else if (h.getPrecio() > p.getPrecio() && h.getPrecio() > p2.getPrecio() && h.getPrecio() > y.getPrecio()) {
            System.out.println("Vehículo más caro: " + h.getMarca() + " " + h.getModelo());

        } else if (p2.getPrecio() > h.getPrecio() && p2.getPrecio() > p.getPrecio() && p2.getPrecio() > y.getPrecio()) {
            System.out.println("Vehículo más caro: " + p2.getMarca() + " " + p2.getModelo());

        } else if (y.getPrecio() > h.getPrecio() && y.getPrecio() > p2.getPrecio() && y.getPrecio() > p.getPrecio()) {
            System.out.println("Vehículo más caro: " + y.getMarca() + " " + y.getModelo());
        }
    }

    /**
     * Verifica el Vehiculo mas barato*
     */
    public void barato(Peugeot p, Honda h, Peugeot p2, Yamaha y) {

        if (p.getPrecio() < h.getPrecio() && p.getPrecio() < p2.getPrecio() && p.getPrecio() < y.getPrecio()) {
            System.out.println("Vehículo más barato: " + p.getMarca() + " " + p.getModelo());

        } else if (h.getPrecio() < p.getPrecio() && h.getPrecio() < p2.getPrecio() && h.getPrecio() < y.getPrecio()) {
            System.out.println("Vehículo más barato: " + h.getMarca() + " " + h.getModelo());

        } else if (p2.getPrecio() < h.getPrecio() && p2.getPrecio() < p.getPrecio() && p2.getPrecio() < y.getPrecio()) {
            System.out.println("Vehículo más barato: " + p2.getMarca() + " " + p2.getModelo());

        } else if (y.getPrecio() < h.getPrecio() && y.getPrecio() < p2.getPrecio() && y.getPrecio() < p.getPrecio()) {
            System.out.println("Vehículo más barato: " + y.getMarca() + " " + y.getModelo());

        }
    }

    /**
     * Verifica la Y en nombre modelo*
     */
    public void letraY(Peugeot p, Honda h, Peugeot p2, Yamaha y) {

        for (int i = 0; i < p.getModelo().length(); i++) {
            if (p.getModelo().charAt(i) == 'y' || p.getModelo().charAt(i) == 'Y') {
                System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + p.getMarca() + " " + p.getModelo() + " " + p.getPrecio());
            }
        }

        for (int i = 0; i < h.getModelo().length(); i++) {
            if (h.getModelo().charAt(i) == 'y' || h.getModelo().charAt(i) == 'Y') {
                System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + h.getMarca() + " " + h.getModelo() + " " + h.getPrecio());
            }
        }
        for (int i = 0; i < p2.getModelo().length(); i++) {
            if (p2.getModelo().charAt(i) == 'y' || p2.getModelo().charAt(i) == 'Y') {
                System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + p2.getMarca() + " " + p2.getModelo() + " " + p2.getPrecio());
            }
        }
        for (int i = 0; i < y.getModelo().length(); i++) {
            if (y.getModelo().charAt(i) == 'y' || y.getModelo().charAt(i) == 'Y') {
                System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + y.getMarca() + " " + y.getModelo() + " " + y.getPrecio());
            }
        }

    }
    
    
    
    /**
     *Ordenar por Precios de Mayor a menor*
     */
     public void ordenados(Peugeot p, Honda h, Peugeot p2, Yamaha y){
         double vec[] = new double[4];
         double aux;
         vec[0] = p.getPrecio();
         vec[1] = h.getPrecio();
         vec[2] = p2.getPrecio();
         vec[3] = y.getPrecio();
         
         for (int i = 0; i < vec.length; i++) {
             for (int j = 0; j < (vec.length - 1 ); j++) {
                 if(vec[j] < vec[j+1]){
                    aux= vec[j+1];
                    vec[j+1] =  vec[j];
                    vec[j] = aux;
                 }
             }
         }
         
         for (int i = 0; i < vec.length; i++) {
             if(p.getPrecio() == vec[i]){
                 System.out.println(p.getMarca() + " " + p.getModelo());
                 
             }else if(h.getPrecio() == vec[i]){
                 System.out.println(h.getMarca() + " " + h.getModelo());
             } else if(p2.getPrecio() == vec[i]){
                 System.out.println(p2.getMarca() + " " + p2.getModelo());
             }else if(y.getPrecio() == vec[i]){
                 System.out.println(y.getMarca() + " " + y.getModelo());
             }
         }
     }

}
