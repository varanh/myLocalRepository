
public class NewDummy {

		private int age;
		private String name = "Mr.Dummy";
		
		public NewDummy(int Age, String fullName) {
				this.age = Age;
				this.name = fullName;
		}		
		
		public String getName(){
			return this.name;
		}
		
		public int getAge(){
			return this.age;
		}
}
