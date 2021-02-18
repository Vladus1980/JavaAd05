package domain;

public class Magazine {
	
	private Integer id;
	private String magazine_name;
	private Integer magazine_pages;
	private Double magazine_price;
	
	public Magazine(Integer id, String magazine_name, Integer magazine_pages, Double magazine_price) {
		
		this.id = id;
		this.magazine_name = magazine_name;
		this.magazine_pages = magazine_pages;
		this.magazine_price = magazine_price;
	}

	public Magazine(String magazine_name, Integer magazine_pages, Double magazine_price) {
		
		this.magazine_name = magazine_name;
		this.magazine_pages = magazine_pages;
		this.magazine_price = magazine_price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMagazine_name() {
		return magazine_name;
	}

	public void setMagazine_name(String magazine_name) {
		this.magazine_name = magazine_name;
	}

	public int getMagazine_pages() {
		return magazine_pages;
	}

	public void setMagazine_pages(int magazine_pages) {
		this.magazine_pages = magazine_pages;
	}

	public double getMagazine_price() {
		return magazine_price;
	}

	public void setMagazine_price(double magazine_price) {
		this.magazine_price = magazine_price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((magazine_name == null) ? 0 : magazine_name.hashCode());
		result = prime * result + magazine_pages;
		long temp;
		temp = Double.doubleToLongBits(magazine_price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Magazine other = (Magazine) obj;
		if (id != other.id)
			return false;
		if (magazine_name == null) {
			if (other.magazine_name != null)
				return false;
		} else if (!magazine_name.equals(other.magazine_name))
			return false;
		if (magazine_pages != other.magazine_pages)
			return false;
		if (Double.doubleToLongBits(magazine_price) != Double.doubleToLongBits(other.magazine_price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Magazine [id=" + id + ", magazine_name=" + magazine_name + ", magazine_pages=" + magazine_pages
				+ ", magazine_price=" + magazine_price + "]";
	}
	
	

}
