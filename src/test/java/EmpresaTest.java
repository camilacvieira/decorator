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

        assertEquals(1050.0f, empresa.getCargaHoraria());
    }


    @Test
    void deveRetornarEstruturaEmpresa() {
        Empresa empresa = new EmpresaTI();

        assertEquals("TI", empresa.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaEmpresaComLider() {
        Empresa empresa = new Lider(new EmpresaTI());

        assertEquals("TI/Lider", empresa.getEstrutura());
    }


}