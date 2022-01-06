
public class EmpresaTI implements Empresa {

    public float cargaHoraria;

    public EmpresaTI() {
    }

    public EmpresaTI(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public String getEstrutura() {
        return "TI";
    }

}