package View;

import processing.core.PApplet;
import processing.core.PImage;

public class StartScreen extends Screen{
PImage start;
	StartScreen(int posX, int posY, PApplet app) {
		super(posX, posY, app);
		this.start= app.loadImage("ERstart.png");
		// TODO Auto-generated constructor stub
	}
	
	void paint() {
		app.image(this.start,this.posX,this.posY, app.width, app.height);
	}
	
	void change() { //249 359     291   392
		if(app.mouseX > 249 && app.mouseX < 359 && app.mouseY > 291 && app.mouseY < 392) {
			Main.screen=1;
		}
	}

}
