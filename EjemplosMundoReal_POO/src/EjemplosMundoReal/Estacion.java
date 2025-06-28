package EjemplosMundoReal;
import java.util.ArrayList;

public class Estacion {
    private String nombreEstacion;
    private ArrayList<Bicicleta> bicicletas;

    public Estacion(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
        bicicletas = new ArrayList<>();
    }

    public void agregarBicicleta(Bicicleta bici) {
        bicicletas.add(bici);
    }

    public void mostrarBicicletasDisponibles() {
        System.out.println("Bicicletas disponibles en " + nombreEstacion + ":");
        for (Bicicleta bici : bicicletas) {
            if (bici.estaDisponible()) {
                System.out.println(bici);
            }
        }
    }

    public Bicicleta obtenerBicicletaDisponible() {
        for (Bicicleta bici : bicicletas) {
            if (bici.estaDisponible()) {
                return bici;
            }
        }
        return null;
    }
}
