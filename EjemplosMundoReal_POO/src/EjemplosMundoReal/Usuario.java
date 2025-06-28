package EjemplosMundoReal;

public class Usuario {
    private int id;

    public Usuario(int id) {
        this.id = id;
    }

    public void reservarBicicleta(Bicicleta bici) {
        if (bici.estaDisponible()) {
            bici.reservar();
            System.out.println("Usuario " + id + " ha reservado la bicicleta " + bici.getId());
        } else {
            System.out.println("La bicicleta " + bici.getId() + " no está disponible.");
        }
    }
}