package br.edu.iftm.boletim.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.iftm.boletim.Boletim;
import br.edu.iftm.boletim.Prova;

public class ProvaTest {


	@Test
	public void testProvaValendoMaisQueCem() {
		Prova p = new Prova();
		
		p.setNota_max(0.0);
		
		double experado = 0.0;
		double atual = p.getNota_max();
		
		assertEquals(experado, atual, 0.0);
		
		
		
	}
	
	@Test
	public void testTotalDasProvas(){
		Prova p1 = new Prova();
		p1.setNota_max(20);
				
		Prova p2 = new Prova();
		p2.setNota_max(20);
				
		Prova p3 = new Prova();
		p3.setNota_max(60);
				
		Boletim boletim = new Boletim();
		boletim.adicionaProva(p1);
		boletim.adicionaProva(p2);
		boletim.adicionaProva(p3);
		
		double atual = 100;
		double esperado = boletim.somaDasProvas();
		
		assertEquals(esperado, atual, 0.0);
		
	}
	@Test
	public void testNotaFinal(){
		
		
	
		Prova p1 = new Prova();
		p1.setNota_max(30);
		p1.setNota_obtida(20);
		
		
		Prova p2 = new Prova();
		p2.setNota_max(30);
		p2.setNota_obtida(10);
		
		Prova p3 = new Prova();
		p3.setNota_max(40);
		p3.setNota_obtida(35);
		
		Boletim boletim = new Boletim();
		boletim.adicionaProva(p1);
		boletim.adicionaProva(p2);
		boletim.adicionaProva(p3);
		
		double atual = 65;
		double esperado = boletim.getNotaFinal();
		
		assertEquals(esperado, atual, 0.0);
	}
	
	@Test
	public void testResultadoFinal(){
		Boletim b = new Boletim();
		Prova p1 = new Prova();
		p1.setNota_max(100);
		p1.setNota_obtida(60);
		b.adicionaProva(p1);
		
		boolean atual = true;
		boolean esperado = b.foiAprovado();
		
		assertEquals(esperado, atual);
	}
	
	
	@Test
	public void testAlunoReprovado(){
		Boletim b = new Boletim();
		Prova p1 = new Prova();
		p1.setNota_max(100);
		p1.setNota_obtida(59.9);
		b.adicionaProva(p1);
		
		boolean atual = false;
		boolean esperado = b.foiAprovado();
		
		assertEquals(esperado, atual);
	}
	
	@Test
	public void testNotaObtida_notaMax(){
		Prova p1 = new Prova();
		p1.setNota_max(30);
		p1.setNota_obtida(31);
		
		double atual = 0.0;
		double esperado = p1.getNota_obtida();
		
		assertEquals(esperado, atual, 0.0);
	}
	
	
	

}
