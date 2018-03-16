package comparator;

public class Employee {




		private Integer Id;
		private String name;
		private Integer age;
		private String address;
		public Employee(Integer id, String name, Integer age, String address) {
			super();
			Id = id;
			this.name = name;
			this.age = age;
			this.address = address;
		}
		public Integer getId() {
			return Id;
		}
		public void setId(Integer id) {
			Id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Employee [Id=" + Id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
		}

	}




