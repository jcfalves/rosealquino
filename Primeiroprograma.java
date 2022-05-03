package br.com.dio;

import br.com.dio.model.Gato;

public class Primeiroprograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* System.out.println("Hello World");*/
		
		Gato gato = new Gato();
		gato.setNome("Jose Carlos");
		gato.setIdade(50);
		gato.setCor("preto");
		
		System.out.println(gato);
		
	}

}
