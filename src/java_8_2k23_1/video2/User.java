package java_8_2k23_1.video2;

public class User {

	private long id;
	private String name;
	private String email;

	public User(long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

}
