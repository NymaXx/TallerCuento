package View;

import processing.core.PApplet;
import processing.core.PImage;

public class ChildrenV extends ObjectsV {

	PImage img1;
	ChildrenV(int posX, int posY, int w, int h, PApplet app) {
		super(posX, posY, w, h, app);
		this.img1= app.loadImage("ninos.png");
	}
	
	void paint() {
		app.image(this.img1,this.posX,this.posY,this.w,this.h);
	}
	
	

	
}
