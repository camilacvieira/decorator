public class Lider extends EmpresaDecorator {

    public Lider(Empresa empresa) {
        super(empresa);
    }

    public float getPercentualCargaHoraria() {
        return 5.0f;
    }

    public String getNomeEstrutura() {
        return "Lider";
    }
}