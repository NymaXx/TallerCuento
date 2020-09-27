package View;

import processing.core.PApplet;
import processing.core.PImage;

public class GameScreen extends Screen {

		PImage game1;
		PImage game2;
		PImage game3;
	GameScreen(int posX, int posY, PApplet app) {
		super(posX, posY, app);
		this.game1= app.loadImage("ERfondo1.png");
		this.game2= app.loadImage("ERfondo2.png");
		this.game3= app.loadImage("ERfondo3.png");
		// TODO Auto-generated constructor stub
	}
	
	void paint() {
		app.image(this.game3,0,0, 869,653);
		app.image(this.game2,0,0, 869,653);
		app.image(this.game1,0,0, 869,653);
	
		
		
	}
	
	void move() {
		super.move();
	}

}
