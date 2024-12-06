package Builder;

public class Demonstracao {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();
        MorcegoBuilder builder = new MorcegoConcreto();

        // Criando Morcego de Fogo
        diretor.construirMorcegoFogo(builder);
        Morcego morcegoFogo = builder.build();

        // Criando Morcego de Gelo
        diretor.construirMorcegoGelo(builder);
        Morcego morcegoGelo = builder.build();
		
		BatalhaMorcegos batalha_morcegaços = new BatalhaMorcegos(morcegoFogo, morcegoGelo);
		batalha_morcegaços.iniciarBatalha();

    }
}

