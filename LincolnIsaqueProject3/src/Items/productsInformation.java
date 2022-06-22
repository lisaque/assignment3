package Items;    //Lincoln Isaque (74584732)

abstract class boxInformation {

		private int boxType;
		private double weight;
		private double height;
		private double length;
		private double width;
		private double radius;
		private double apothem;
		
		public boxInformation(int boxType, double height, double weight, double length, double width, double radius, double apothem) {
		this.boxType = boxType;
		this.height = height;
		this.weight = weight;
		this.length = length;
		this.width = width; 
		this.radius = radius;
		this.apothem = apothem;
		}
		public void setBoxType() {
			this.boxType = boxType;
		}
		public void setHt() {
			this.height = height;
		}
		public void setWt() {
			this.weight = weight;
		}
		public double getBoxType() {
			return boxType;
		}
		public double getHt() {
			return height;
		}
		public double getWt() {
			return weight;
		}
					
		
		
}	

   
