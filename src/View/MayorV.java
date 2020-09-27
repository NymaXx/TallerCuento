package View;

import processing.core.PApplet;
import processing.core.PImage;

public class MayorV extends ObjectsV{

	PImage img3;
	MayorV(int posX, int posY, int w, int h, PApplet app) {
		super(posX, posY, w, h, app);
		this.img3= app.loadImage("alcalde1.png");
		}
		
		void paint() {
			app.image(this.img3,this.posX,this.posY,this.w,this.h);
		}
	

}
