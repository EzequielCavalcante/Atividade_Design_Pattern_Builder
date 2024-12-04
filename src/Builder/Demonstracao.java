package Builder;

public class Demonstracao {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();
        MorcegoBuilder builder = new MorcegoConcreto();

        // Criando Morcego de Fogo
        diretor.construirMorcegoFogo(builder);
        Morcego morcegoFogo = builder.build();
        morcegoFogo.exibirInfo();
        morcegoFogo.atacar();

        // Criando Morcego de Gelo
        diretor.construirMorcegoGelo(builder);
        Morcego morcegoGelo = builder.build();
        morcegoGelo.exibirInfo();
        morcegoGelo.atacar();
    }
}

