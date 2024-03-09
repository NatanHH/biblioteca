
package biblioteca;

public class Emprestimo {
    private Pessoa Leitor;
    private Livro copia;

    public Emprestimo(Pessoa Leitor, Livro copia) {
        this.Leitor = Leitor;
        this.copia = copia;
    }
    

    public Pessoa getLeitor() {
        return Leitor;
    }

    public void setLeitor(Pessoa Leitor) {
        this.Leitor = Leitor;
    }

    public Livro getCopia() {
        return copia;
    }

    public void setCopia(Livro copia) {
        this.copia = copia;
}

}