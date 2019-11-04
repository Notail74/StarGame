package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class StarGame extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture img;
	private TextureRegion region;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		region = new TextureRegion(img, 20, 30, 50, 70);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0.255f, 0.11f, 0.19f, 0.2f);//цвет фона
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();// метод передачи текстур
		batch.setColor(1f, 1f, 1f, 1);//метод отрисовки картинки
		batch.draw(img, 100, 50, 100, 100);// метод для отрисовки
		batch.draw(region, 400, 400);
		batch.setColor(1f, 1f, 1f, 0.2f);
		batch.draw(img, 100, 50);
		batch.end(); // закрытие передачи текстур
	}
	
	@Override//когда игра закрылась выгрузить из памяти тяжелые обьекты
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
