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
	
	void advice() {
		if(dist(this.posX+70, this.posY+200, app.mouseX, app.mouseY)<=200) {
			app.cursor(HAND);
				}else {
					app.cursor(ARROW);
		}
		
	}
	
	void interact() {
		if(dist(this.posX+70, this.posY+200, app.mouseX, app.mouseY)<=200) {
			
			this.posX= app.mouseX;
			this.posY= app.mouseY;		
	}
	}
}
