package nyp_odev_118050561_Betul_Sarıteke;

import java.util.List;

public class Ogretim_Gorevlisi extends Calisan {

	private String unvan; 
	private List <Ders> ders;
	
	@Override
	public int Maas_Hesapla() {
		int sabit= super.Maas_Hesapla(); 
		return sabit+1500;
	} 

	
	public Ogretim_Gorevlisi() {
		// TODO Auto-generated constructor stub
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}


	public List <Ders> getDers() {
		return ders;
	}


	public void setDers(List <Ders> ders) {
		this.ders = ders;
	}


	
}
