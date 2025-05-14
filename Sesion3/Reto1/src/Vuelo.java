public class Vuelo {
    final String codigoVuelo;
    String destino;
    String horaSalida;
    Pasajero asientoReservado;

    public Vuelo(String codigoVuelo, String destino, String horaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    public boolean reservarAsiento(Pasajero pasajero) {
        if(asientoReservado == null) {
            asientoReservado = pasajero;
            return true;
        } else {
            return false;
        }
    }

    public boolean reservarAsiento(String nombre, String pasaporte) {
        Pasajero pasajero = new Pasajero(nombre, pasaporte);
        return reservarAsiento(pasajero);
    }

    public void cancelarReserva() {
        asientoReservado = null;
    }

    public String obtenerItinerario() {
        String info = "✈\uFE0F Itinerario del vuelo:\n";
        info += "Codigo: " + codigoVuelo;
        info += "\nDestino: " + destino;
        info += "\nSalida: " + horaSalida;
        if(asientoReservado != null) {
            info += "\nPasajero: " + asientoReservado.nombre;
        } else {
            info += "\nPasajero: [Sin reserba]\n";
        }
        return info;
    }
}