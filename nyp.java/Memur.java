package nyp_odev_118050561_Betul_Sarýteke;

public class Memur extends Calisan {

	private String calistigiBirim; 

	@Override
	public int Maas_Hesapla() {
		int sabit = super.Maas_Hesapla();
		return sabit+2000;
	} 
 
	public String getCalistigiBirim() {
		return calistigiBirim;
	}

	public void setCalistigiBirim(String calistigiBirim) {
		this.calistigiBirim = calistigiBirim;
	}

}
