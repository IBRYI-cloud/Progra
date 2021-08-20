public class Proveedores {
    String Nif;
    String Direecion;
    int CantidadProductos;

    public Proveedores(String nif, String direecion, int cantidadProductos) {
        Nif = nif;
        Direecion = direecion;
        CantidadProductos = cantidadProductos;
    }

    public String getNif() {
        return Nif;
    }

    public void setNif(String nif) {
        Nif = nif;
    }

    public String getDireecion() {
        return Direecion;
    }

    public void setDireecion(String direecion) {
        Direecion = direecion;
    }

    public int getCantidadProductos() {
        return CantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        CantidadProductos = cantidadProductos;
    }
}
