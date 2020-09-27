package View;

import processing.core.PApplet;
import processing.core.PImage;

public class GameScreen extends Screen {

		PImage game1;
		PImage game2;
		PImage game3;
	GameScreen(int posX, int posY, PApplet app) {
		super(posX, posY, app);
		this.game1= app.loadImage("ERFondo1.png");
		this.game2= app.loadImage("ERFondo2.png");
		this.game3= app.loadImage("ERFondo3.png");
		// TODO Auto-generated constructor stub
	}
	
	void paint() {
		app.image(this.game3,this.posX,this.posY, 869*2,653);
		app.image(this.game2,this.posX,this.posY, 869*2,653);
		app.image(this.game1,this.posX,this.posY, 869*2,653);
	
		
		
	}
	
	void move() {
		super.move();
	}

}
