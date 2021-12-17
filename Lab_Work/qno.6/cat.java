class Cat extends Animal{
		Cat(String type){
			super();
			this.type = type;
			System.out.println("Cat is a "+type+" animal");
		}
		
		public static void main(String[] args){
			Cat c1 = new Dog("Domestic");
			c1.breaths();
		}
}
