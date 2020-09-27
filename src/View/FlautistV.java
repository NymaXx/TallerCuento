package View;

import processing.core.PApplet;
import processing.core.PImage;

public class FlautistV extends ObjectsV{
	
	PImage img2;
	FlautistV(int posX, int posY, int w, int h, PApplet app) {
		super(posX, posY, w, h, app);
		this.img2= app.loadImage("falutista.png");
	}
	
	void paint() {
		app.image(this.img2,this.posX,this.posY,this.w,this.h);
	}
}
