package Builder;

public class MedicoBuilder {
    private Medico medico;

    public MedicoBuilder(){
        medico = new Medico();
    }

    public Medico build(){
        if(medico.getCpf().equals("")){
            throw new IllegalArgumentException("CPF inválido");
        }
        if(medico.getNome().equals("")){
            throw new IllegalArgumentException("Nome inválido");
        }
        if(medico.getCrm().equals("")){
            throw new IllegalArgumentException("CRM inválido");
        }
        return medico;
    }

    public MedicoBuilder setCrm(String crm) {
        medico.setCrm(crm);
        return this;
    }

    public MedicoBuilder setNome(String nome) {
        medico.setNome(nome);
        return this;
    }

    public MedicoBuilder setCpf(String cpf) {
        medico.setCpf(cpf);
        return this;
    }
}
