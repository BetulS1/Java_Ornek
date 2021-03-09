package nyp_odev_118050561_Betul_Sar�teke;

import java.util.List;

public class Ogrenci extends Kisi {

	private int ogrenciNo;
	private int mezuniyetKredisi;
	private List <Ders> ders; 
	
	public Ogrenci() {
		// TODO Auto-generated constructor stub
	}
	
	public String Mezuniyet_Durumu() {
		if(mezuniyetKredisi >= 240)
			return "Mezun Olabilir";
		else
			return "Mezun Olamaz";
	} //mezun olmak i�in gereken toplam mezuniyet kredisi miktari lisans b�l�mleri i�in 240 kredi olmal�d�r.

	public int getOgrenciNo() {
		return ogrenciNo;
	}

	public void setOgrenciNo(int ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}

	public int getMezuniyetKredisi() {
		return mezuniyetKredisi;
	}

	public void setMezuniyetKredisi(int mezuniyetKredisi) {
		this.mezuniyetKredisi = mezuniyetKredisi;
	}

	public List <Ders> getDers() {
		return ders;
	}

	public void setDers(List <Ders> ders) {
		this.ders = ders;
	}
}
