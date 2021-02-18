package domain;

import java.util.Date;

public class Subscription {
	
	private Integer id;
	private Integer magazine_id;
	private Integer user_id;
	private Date purchasedate;
	
	public Subscription(Integer id, Integer magazine_id, Integer user_id, Date purchasedate) {
		
		this.id = id;
		this.magazine_id = magazine_id;
		this.user_id = user_id;
		this.purchasedate = purchasedate;
	}

	public Subscription(Integer magazine_id, Integer user_id, Date purchasedate) {
		
		this.magazine_id = magazine_id;
		this.user_id = user_id;
		this.purchasedate = purchasedate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMagazine_id() {
		return magazine_id;
	}

	public void setMagazine_id(Integer magazine_id) {
		this.magazine_id = magazine_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Date getPurchasedate() {
		return purchasedate;
	}

	public void setPurchasedate(Date purchasedate) {
		this.purchasedate = purchasedate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((magazine_id == null) ? 0 : magazine_id.hashCode());
		result = prime * result + ((purchasedate == null) ? 0 : purchasedate.hashCode());
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
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
		Subscription other = (Subscription) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (magazine_id == null) {
			if (other.magazine_id != null)
				return false;
		} else if (!magazine_id.equals(other.magazine_id))
			return false;
		if (purchasedate == null) {
			if (other.purchasedate != null)
				return false;
		} else if (!purchasedate.equals(other.purchasedate))
			return false;
		if (user_id == null) {
			if (other.user_id != null)
				return false;
		} else if (!user_id.equals(other.user_id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Subscription [id=" + id + ", magazine_id=" + magazine_id + ", user_id=" + user_id + ", purchasedate="
				+ purchasedate + "]";
	}
	
	

}
