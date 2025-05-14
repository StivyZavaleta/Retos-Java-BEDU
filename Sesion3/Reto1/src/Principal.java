public class Principal {
    public static void main(String[] args) {

        Pasajero pasajero = new Pasajero("Ana Martinez", "AB12345");
        Vuelo vuelo = new Vuelo("UX123", "Paris", "14:30");

        boolean reservar = vuelo.reservarAsiento(pasajero);
        if (reservar) {
            System.out.println("\n✅ Reserva realizada con exito.\n");
        } else {
            System.out.println("\n❌ No se pudo realizar la reserva.\n");
        }

        System.out.println(vuelo.obtenerItinerario());

        System.out.println("\n❌ Cancelando reserva...\n");
        vuelo.cancelarReserva();

        System.out.println(vuelo.obtenerItinerario());

        vuelo.reservarAsiento("Mario Gonzalez", "CD09876");
        System.out.println(vuelo.obtenerItinerario());
    }
}