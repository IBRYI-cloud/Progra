public class ProductosAlquiler extends DiscoDuro {
    String CodeAlquiler;
    int PrecioxHora;

    public ProductosAlquiler(String codeAlquiler, int precioxHora) {
        super(precioxHora);
        CodeAlquiler = codeAlquiler;
        PrecioxHora = precioxHora;
    }

    public String getCodeAlquiler() {
        return CodeAlquiler;
    }

    public void setCodeAlquiler(String codeAlquiler) {
        CodeAlquiler = codeAlquiler;
    }

    public int getPrecioxHora() {
        return PrecioxHora;
    }

    public void setPrecioxHora(int precioxHora) {
        PrecioxHora = precioxHora;
    }
}
