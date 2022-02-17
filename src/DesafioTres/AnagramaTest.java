package DesafioTres;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnagramaTest {

	@Test
	public void qtdAnagramasPares() {		
		int qtd =  Anagrama.qtdAnagramasPares("ovo");
		Assertions.assertEquals(2, qtd);
		
		qtd = Anagrama.qtdAnagramasPares("ifailuhkqq");
		Assertions.assertEquals(3, qtd);
		
		qtd = Anagrama.qtdAnagramasPares("abcde");
		Assertions.assertEquals(0, qtd);
	}
}
