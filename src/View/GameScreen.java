package View;

import processing.core.PApplet;
import processing.core.PImage;

public class GameScreen extends Screen {

		PImage game1, game2, game3;
	GameScreen(int posX, int posY, PApplet app) {
		super(posX, posY, app);
		this.game1= app.loadImage("ERfondo1.png");
		this.game2= app.loadImage("ERfondo2.png");
		this.game3= app.loadImage("ERfondo3.png");
		// TODO Auto-generated constructor stub
	}
	
	void paint() {
		app.image(this.game1,this.posX,this.posY, app.width, app.height);
		app.image(this.game2,this.posX,this.posY, app.width, app.height);
		app.image(this.game3,this.posX,this.posY, app.width, app.height);
		
	}
	
	void move() {
		super.move();
	}

}
