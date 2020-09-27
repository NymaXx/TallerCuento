package View;

import processing.core.PApplet;
import processing.core.PImage;

public class ChildrenV extends ObjectsV {

	PImage img1;
	int opac;
	
	ChildrenV(int posX, int posY, int w, int h, PApplet app) {
		super(posX, posY, w, h, app);
		this.opac=5;
		this.img1= app.loadImage("ninos.png");
		
	}
	
	void paint() {
		
		app.tint(255);
		app.image(this.img1,this.posX,this.posY,this.w,this.h);
	}
	
	
	void interact() {
		if (Main.gameS.getPosX() <= -188 && dist(this.posX,
				this.posY, app.mouseX, app.mouseY)<=200) {
			this.posX+=5;
			
		}
	}
	
}
