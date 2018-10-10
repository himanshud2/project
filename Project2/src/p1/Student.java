package p1;

public class Student {

	private String name;
	private String id;
	private int age;
	private String password;
	
	public Student() {
		super();
	}

	public Student(String name, String id, int age, String password) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + ", password=" + password + "]";
	}

}
