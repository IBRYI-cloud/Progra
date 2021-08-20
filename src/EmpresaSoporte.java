import java.util.Date;

public class EmpresaSoporte {
    float precio;
    int Dni;
    int telefono;
    String Domicilio;
    Date FechaCompra;

    public EmpresaSoporte(float precio, int dni, int telefono, String domicilio, Date fechaCompra) {
        this.precio = precio;
        Dni = dni;
        this.telefono = telefono;
        Domicilio = domicilio;
        FechaCompra = fechaCompra;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int dni) {
        Dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public Date getFechaCompra() {
        return FechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        FechaCompra = fechaCompra;
    }
}
