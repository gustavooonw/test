package bibliotecamain;

import classGeral.Cliente;
import classGeral.Endereco;
import classGeral.Livro;
import classGeral.Pagamento;
import javax.swing.JOptionPane;

public class bibliotecaMain {
    public static void main(String[] args) {
        //LIVROS ↓
        Livro livro1 = new Livro("Diario De Um Banana 1", "Jeff Kinney", "Ficção", 10, "VR Editora", "19 maio 2008", 224, 59.90);
        Livro livro2 = new Livro("Harry Potter e o Calice de Fogo", "J.K Rowling", "Ficção", 10, "Rocco", "8 de Julho de 2000", 480, 74.93);
        Livro livro3 = new Livro("Harry Potter e o Prisioneiro de Azkaban", "J.K Rowling", "Ficção", 10, "Rocco", "8 Julho 1999", 472, 239.00);
        
        //ENDERECO CLIENTE ↓
        Endereco endereco1 = new Endereco("Rua Feliz", 57, "Alegria", "Parana", "Toledo", "Brasil", "40028-922");
        
        //DADOS DO CLIENTE ↓
        Cliente cliente1 = new Cliente("Cleiton Rasta", endereco1, 27, "123.456.789.10", "45 99999-9999", "cleitonrastadelas@gmail.com");
        
        // ↓ DESCRICAO DOS LIVROS ↓ 
        String descricaoLivros= 
                            "Seja bem vindo! " + cliente1.getNomeCliente() +"\n"
                            +"=============================\n"
                            +"LIVROS DISPONIVEIS PARA VENDA\n"
                            +"============================="
                            +"\n- LIVRO -> 1 -"
                            +livro1
                            +"\n- LIVRO -> 2 -"
                            +livro2
                            +"\n- LIVRO -> 3 -"
                            +livro3; 
        JOptionPane.showMessageDialog(null, descricaoLivros);
        //---------------------------------------------------------------------------------------------------
        // ↓ ESCOLHER LIVRO DESEJADO ↓ 
        int livroEscolhido = Integer.parseInt(JOptionPane.showInputDialog("Escolha o livro (1, 2 ou 3):"));
        if(livroEscolhido > 3){
        JOptionPane.showMessageDialog(null, "Livro inexistente! Por favor digite corretamente");
        System.exit(0);
        }
        //---------------------------------------------------------------------------------------------------
        // ↓ QUANTIDADE DESEJADA ↓
        int quantidadeDesejada = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada:")); 
        //---------------------------------------------------------------------------------------------------
        // ☻ ESCOLHA DO LIVRO ↓
        double valorUnitario = 0.0;
        String nomeLivro = "";
        int qtDisponivel = 0;
        
        switch (livroEscolhido) {
            case 1:
                valorUnitario = livro1.getValorLivro();
                nomeLivro = livro1.getNomeLivro();
                qtDisponivel = livro1.getQtEstoqueLivro();
                break;
            case 2:
                valorUnitario = livro2.getValorLivro();
                nomeLivro = livro2.getNomeLivro();
                qtDisponivel = livro2.getQtEstoqueLivro();
                break;
            case 3:
                valorUnitario = livro3.getValorLivro();
                nomeLivro = livro3.getNomeLivro();
                qtDisponivel = livro3.getQtEstoqueLivro();
                break;
        }
        //---------------------------------------------------------------------------------------------------
        // ↓ DIMINUIR QUANTIDADE NO ESTOQUE E VALIDAR QUANTIDADE ↓
        if (quantidadeDesejada > qtDisponivel) {
            JOptionPane.showMessageDialog(null, "Quantidade desejada indisponível em estoque.");
            System.exit(0);
        }
         switch (livroEscolhido) {
            case 1:
                livro1.setQtEstoqueLivro(livro1.getQtEstoqueLivro()- quantidadeDesejada);
                break;
            case 2:
                livro2.setQtEstoqueLivro(livro2.getQtEstoqueLivro()- quantidadeDesejada);
                break;
            case 3:
                livro3.setQtEstoqueLivro(livro3.getQtEstoqueLivro()- quantidadeDesejada);
                break;
        }
        //---------------------------------------------------------------------------------------------------
        // ↓ FORMA DE PAGAMENTO E DESCONTO ↓
        Pagamento formaPagamento = new Pagamento(JOptionPane.showInputDialog("Qual a forma de pagamento?"));
        double valorTotal = (valorUnitario * quantidadeDesejada);
        double valorDesconto = (valorUnitario - 20) * quantidadeDesejada;
        //---------------------------------------------------------------------------------------------------
        
        // ↓ RESUMO DA COMPRA ↓
        String resumoCompra = "Resumo da Compra: \n"
                + "Cliente: " + cliente1 + "\n"
                + "\n"
                + "Endereço: " + endereco1 + "\n"
                + "\n"
                + "Livro escolhido: " + nomeLivro + "\n"
                + "Quantidade: " + quantidadeDesejada + "\n"
                + "Forma de pagamento: " + formaPagamento.getFormaPagamento() + "\n "
                + "Valor unitário: R$" + valorUnitario + "\n"
                + "Valor sem Desconto: R$" + valorTotal + "\n"
                + "Valor com Desconto: R$" + valorDesconto + "\n"
                + "\nQuantidade restante estoque: ";
        
                switch (livroEscolhido) {
                case 1:
                resumoCompra += livro1.getQtEstoqueLivro();
                break;
                case 2:
                resumoCompra += livro2.getQtEstoqueLivro();
                break;
                case 3:
                resumoCompra += livro3.getQtEstoqueLivro();
                break;
}
                
        JOptionPane.showMessageDialog(null, resumoCompra);
    }
}
