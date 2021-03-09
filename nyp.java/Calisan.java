package nyp_odev_118050561_Betul_Sarýteke;

public class Calisan extends Kisi {

	private int sicilNo;
	private int derece; 
	
	
	public Calisan() {
		// TODO Auto-generated constructor stub
	}

	public int Maas_Hesapla() {
		return 3000;
	} /* tüm çalýþanlarýn alacaðý min. maaþ miktarý döndürüyoruz */

	public int getSicilNo() {
		return sicilNo;
	}


	public void setSicilNo(int sicilNo) {
		this.sicilNo = sicilNo;
	}


	public int getDerece() {
		return derece;
	}


	public void setDerece(int derece) {
		this.derece = derece;
	}

}
