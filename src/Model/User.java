package Model;



import processing.core.PApplet;

public class User extends PApplet {
	String Name;
	PApplet app;

	String s1= "flautista";
	String s2= "alcaldee";
	String s3= "ninoss";
	String s4= "Hamelinn";
	String s5= "ratones";
	
	Boolean rep1, rep2, rep3, rep4, rep5;
	
	String[] line;	
	 String[] part;
	public User(String Name, PApplet app){
		this.Name= Name;
		this.line= app.loadStrings("FlautistaHamelin.txt");
		this.rep1=false;
		this.rep2=false;
		this.rep3=false;
		this.rep4=false;
		this.rep5=false;
	}
	
	public void createArrayList() {
		
		for(int i =0;i<line.length; i++ ) {
			String ham= line[i];
			part= ham.split(" ");
			
		}
		for(int o=0; o<part.length; o++) {
			if(part[o].equals(s1)==true ) {
				this.rep1=true;
			}
			if( part[o].equals(s2)==true ) {
				this.rep2=true;
			}
			if(part[o].equals(s3)==true) {
				this.rep3=true;
			}
			if(part[o].equals(s4)==true) {
				this.rep4=true;
			}
			if(part[o].equals(s5)==true) {
				this.rep5=true;
			}
			System.out.println(part[o]);
		}
	}
	
	public void changeWords() {
		if(this.rep1==true) {
			for(int i=0; i<part.length; i++) {
			part[176] = part[176].replace("Hamelinn", "HAMELINN");
		}
		
	}
		if(this.rep2==true) {
			for(int i=0; i<part.length; i++) {
			part[135] = part[135].replace("Hamelinn", "HAMELINN");
		}
		
	}
		if(this.rep3==true) {
			for(int i=0; i<part.length; i++) {
			part[363] = part[363].replace("Hamelinn", "HAMELINN");
		}
		
	}
		if(this.rep4==true) {
			for(int i=0; i<part.length; i++) {
			part[10] = part[10].replace("Hamelinn", "HAMELINN");
		}
		
	}
		if(this.rep5==true) {
			for(int i=0; i<part.length; i++) {
			part[253] = part[253].replace("Hamelinn", "HAMELINN");
		}
		
	}
}
}
