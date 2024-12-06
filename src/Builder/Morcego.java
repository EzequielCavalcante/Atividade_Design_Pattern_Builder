package Builder;

public class Morcego {
    public final String tipo;
    private final String cor;
    private final String ataque;
    public String estado;
	public int dano_base; 
	public int hp;
    
    // Este é objeto final configurado e construido pelo 
    // "MorcegoConcreto"que é usado diretamente pelo cliente
    // neste caso o arquivo "Demonstracao"
    
    public Morcego(String tipo, String cor, String ataque, String estado) {
        this.tipo = tipo;
        this.cor = cor;
        this.ataque = ataque;
		this.dano_base = 25;
		this.hp = 100;
        this.estado = estado;
    }

	public void aumentarDanoBase() {
		this.dano_base += 25;
	}
    
    public void atacar() {
        System.out.println("O morcego de " + tipo + " atira " + ataque + ", causando " + dano_base + " pontos de dano em seu oponente!");
    }

    public void exibirInfo() {
        System.out.println("Morcego [" + "Tipo: " + tipo + ", Cor: " + cor + ", HP: " + hp + ", Estado: " + estado + "]");
    }
}
