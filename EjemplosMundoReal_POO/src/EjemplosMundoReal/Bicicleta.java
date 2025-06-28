package EjemplosMundoReal;
public class Bicicleta {
    private int id;
    private String tipo;
    private boolean disponible;

    public Bicicleta(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
        this.disponible = true;
    }

    public int getId() {
        return id;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void reservar() {
        this.disponible = false;
    }

    public void liberar() {
        this.disponible = true;
    }

    @Override
    public String toString() {
        return "Bicicleta ID: " + id + ", Tipo: " + tipo + ", Disponible: " + disponible;
    }
}