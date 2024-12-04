package Builder;

public class MorcegoConcreto implements MorcegoBuilder {
    private String tipo;
    private String cor;
    private String ataque;
    private String estado;
    
    // Esta classe é a responsável por implementar efetivamente
    // as funções pelo método override para assim "Construir" o objeto
    // "Morcego" quando todos os valores forem definidos no Diretor
    // então finalmente ele gera o objeto final Morcego
	
    @Override
	public void setTipo(String tipo) {
		this.tipo = tipo;
		
	}

	@Override
	public void setCor(String cor) {
		this.cor = cor;
		
	}

	@Override
	public void setAtaque(String ataque) {
		this.ataque = ataque;
	}

	@Override
	public void setEstado(String estado) {
		this.estado = estado;
		
	}

	@Override
	public Morcego build() {
		return new Morcego(tipo, cor, ataque, estado);
	}
	
}
