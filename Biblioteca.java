
package biblioteca;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Biblioteca {

    public static ArrayList<Pessoa> pessoas;
    public static ArrayList<Livro> livros;
    public static ArrayList<Emprestimo> emprestimos;

    public static void main(String[] args) {

        pessoas = new ArrayList<>();
        livros = new ArrayList<>();
        emprestimos = new ArrayList<>();
        String[] opcoes = {"Cadastrar Pessoa", "CadastrarLivro", "Registrar Emprestimo",
            "Exibir pessoas cadastras","remover", "Sair"};
        int opcaoSelecionada = 0;

        while (opcaoSelecionada != 5) {
            opcaoSelecionada = JOptionPane.showOptionDialog(null, "Selecione uma opção",
                    "Menu inicial", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[2]);

            if (opcaoSelecionada == 0) {
                cadastrarPessoa();
            }
            else if(opcaoSelecionada == 1){
                cadastrarLivro();
            }
              else if(opcaoSelecionada == 2){
                registrarEmprestimo();
            }
              else if (opcaoSelecionada == 3){
                  exibirPessoas();
              }
              else if (opcaoSelecionada == 4){
                  remover();
              }
             }
        
    }

    public static void cadastrarPessoa() {
        String nome = JOptionPane.showInputDialog(null,
                "Digite o nome do leitor", "Cadastro de Leitores");
        Pessoa p = new Pessoa(nome);
        pessoas.add(p);
    }

    public static void exibirPessoas() {
        for (Pessoa p : pessoas) {
            JOptionPane.showMessageDialog(null, p);
        }
    }
    

        public static void cadastrarLivro() {
        String titulo = JOptionPane.showInputDialog(null,
                "Digite o titulo" , "Cadastro de livros");
                String autor = JOptionPane.showInputDialog(null,
                "Digite o nome do autor" , "Cadastro de livros");
                int quantidadeCopias = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite a quantidade de copias" , "Cadastro de livros"));
        Livro l = new Livro(titulo, autor, quantidadeCopias);
        livros.add(l);
    }
        public static void registrarEmprestimo(){
            Object[] lei = pessoas.toArray();
            Object[] liv = livrosDisponiveis();
            Pessoa leitor = (Pessoa)JOptionPane.showInputDialog(null, "qual pessoa vai emprestar", "Emprestimo", JOptionPane.QUESTION_MESSAGE, null, lei, lei);
                 
            Livro livro = (Livro)JOptionPane.showInputDialog(null, "qual o livro ?", "Emprestimo", JOptionPane.QUESTION_MESSAGE, null, liv, liv);
            
            Emprestimo emp = new Emprestimo(leitor, livro);
            
            emprestimos.add(emp);
            
            

        }

        
        public static Object[] livrosDisponiveis(){
        ArrayList<Livro> LivroDisp = new ArrayList<>();
        for(Livro l : livros){
                for(CopiaLivro c : l.copias){
                    if(c.isDisponivel()){
                        LivroDisp.add(l);
                        break;
                    }  
                    }
                }
                return LivroDisp.toArray();       
            } 
        public static void remover(){
            String[] opcao = {"remover um livro", "remover uma copia de livro","sair"};
            
        int selecionada = 0;
        
        while (selecionada != 2){            
         selecionada = JOptionPane.showOptionDialog(null, "Selecione uma opção",
                "Menu inicial", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opcao, opcao);
         
         if(selecionada == 0){
             removerLivro();
         }
         else if(selecionada == 1){
             removerCopia();
         }
         else if(selecionada == 2){
             break;
         }
        
        }
        
        }
        
        public static void removerLivro(){
        Object[] liv = livros.toArray();

        Livro livro = (Livro)JOptionPane.showInputDialog(null, "qual o livro deseja remover?", "remoção", JOptionPane.QUESTION_MESSAGE, null, liv, liv);

        for(Livro l: livros){
            if(l.getTitulo() == livro.getTitulo()){
                livros.remove(l);
            }
        }
            
        
        
        }
        public static void removerCopia(){
        Object[] liv = livrosDisponiveis();

        Livro livro = (Livro)JOptionPane.showInputDialog(null, "qual o livro deseja remover uma copia?", "remoção", JOptionPane.QUESTION_MESSAGE, null, liv, liv);
        
        livro.removerCopia();
        
        }
}
