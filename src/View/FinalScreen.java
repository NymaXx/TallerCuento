package View;

import processing.core.PApplet;

public class FinalScreen extends Screen {

	
	FinalScreen(int posX, int posY, PApplet app) {
		super(posX, posY, app);
		// TODO Auto-generated constructor stub
	}

	void paint() {
		app.fill(0);
		app.textSize(80);
		app.text("FIN", app.width/3, app.height/2);
	}
	
	void move() {
		super.move();
	}
}
