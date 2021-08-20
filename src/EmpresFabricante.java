public class EmpresFabricante {
    String NombreEmpresaFabricante;
    String Direccion;
    int NumeroEmpleados;

    public EmpresFabricante(String nombreEmpresaFabricante, String direccion, int numeroEmpleados) {
        NombreEmpresaFabricante = nombreEmpresaFabricante;
        Direccion = direccion;
        NumeroEmpleados = numeroEmpleados;
    }

    public String getNombreEmpresaFabricante() {
        return NombreEmpresaFabricante;
    }

    public void setNombreEmpresaFabricante(String nombreEmpresaFabricante) {
        NombreEmpresaFabricante = nombreEmpresaFabricante;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getNumeroEmpleados() {
        return NumeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        NumeroEmpleados = numeroEmpleados;
    }
}
