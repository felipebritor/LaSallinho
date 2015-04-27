package com.ls.ludica.game;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.ls.ludica.telas.Carregando;

/**
 * 
 * A classe principal do jogo. 
 *
 */

public class AsAventurasDeLaSallinho extends Game {
	/*
	 * É mais fácil criar menus e telas de configuração com o Scene2D.
	 * A classe Stage é o palco para a montagem das telas que o usam.
	 * Todas usam o mesmo palco.
	 */
	private Stage palco;
	private boolean android;
	
	// Telas
	private Screen gameScreen;
	private Screen menuPrincipal;
	private Screen selecionarMapa;
	private Screen gameOver;
	private Screen carregando;
	
	// Skins & Texturas
	private Skin menuSkin;
	
	// Largura e Altura da Tela
	private int larguraTela;
	private int alturaTela;
	
	@Override
	public void create () {
		palco = new Stage();
		android = Gdx.app.getType() == ApplicationType.Android ? true : false;
		//menuSkin = new Skin(Gdx.files.internal("menu/menu_ui.json"), 
		//		new TextureAtlas(Gdx.files.internal("menu/menu_ui.atlas")));
		/*
		 * A tela GameScreen deve ser um InputProcessor, para manipularmos melhor as ações do La Sallinho
		 * dentro do jogo. 
		 * Para as outras, podemos deixa o input do usuário com o nosso palco.
		 */
		Gdx.input.setInputProcessor(palco);
		
		carregando = new Carregando(this);
		setScreen(carregando);
	}

	
	public Stage getPalco() {
		return palco;
	}


	public boolean isAndroid() {
		return android;
	}


	public Screen getGameScreen() {
		return gameScreen;
	}


	public void setGameScreen(Screen gameScreen) {
		this.gameScreen = gameScreen;
	}


	public Screen getMenuPrincipal() {
		return menuPrincipal;
	}


	public void setMenuPrincipal(Screen mainMenu) {
		this.menuPrincipal = mainMenu;
	}


	public Screen getSelecionarMapa() {
		return selecionarMapa;
	}


	public void setSelecionarMapa(Screen selecionarMapa) {
		this.selecionarMapa = selecionarMapa;
	}


	public Screen getGameOver() {
		return gameOver;
	}


	public void setGameOver(Screen gameOver) {
		this.gameOver = gameOver;
	}


	public Skin getMenuSkin() {
		return menuSkin;
	}


	public void setMenuSkin(Skin menuSkin) {
		this.menuSkin = menuSkin;
	}


	public Screen getCarregando() {
		return carregando;
	}
	
	
}
