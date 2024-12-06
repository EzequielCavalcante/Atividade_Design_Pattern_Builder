package Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class BatalhaMorcegos 
{

	private Morcego vencedor;
	private List<Morcego> participantes;
    private Random random = new Random();

	public BatalhaMorcegos( Morcego primeiro_morcego, Morcego segundo_morcego ) {
		this.vencedor = null;
		this.participantes = new ArrayList<>();
		this.participantes.add(primeiro_morcego);
		this.participantes.add(segundo_morcego);
	}

	public void mostrarParticipantes() {
		System.out.println("Os participantes são:");
		for (Morcego morcego : participantes) {
			morcego.exibirInfo();
		}
	}

	public void mostrarVencedor() {
		if(this.vencedor == null)
		{
			System.out.println("O vencedor ainda não foi decidido.");
		}
		if(this.vencedor instanceof Morcego)
		{
			System.out.println("O vencedor foi:");
			this.vencedor.exibirInfo();
		}
	}

	private boolean rodada(int indice_atacante) {

		boolean batalha_encerrada = false;
		int indice_atacado = indice_atacante == 1 ? indice_atacante - 1 : indice_atacante + 1; 

		if((participantes.get(indice_atacado).tipo != participantes.get(indice_atacante).tipo))
		{
			if(participantes.get(indice_atacante).dano_base < 50)
			{
				participantes.get(indice_atacante).aumentarDanoBase();
			}
		}
        try{  
            Thread.sleep(2000);
			participantes.get(indice_atacante).atacar();
			participantes.get(indice_atacado).hp -= participantes.get(indice_atacante).dano_base;
            Thread.sleep(1000);
			participantes.get(indice_atacante).exibirInfo();
			participantes.get(indice_atacado).exibirInfo();
        } catch(InterruptedException e) {
          e.printStackTrace();
        }
		if(participantes.get(indice_atacado).hp == 0)
		{
			participantes.get(indice_atacado).estado = "Morto";
			this.vencedor = participantes.get(indice_atacante);
			batalha_encerrada = true;
		}
		return batalha_encerrada; 
	}
	public void iniciarBatalha() {	
		boolean batalha_encerrada;
		while(true) {
			int indice_atacante = random.nextInt(participantes.size());
			batalha_encerrada = this.rodada(indice_atacante);
			if(batalha_encerrada)
			{
				break;
			}
		}
		this.mostrarVencedor();
	}

}
