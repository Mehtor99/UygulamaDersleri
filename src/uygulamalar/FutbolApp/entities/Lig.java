package uygulamalar.FutbolApp.entities;

import java.util.List;

public class Lig extends BaseEntity {
	static int ligCount=0;
	
	private String ligIsmi;
	
	public Lig(String ligIsmi) {
		this.ligIsmi = ligIsmi;
		this.id = ++ligCount;
	}
	
	public String getLigIsmi() {
		return ligIsmi;
	}
	
	public void setLigIsmi(String ligIsmi) {
		this.ligIsmi = ligIsmi;
	}
	
	@Override
	public String toString() {
		return "Lig{" + "ligIsmi='" + getLigIsmi() + '\'' + ", id=" + getId() + '}';
	}
}