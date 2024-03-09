
package biblioteca;

import java.util.ArrayList;

public class Livro {

    private String autor;
    private String titulo;
    ArrayList<CopiaLivro> copias;

    public Livro(String titulo, String autor, int quantidadeCopias) {
        this.autor = autor;
        this.titulo = titulo;
        copias = new ArrayList<>();

        adicionarCopias(quantidadeCopias);
    }

    public void adicionarCopias(int quantidadeCopias) {
        for (int i = 0; i < quantidadeCopias; i++) {
            copias.add(new CopiaLivro());
 }       
}
    @Override
    public String toString() {
        return  titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    public void removerCopia(){
        copias.remove(0);
           
    }
    
    
    
}
