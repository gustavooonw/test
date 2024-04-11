package classGeral;
    public class Livro {
        private String nomeLivro;
        private String autorLivro;
        private String generoLivro;
        private double valorLivro;
        private String editoraLivro;
        private String anoLancamento;
        private int qtPaginasLivro;
        private int qtEstoqueLivro;

        
    public Livro(String nomeLivro, String autorLivro, String generoLivro,int qtEstoqueLivro , String editoraLivro, String anoLancamento, int qtPaginasLivro, double valorLivro) {
        this.nomeLivro = nomeLivro;
        this.autorLivro = autorLivro;
        this.generoLivro = generoLivro;
        this.valorLivro = valorLivro;
        this.editoraLivro = editoraLivro;
        this.anoLancamento = anoLancamento;
        this.qtPaginasLivro = qtPaginasLivro;
        this.qtEstoqueLivro = qtEstoqueLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public String getGeneroLivro() {
        return generoLivro;
    }

    public void setGeneroLivro(String generoLivro) {
        this.generoLivro = generoLivro;
    }

    public double getValorLivro() {
        return valorLivro;
    }

    public void setValorLivro(double valorLivro) {
        this.valorLivro = valorLivro;
    }

    public String getEditoraLivro() {
        return editoraLivro;
    }

    public void setEditoraLivro(String editoraLivro) {
        this.editoraLivro = editoraLivro;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getQtPaginasLivro() {
        return qtPaginasLivro;
    }

    public void setQtPaginasLivro(int qtPaginasLivro) {
        this.qtPaginasLivro = qtPaginasLivro;
    }

    public int getQtEstoqueLivro() {
        return qtEstoqueLivro;
    }

    public void setQtEstoqueLivro(int qtEstoqueLivro) {
        this.qtEstoqueLivro = qtEstoqueLivro;
    }

   

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNOME DO LIVRO: ").append(nomeLivro);
        sb.append("\nAUTOR DO LIVRO: ").append(autorLivro);
        sb.append("\nGENERO DO LIVRO: ").append(generoLivro);
        sb.append("\nVALOR DO LIVRO: ").append(valorLivro);
        sb.append("\nEDITORA DO LIVRO: ").append(editoraLivro);
        sb.append("\nANO DE LANÇAMENTO: ").append(anoLancamento);
        sb.append("\nQUANTIDADE DE PAGINAS: ").append(qtPaginasLivro);
        sb.append("\nQUANTIDADE NO ESTORQUE:").append(qtEstoqueLivro);
        sb.append("\n=============================");
        return sb.toString();
    }      
}