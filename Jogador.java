public class Jogador {
    
    
	private String nome;
    
	private int numero;
    
    
	public static void main(String[] args) {
        
		Jogador jogador = new Jogador();
        		jogador.setNumero(10);
        
		jogador.setNome("Pelé");
        
		System.out.println("O " + jogador.getNome() + " foi um dos melhores camisa " + jogador.getNumero() + " de todos os tempos");
        
		System.out.println("referência do objeto " + jogador);
    
	}

    
	public String getNome() {
        
		return nome;
    
	}

    
	public void setNome(String nome) {
        
		this.nome = nome;
    
	}

    
	public int getNumero() {
        
		return numero;
    
	}
	
    
	public void setNumero(int numero) {
        
		this.numero = numero;
    
	}

}