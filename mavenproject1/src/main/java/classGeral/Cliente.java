package classGeral;
    public class Cliente {
        private String nomeCliente;
        private Endereco endereco;
        private int idadeCliente;
        private String cpfCliente;
        private String telefone;
        private String emailCliente;

    public Cliente(String nomeCliente, Endereco endereco, int idadeCliente, String cpfCliente, String telefone, String emailCliente) {
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.idadeCliente = idadeCliente;
        this.cpfCliente = cpfCliente;
        this.telefone = telefone;
        this.emailCliente = emailCliente;
    }

    public Cliente() {
    }
 

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Endereco getEndreco() {
        return endereco;
    }

    public void setEndreco(Endereco endreco) {
        this.endereco = endreco;
    }

    public int getIdadeCliente() {
        return idadeCliente;
    }

    public void setIdadeCliente(int idadeCliente) {
        this.idadeCliente = idadeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Nome do cliente: ").append(nomeCliente);
        sb.append("\n Idade: ").append(idadeCliente);
        sb.append("\nCpf: ").append(cpfCliente);
        sb.append("\nTelefone: ").append(telefone);
        sb.append("\nEmail: ").append(emailCliente);
        return sb.toString();
    }

        
}