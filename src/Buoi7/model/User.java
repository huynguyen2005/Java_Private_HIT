package Buoi7.model;

public class User {
	private String id;
	private String fullname;
	private String username;
	private String password;
	private Role role;
	
	public User(String id, String fullname, String username, String password, Role role) {
		this.id = id;
		this.fullname = fullname;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	
	public User() {
		
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "User"
				+ "\n id= " + id 
				+ "\n fullname= " + fullname 
				+ "\n username= " + username
				+ "\n role= " + role ;
	}
	
	public void xuat() {
		System.out.println(toString());
	}
}
