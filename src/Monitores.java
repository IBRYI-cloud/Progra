public class Monitores {
    String resolucionMaxima;
    String CodeMonitores;
    String Modelo;

    public Monitores(String resolucionMaxima, String codeMonitores, String modelo) {
        this.resolucionMaxima = resolucionMaxima;
        CodeMonitores = codeMonitores;
        Modelo = modelo;
    }

    public String getResolucionMaxima() {
        return resolucionMaxima;
    }

    public void setResolucionMaxima(String resolucionMaxima) {
        this.resolucionMaxima = resolucionMaxima;
    }

    public String getCodeMonitores() {
        return CodeMonitores;
    }

    public void setCodeMonitores(String codeMonitores) {
        CodeMonitores = codeMonitores;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }
}
