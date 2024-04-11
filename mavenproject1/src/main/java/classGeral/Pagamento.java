
package classGeral;
    public class Pagamento {
    private String formaPagamento;

    public Pagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Pagamento() {
    }
    
    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Forma de pagamento:\n");
        sb.append(formaPagamento);
        return sb.toString();
    }
    
    
    
}
