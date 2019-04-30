public class SwitchBreakExemplo1 {
    
    
	public static void main(String[] args) {
 	
		char indice = 'b';
		String resultado = "";
		switch (indice) {
			case 'a': resultado += 'a'; break;
			case 'b': resultado += 'b';
			case 'c': resultado += 'c'; break;
			default: resultado += 'd';
		}
			System.out.println(resultado);

	}
   
}

