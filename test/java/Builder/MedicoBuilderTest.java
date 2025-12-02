package Builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicoBuilderTest {

    @Test
    void deveRetornarErroNome(){
        try{
            MedicoBuilder medicoBuilder = new MedicoBuilder();
            Medico medico = medicoBuilder
                    .setCpf("5678")
                    .setCrm("1234")
                    .build();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarErroCpf(){
        try{
            MedicoBuilder medicoBuilder = new MedicoBuilder();
            Medico medico = medicoBuilder
                    .setNome("Thiago")
                    .setCrm("1234")
                    .build();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("CPF inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarErroCrm(){
        try{
            MedicoBuilder medicoBuilder = new MedicoBuilder();
            Medico medico = medicoBuilder
                    .setNome("Thiago")
                    .setCpf("1234")
                    .build();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("CRM inválido", e.getMessage());
        }
    }

}