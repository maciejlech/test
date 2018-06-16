package pl.javastart.model;

import javax.persistence.*;

@Entity
public class Gra {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private long id;
	
	private int nr_gry;
	private String siedziba;
	private String oddzialy;
	
	private int zloto;
	private int mana;
	
	private String czary;
	private int tura;
	
	public Gra() {
	}

	public Gra(int nr_gry, String siedziba, int zloto ) {
		this.nr_gry = nr_gry;
		this.siedziba = siedziba;
		this.oddzialy = "Brak";
		this.zloto = zloto;
		this.mana = 0;
		this.tura = 1;
		this.czary = "Brak dostępnych";
		
	}




	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNr_gry() {
		return nr_gry;
	}

	public void setNr_gry(int nr_gry) {
		this.nr_gry = nr_gry;
	}

	public String getSiedziba() {
		return siedziba;
	}

	public void setSiedziba(String siedziba) {
		this.siedziba = siedziba;
	}

	public String getOddzialy() {
		return oddzialy;
	}

	public void setOddzialy(String oddzialy) {
		this.oddzialy = oddzialy;
	}

	public int getZloto() {
		return zloto;
	}

	public void setZloto(int zloto) {
		this.zloto = zloto;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public String getCzary() {
		return czary;
	}

	public void setCzary(String czary) {
		this.czary = czary;
	}

	public int getTura() {
		return tura;
	}

	public void setTura(int tura) {
		this.tura = tura;
	}

	@Override
	public String toString() {
		return "Gra [id=" + id + ", nr_gry=" + nr_gry + ", siedziba=" + siedziba + ", oddzialy=" + oddzialy + ", zloto="
				+ zloto + ", mana=" + mana + ", czary=" + czary + ", tura=" + tura + "]";
	}
	
	
	
	

}
