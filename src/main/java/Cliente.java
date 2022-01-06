public class Cliente extends EmpresaDecorator {

    public Cliente(Empresa empresa) {
        super(empresa);
    }

    public float getPercentualCargaHoraria() {
        return 5.0f;
    }

    public String getNomeEstrutura() {
        return "Cliente";
    }
}