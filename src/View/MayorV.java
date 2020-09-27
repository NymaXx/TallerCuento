package View;

import processing.core.PApplet;
import processing.core.PImage;

public class MayorV extends ObjectsV{

	PImage img3, img31;
	Boolean paint1, paint2;
	MayorV(int posX, int posY, int w, int h, PApplet app) {
		super(posX, posY, w, h, app);
		this.img3= app.loadImage("alcalde1.png");
		this.img31= app.loadImage("alcalde2.png");
		this.paint1=true;
		this.paint2=false;
		}
		
		void paint() {
			if(this.paint1==true) {
			app.image(this.img3,this.posX,this.posY,this.w,this.h);
			this.paint2=false;
			}
			
			if(this.paint2==true) {
				this.paint1=false;
				app.image(this.img31,this.posX,this.posY,this.w,this.h);
			}
		}
		
		void advice() {
			if(dist(this.posX+50, this.posY+170, app.mouseX, app.mouseY)<=120) {
				app.cursor(HAND);
					}else {
						app.cursor(ARROW);
			}
			
		}
	
		void interact() {
			if(dist(this.posX+50, this.posY+170, app.mouseX, app.mouseY)<=120) {
				app.cursor(HAND);
				this.paint1 =false;
				this.paint2 =true;
			}else {
				app.cursor(ARROW);
			}
		}

}
