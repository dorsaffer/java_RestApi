package entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Evenement {
	private int id;
	private String date;
	private String lieu;
	private int capacite;
	private String entreprise;
	private boolean menu;
	
	@XmlAttribute
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	public String getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}
	public boolean isMenu() {
		return menu;
	}
	public void setMenu(boolean menu) {
		this.menu = menu;
	}
	public Evenement(int id, String date, String lieu, int capacite, String entreprise, boolean menu) {
		super();
		this.id = id;
		this.date = date;
		this.lieu = lieu;
		this.capacite = capacite;
		this.entreprise = entreprise;
		this.menu = menu;
	}
	public Evenement() {
		super();
		// TODO Auto-generated constructor stub
	}

}
