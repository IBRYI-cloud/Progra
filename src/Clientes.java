public class Clientes {
    int Dni;
    int Telefono;
    String Direccion;

    public Clientes(int dni, int telefono, String direccion) {
        Dni = dni;
        Telefono = telefono;
        Direccion = direccion;

    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int dni) {
        Dni = dni;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
}

