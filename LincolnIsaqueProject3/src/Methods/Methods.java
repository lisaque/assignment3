package Methods;    //Lincoln Isaque (74584732)

	public class Methods {
		
		//THIS  GETTER AND SETTER IS TO GET THE SCANNER INPUT VALUES
		//TO APPLY TO THE TOTAL VOLUME METHOD.
		private double BoxVolume1;
		private double BoxVolume2;
		private double BoxVolume3;
		private double BoxVolume4;
		
		public void SetBoxVolume1 (double BoxVolume1) {
	    	this.BoxVolume1 = BoxVolume1;
	}
		public void SetBoxVolume2 (double BoxVolume2) {
	    	this.BoxVolume2 = BoxVolume2;
	}
		public void SetBoxVolume3 (double BoxVolume3) {
	    	this.BoxVolume3 = BoxVolume3;
	}
		public void SetBoxVolume4 (double BoxVolume4) {
	    	this.BoxVolume4 = BoxVolume4;
	    	
	}
		 public double getBoxVolume1 () {
		    return BoxVolume1;
    }
		public double getBoxVolume2 () {
		    return BoxVolume2;
	}
		public double getBoxVolume3 () {
		    return BoxVolume3;
	}
		public double getBoxVolume4 () {
		    return BoxVolume4;
	}
		
	    public double totalVolume(double item1, double item2,  double item3, double item4)  {
	    	
	    	return item1+ item2 + item3 +item4;
	    	}
		
	    public double totalWeight(double item1, double amount1, double item2, double amount2, double item3, double amount3, double item4, double amount4)  {
	    	return (item1 * amount1) + (item2 * amount2)+ (item3 * amount3)+(item4 *amount4);
	    	}
	    
	   //THIS METHOD ASSIGNS THE CONTAINERS ACCORDING TO VOLUME & WEIGHT.
		public double containerChoice (double a, double b) {
			
			if (a <= (2.59 * 2.43 * 6.06) && b <= 500) {
				System.out.println("Number of Small A containers: " + 1*(int)(Math.ceil(Math.ceil(a/(2.59 * 2.43 * 6.06))))
						+ " & the Total Cost: " + 1000 * 1*(int)(Math.ceil(Math.ceil(a/(2.59 * 2.43 * 6.06)))));
				
			} else if (a <= (2.59 * 2.43 * 6.06) && b > 500) {
				
				System.out.println("Number of Small B containers: " + 1*(int)(Math.ceil(Math.ceil(a/(2.59 * 2.43 * 6.06)))) 
						+ " & the Total Cost: " + 1200 * 1*(int)(Math.ceil(Math.ceil(a/(2.59 * 2.43 * 6.06)))) );
				}
			else if (a > (2.59 * 2.43 * 6.06))
				
				System.out.println("Number of Big containers: " + 1*(int)(Math.ceil(a/(2.59 * 2.43 * 12.01)))+
						" & Total Cost: " + (1800 * 1*(int)(Math.ceil(Math.ceil(a/(2.59 * 2.43 * 12.01))))));

				return a + b;
			}
		//THIS METHOD USES "rem" TO FIND ANY SURPLUS VOLUME THAT CAN FIT INTO A SMALL CONTAINER, FOR A CHEAPER COST.
			public double cheaperOption (double a, double b) {
				if (a > (2.59 * 2.43 * 12.01) && a % (2.59 * 2.43 * 12.01) <= (2.59 * 2.43 * 6.06) && b <= 500) {
					System.out.println("Cheaper Option! Remove 1 Big container and replace it with a Small Container A for " + 800 + "less!");				
				} else if (a > (2.59 * 2.43 * 12.01) && a %(2.59 * 2.43 * 12.01) <= (2.59 * 2.43 * 6.06) && b >= 500) {
					
					System.out.println("Cheaper Option! Remove 1 Big container and replace it with Small Container B for " + 600 + " less!");
					}
				else 
					System.out.println();
				
				
					return a + b;
			}
			
			//THIS METHOD PRINTS THE PRODUCT INFORMATION ARRAY.
			
			public void itemsMethod(String name, Double double1, Double double2, Double double3, Double double4) {
				// TODO Auto-generated method stub
				System.out.println("ITEM INFO: "+ name + " height "+ double1+ ", width "+ double2 +", length "+double3 + ", weight "+double4);

			}
		//THIS METHOD PRINTS THE USER'S ORDER SUMMARY ARRAY.
			public void itemsMethod(Integer integer, Integer integer2, Integer integer3, Integer integer4) {
				System.out.println("ORDER SUMMARY: " + integer+ " Desktops, "+ integer2 +" Laptops " + integer3 + " Mouses " + integer4 + " LCDs.");
				// TODO Auto-generated method stub
				
			}
}