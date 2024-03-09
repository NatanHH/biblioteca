
package biblioteca;

import java.util.UUID;

public class CopiaLivro {
    private String id;
    private boolean disponivel;

    public CopiaLivro(){
        disponivel = true;
        
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }
    
    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
 }
}