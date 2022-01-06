public abstract class EmpresaDecorator implements Empresa {

    private Empresa empresa;
    public String estrutura;

    public EmpresaDecorator(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public abstract float getPercentualCargaHoraria();

    public float getCargaHoraria() {
        return this.empresa.getCargaHoraria() * (1 + (this.getPercentualCargaHoraria() / 100));
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.empresa.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}
