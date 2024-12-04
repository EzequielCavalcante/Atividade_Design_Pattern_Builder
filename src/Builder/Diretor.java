package Builder;

public class Diretor {
	
	// Aqui é onde é definido cada característica do objeto
	// O objetivo dele é gerar de maneira sucinta, objetiva e
	// de fácil leitura a construção do objeto.
	
	    public void construirMorcegoFogo(MorcegoBuilder builder) {
	        builder.setTipo("Fogo");
	        builder.setCor("Vermelho");
	        builder.setAtaque("Chamas");
	        builder.setEstado("Vivo");
	    }

	    public void construirMorcegoGelo(MorcegoBuilder builder) {
	        builder.setTipo("Gelo");
	        builder.setCor("Azul");
	        builder.setAtaque("Água");
	        builder.setEstado("Vivo");
	    }
	}

