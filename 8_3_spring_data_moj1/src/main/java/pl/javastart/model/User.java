package pl.javastart.model;

import javax.persistence.*;

@Entity
public class User {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	private String gracz;
	private String email;
	private int nr_gry;
	private int nr_gry2;
	
	public User(String gracz, String email) {
		this.gracz = gracz;
		this.email = email;
	}
	
	
	
	public User(String gracz, String email, int nr_gry) {
		this.gracz = gracz;
		this.email = email;
		this.nr_gry = nr_gry;
	}



	public User() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGracz() {
		return gracz;
	}

	public void setGracz(String gracz) {
		this.gracz = gracz;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNr_gry() {
		return nr_gry;
	}

	public void setNr_gry(int nr_gry) {
		this.nr_gry = nr_gry;
	}

	public int getNr_gry2() {
		return nr_gry2;
	}

	public void setNr_gry2(int nr_gry2) {
		this.nr_gry2 = nr_gry2;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", gracz=" + gracz + ", email=" + email + ", nr_gry=" + nr_gry + ", nr_gry2="
				+ nr_gry2 + "]";
	}
	
	
	
	
	
	

}
