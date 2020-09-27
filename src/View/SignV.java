package View;

import processing.core.PApplet;
import processing.core.PImage;

public class SignV extends ObjectsV{
	PImage img5;
	SignV(int posX, int posY, int w, int h, PApplet app) {
		super(posX, posY, w, h, app);
		this.img5= app.loadImage("ERSenal.png");
		}
		
		void paint() {
			app.image(this.img5,this.posX,this.posY,this.w,this.h);
		}
}
