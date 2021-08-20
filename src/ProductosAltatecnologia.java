import java.util.Date;

public class ProductosAltatecnologia {
    String Pais;
    Date FechaFabricacion;
    String EmpresaFabricante;

    public ProductosAltatecnologia(String pais, Date fechaFabricacion, String empresaFabricante) {
        Pais = pais;
        FechaFabricacion = fechaFabricacion;
        EmpresaFabricante = empresaFabricante;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public Date getFechaFabricacion() {
        return FechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        FechaFabricacion = fechaFabricacion;
    }

    public String getEmpresaFabricante() {
        return EmpresaFabricante;
    }

    public void setEmpresaFabricante(String empresaFabricante) {
        EmpresaFabricante = empresaFabricante;
    }
}
