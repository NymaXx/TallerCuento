package View;

import Model.User;
import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	User user;
	
	public void settings() {
		size(869,653);
	}
	
	public void setup() {
		user = new User("Mija", this);
	
		
		user.createArrayList();
		
			
	}
	
	public void draw() {
		background(0);
		
	}
	
}
