package domain;

public class User {
	
	private Integer id;
	private String user_firstname;
	private String user_lastname;
	private String user_email;
	private String user_pass;
	private String user_level;
	
	
	public User(Integer id, String user_firstname, String user_lastname, String user_email,
			String user_pass, String user_level) {
		
		this.id = id;
		this.user_firstname = user_firstname;
		this.user_lastname = user_lastname;
		this.user_email = user_email;
		this.user_pass = user_pass;
		this.user_level = user_level;
	}


	public User(String user_firstname, String user_lastname, String user_email, String user_pass, String user_level) {
		
		this.user_firstname = user_firstname;
		this.user_lastname = user_lastname;
		this.user_email = user_email;
		this.user_pass = user_pass;
		this.user_level = user_level;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUser_firstname() {
		return user_firstname;
	}


	public void setUser_firstname(String user_firstname) {
		this.user_firstname = user_firstname;
	}


	public String getUser_lastname() {
		return user_lastname;
	}


	public void setUser_lastname(String user_lastname) {
		this.user_lastname = user_lastname;
	}


	public String getUser_email() {
		return user_email;
	}


	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}


	public String getUser_pass() {
		return user_pass;
	}


	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}


	public String getUser_level() {
		return user_level;
	}


	public void setUser_level(String user_level) {
		this.user_level = user_level;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((user_email == null) ? 0 : user_email.hashCode());
		result = prime * result + ((user_firstname == null) ? 0 : user_firstname.hashCode());
		result = prime * result + ((user_lastname == null) ? 0 : user_lastname.hashCode());
		result = prime * result + ((user_level == null) ? 0 : user_level.hashCode());
		result = prime * result + ((user_pass == null) ? 0 : user_pass.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		if (user_email == null) {
			if (other.user_email != null)
				return false;
		} else if (!user_email.equals(other.user_email))
			return false;
		if (user_firstname == null) {
			if (other.user_firstname != null)
				return false;
		} else if (!user_firstname.equals(other.user_firstname))
			return false;
		if (user_lastname == null) {
			if (other.user_lastname != null)
				return false;
		} else if (!user_lastname.equals(other.user_lastname))
			return false;
		if (user_level == null) {
			if (other.user_level != null)
				return false;
		} else if (!user_level.equals(other.user_level))
			return false;
		if (user_pass == null) {
			if (other.user_pass != null)
				return false;
		} else if (!user_pass.equals(other.user_pass))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", user_firstname=" + user_firstname + ", user_lastname=" + user_lastname
				+ ", user_email=" + user_email + ", user_pass=" + user_pass + ", user_level=" + user_level + "]";
	}
	
	
	

}
