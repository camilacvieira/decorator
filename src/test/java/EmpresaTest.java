import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void deveRetornarCargaHorariaEmpresa() {
        Empresa empresa = new EmpresaTI(1000.0f);

        assertEquals(1000.0f, empresa.getCargaHoraria());
    }

    @Test
    void deveRetornarCargaHorariaEmpresaComLider() {
        Empresa empresa = new Lider(new EmpresaTI(1000.0f));

        assertEquals(1100.0f, empresa.getCargaHoraria());
    }


    @Test
    void deveRetornarEstruturaEmpresa() {
        Empresa empresa = new EmpresaTI();

        assertEquals("Graduação", empresa.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCursoComLider() {
        Empresa empresa = new Lider(new EmpresaTI());

        assertEquals("Graduação/Estágio", empresa.getEstrutura());
    }


}