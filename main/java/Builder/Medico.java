package Builder;

public class Medico {
    private String crm;
    private String nome;
    private String cpf;

    public Medico(){
        this.crm = "";
        this.nome = "";
        this.cpf = "";
    }

    public String getCrm() {
        return crm;
    }

    public Medico setCrm(String crm) {
        this.crm = crm;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Medico setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public Medico setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }
}
