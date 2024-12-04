package Builder;

public interface MorcegoBuilder {
	void setTipo(String tipo);
	void setCor(String cor);
	void setAtaque(String ataque);
	void setEstado(String estado);
	Morcego build();
	
	// Essa daqui é a interface que vai ditar o que é necessário para o
	// "MorcegoConcreto" implementar e configurar o objeto Morcego
}
