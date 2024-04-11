package classGeral;
    public class Endereco {
        private String rua;
        private int numero;
        private String bairro;
        private String estado;
        private String cidade;
        private String pais;
        private String cep;

    public Endereco(String rua, int numero, String bairro, String estado, String cidade, String pais, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.estado = estado;
        this.cidade = cidade;
        this.pais = pais;
        this.cep = cep;
    }

    public Endereco() {
    }
        
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nRua: ").append(rua);
        sb.append("\nNumero:").append(numero);
        sb.append("\nBairro: ").append(bairro);
        sb.append("\nEstado: ").append(estado);
        sb.append("\nCidade: ").append(cidade);
        sb.append("\nPais: ").append(pais);
        sb.append("\nCep: ").append(cep);
        return sb.toString();
    }

    
        
        
}