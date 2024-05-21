package com.funcao.celular;

import com.funcao.celular.internet.NavegadorInternet;
import com.funcao.celular.musica.ReprodutorMusical;
import com.funcao.celular.telefone.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{

	@Override
	public void ligar(String numero) {
		iniciarCorreioVoz();
		System.out.println("LIGANDO PARA" + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO...");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
		
	}

	@Override
	public void tocar() {
		System.out.println("TOCANDO MÚSICA...");
		
	}

	@Override
	public void pausar() {
		System.out.println("MUSICA PAUSADA");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando a música " + musica);
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("EXIBINDO A PÁGINA " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA...");
		
	}

}
