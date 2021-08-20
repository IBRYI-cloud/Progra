public class Productos {
    String codeProducto ;
    String modelo;

    public Productos(String codeProducto, String modelo) {
        this.codeProducto = codeProducto;
        this.modelo = modelo;
    }

    public String getCodeProducto() {
        return codeProducto;
    }

    public void setCodeProducto(String codeProducto) {
        this.codeProducto = codeProducto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
