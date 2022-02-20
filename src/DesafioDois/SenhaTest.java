package DesafioDois;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SenhaTest {
	
	@Test
	public void senhaSegura() {
		int qtdCaracteresFaltantes = Senha.senhaSegura("Ya3");
		Assertions.assertEquals(3, qtdCaracteresFaltantes);
		
		qtdCaracteresFaltantes = Senha.senhaSegura("abcde");
		Assertions.assertEquals(3, qtdCaracteresFaltantes);
		
		qtdCaracteresFaltantes = Senha.senhaSegura("matematica");
		Assertions.assertEquals(3, qtdCaracteresFaltantes);
		
		qtdCaracteresFaltantes = Senha.senhaSegura("E#5o");
		Assertions.assertEquals(2, qtdCaracteresFaltantes);
		
		qtdCaracteresFaltantes = Senha.senhaSegura("m@t3Mat1C4");
		Assertions.assertEquals(0, qtdCaracteresFaltantes);
	}

}
