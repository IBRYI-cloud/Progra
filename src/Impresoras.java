public class Impresoras {
    String CodeImpresora;
    String ModeloImpresora;
    Float Velocidad;

    public Impresoras(String codeImpresora, String modeloImpresora, Float velocidad) {
        CodeImpresora = codeImpresora;
        ModeloImpresora = modeloImpresora;
        Velocidad = velocidad;
    }

    public String getCodeImpresora() {
        return CodeImpresora;
    }

    public void setCodeImpresora(String codeImpresora) {
        CodeImpresora = codeImpresora;
    }

    public String getModeloImpresora() {
        return ModeloImpresora;
    }

    public void setModeloImpresora(String modeloImpresora) {
        ModeloImpresora = modeloImpresora;
    }

    public Float getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(Float velocidad) {
        Velocidad = velocidad;
    }
}
