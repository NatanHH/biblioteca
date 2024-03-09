
package biblioteca;

import java.util.UUID;


public class Pessoa {
    String nome;
    String id;
    
    public Pessoa(String nome){
        this.nome = nome;
        id = UUID.randomUUID().toString();
    }
    
    @Override
    public String toString(){
        return nome;
    }
}