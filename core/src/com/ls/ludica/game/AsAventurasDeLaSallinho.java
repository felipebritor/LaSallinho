package com.ls.ludica.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.ls.ludica.telas.MainMenu;

/**
 * 
 * A classe principal do jogo. Ela apenas setta a primeira tela, menu.
 *
 */

public class AsAventurasDeLaSallinho extends Game {
	/*
	 * É mais fácil criar menus e telas de configuração com o Scene2D.
	 * A classe Stage é o palco para a montagem das telas.
	 */
	private Stage palco;
	
	@Override
	public void create () {
		palco = new Stage();
		/*
		 * A tela GameScreen deve ser um InputProcessor, para manipularmos melhor as ações do La Sallinho
		 * dentro do jogo. 
		 * Para as outras, podemos deixa o input do usuário com o nosso palco.
		 */
		Gdx.input.setInputProcessor(palco);
		
		setScreen(new MainMenu(this));
	}

	
	public Stage getPalco() {
		return palco;
	}
	
}
