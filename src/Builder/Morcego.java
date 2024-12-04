package Builder;

public class Morcego {
    private final String tipo;
    private final String cor;
    private final String ataque;
    private final String estado;
    
    // Este é objeto final configurado e construido pelo 
    // "MorcegoConcreto"que é usado diretamente pelo cliente
    // neste caso o arquivo "Demonstracao"
    
    public Morcego(String tipo, String cor, String ataque, String estado) {
        this.tipo = tipo;
        this.cor = cor;
        this.ataque = ataque;
        this.estado = estado;
    }
    
    public void atacar() {
        System.out.println("O morcego de " + tipo + " atira " + ataque + "!");
    }

    public void exibirInfo() {
        System.out.println("Morcego [" + "Tipo: " + tipo + ", Cor: " + cor + ", Estado: " + estado + "]");
    }
}
