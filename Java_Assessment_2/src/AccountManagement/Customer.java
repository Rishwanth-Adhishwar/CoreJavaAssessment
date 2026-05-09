package AccountManagement;

class Customer {// customer class

	// private fields
	private int id;
	private String name;
	private char gender;

	public Customer(int id, String name, char gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
}
