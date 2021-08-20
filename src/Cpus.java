public class Cpus {
    String CodeCpus;
    String MemoriaPrincipal;
    String Modelo;

    public Cpus(String codeCpus, String memoriaPrincipal, String modelo) {
        CodeCpus = codeCpus;
        MemoriaPrincipal = memoriaPrincipal;
        Modelo = modelo;
    }

    public String getCodeCpus() {
        return CodeCpus;
    }

    public void setCodeCpus(String codeCpus) {
        CodeCpus = codeCpus;
    }

    public String getMemoriaPrincipal() {
        return MemoriaPrincipal;
    }

    public void setMemoriaPrincipal(String memoriaPrincipal) {
        MemoriaPrincipal = memoriaPrincipal;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }
}
