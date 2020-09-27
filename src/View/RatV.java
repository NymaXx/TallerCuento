package View;

import processing.core.PApplet;
import processing.core.PImage;

public class RatV extends ObjectsV{
	PImage img4;
	RatV(int posX, int posY, int w, int h, PApplet app) {
		super(posX, posY, w, h, app);
		this.img4= app.loadImage("ratones.png");
		}
		
		void paint() {
			app.image(this.img4,this.posX,this.posY,this.w,this.h);
		}
}
