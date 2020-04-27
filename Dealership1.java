package programmingtask03;
import java.util.Scanner;
public class Dealership1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int z; //stores array 
		String x;//vehicle make
		String v;//vehicle model
		int u;// stores model year
		int h;// stores purposes
		int se; //stores seating capacity
		int cha;
		String pr;
		String tr;
		double we;
		
		Scanner vehicle = new Scanner(System.in); //initializes input
		System.out.println("enter the numebr of cars;");
		z = vehicle.nextInt();
		
		CAR[] mycar = new CAR [z]; 
		for(int i = 0; i<mycar.length; i++) {//loop for array
			System.out.println("ENter Make\n");
			x = vehicle.next();
			System.out.println("Enter car model \n");
			v = vehicle.next();
			System.out.println("Enter model Year \n");
			u= vehicle.nextInt();
			System.out.println("Enter car horsepower 0-1000 \n");
			h= vehicle.nextInt();
			while(h>1000) {//checks if user inputs more than 1000
				System.out.println("Invalid input, re-enter horsepower");
				h= vehicle.nextInt();				
			}
			System.out.println("Enter seat Capacity 2-8");
			se= vehicle.nextInt();
			while(se>8) {
				System.out.println("Seat capacity invalid, look at instructions");
				se= vehicle.nextInt();
			}
			System.out.println("Enter car Chassis no. 8 digits \n");
		    cha= vehicle.nextInt();
		    
		    mycar[i]= new CAR (h,v,cha,x,u,se);  //saves user data in the array car
		    
		    	}
		
		for(int i=0;i<mycar.length;i++) {  //prints details of vehicle
			mycar[i].printDetails();
		}
System.out.println("\nPlease enter how many Trucks need new licenses");
		
		z= vehicle.nextInt();
		
		Truck[] mytruck= new Truck[z];
		
		for(int i=0; i<mytruck.length;i++) {
			
			System.out.println("Enter make of Truck \n");
		    x= vehicle.next();
		    
		    System.out.println("Enter Truck model \n");
		    v= vehicle.next();
		    
		    System.out.println("Enter model year \n");
		    u= vehicle.nextInt();
		    
		    System.out.println("Truck weight 0-50 tons \n");
		    we= vehicle.nextDouble();
		    while(we>50) {
		    	System.out.println("Weight invalid!, re enter weight");
		    	we= vehicle.nextDouble();
		    }
		    
		    System.out.println("Enter Trucks purpose,(cargo, hazardousmaterial, fuel) \n");
		    pr= vehicle.next();
		    
		    System.out.println("Does your truck have a trailer: true or false? \n");
		    tr= vehicle.next();
		    
		    System.out.println("Enter truck Chassis no. 8 digits \n");
		    cha= vehicle.nextInt();
			
		   mytruck[i]= new Truck(cha,x,u,v,we,pr,tr);   
		 
		}
		
		for(int i=0; i<mytruck.length;i++) {
			mytruck[i].printDetails();
		}
		
		
		System.out.println("\nPlease enter how many motorcycles need new licenses ");
		
		z= vehicle.nextInt();
	
	
Motorcycle[] mycycle= new Motorcycle[z];
		
		for(int i=0;i<mycycle.length;i++) {
			
			System.out.println("Enter make of Motorcycle \n");
		    x= vehicle.next();
		    
		    System.out.println("Enter Motorcycle model \n");
		    v= vehicle.next();
		    
		    System.out.println("Enter model year \n");
		    u= vehicle.nextInt();
			
		    System.out.println("Enter Motorcycle Chassis no. 8 digits \n");
		    cha= vehicle.nextInt();
		    
		    System.out.println("Motorcycle engine capacity 0-1500 \n");
		    h= vehicle.nextInt();
		    while(h>1500) {
		    	System.out.println("Engine cap invalid!, re enter engine cap");
		    	h= vehicle.nextInt();
		    }
		    
		    System.out.println("Enter motorcycle type( racing, cruiser, off-road) \n");
		    pr= vehicle.next();
		    
		     mycycle[i]= new Motorcycle(cha,x,u,v,h,pr);
		     
		}
		
		for(int i=0; i<mycycle.length;i++) {
			mycycle[i].printDetails();
		}
		}
		
		
	}
	

}
