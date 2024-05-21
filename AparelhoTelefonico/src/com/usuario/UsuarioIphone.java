package com.usuario;

import com.funcao.celular.Iphone;
import com.funcao.celular.internet.NavegadorInternet;
import com.funcao.celular.musica.ReprodutorMusical;
import com.funcao.celular.telefone.AparelhoTelefonico;

public class UsuarioIphone {

	public static void main(String[] args) {
		
		System.out.println("----------INTERNET----------");
		NavegadorInternet navegadorInternet = new Iphone();
		
		navegadorInternet.adicionarNovaAba();
		navegadorInternet.exibirPagina("google");
		navegadorInternet.atualizarPagina();
		
		System.out.println("----------MÚSICA----------");
		ReprodutorMusical reprodutorMusical = new Iphone();
		
		reprodutorMusical.selecionarMusica("Andando sobre as águas");
		reprodutorMusical.tocar();
		reprodutorMusical.pausar();
		
		System.out.println("----------TELEFONE----------");
		AparelhoTelefonico aparelhoTelefonico = new Iphone();
		
		aparelhoTelefonico.ligar("25144726");
		aparelhoTelefonico.atender();
		
		
		
	}

}
