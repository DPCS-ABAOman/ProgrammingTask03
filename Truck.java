package programmingtask03;
//inheritance
public class Truck extends Dealership2 {

	double weight; //Attributes
	String purpose;
	String trailer;
	public Truck(int c, String m, int y, String mo, double w, String p, String t) {
		super(c, m, y, mo); // inherites superclass constructer
		
		this.weight = w;
		this.purpose=p;
		this.trailer =t;
	}
	
	public void Hazard() {
		if(this.purpose.equals("hazardous material")) {
		System.out.println("Inspection needed. Truck has hazardous material");
		System.out.println("Trailer inbuilt: \n" + this.trailer);
		
		}
	}

}
