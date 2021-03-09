package nyp_odev_118050561_Betul_Sarýteke;

import java.util.Date;

public class Kisi implements Gozlemlenebilir {
	private String isim; 
	private String soyisim;
	private String cinsiyet;
	private int tcNo;
	private String telNo;
	private String email;
	private Date dogumtarihi;
	
	@Override
	public void Kimlik_Bilgisi_Yazdir() {
		System.out.println("Ýsim: "+ this.isim);
		System.out.println("Soyisim: "+this.soyisim);
		System.out.println("Cinsiyet: "+this.cinsiyet);
		System.out.println("TC No:"+this.tcNo);
		System.out.println("Telefon No: "+this.telNo);
		System.out.println("E-Mail: "+this.email);
		System.out.println("Doðum Tarihi: "+this.dogumtarihi);
		
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public int getTcNo() {
		return tcNo;
	}

	public void setTcNo(int tcNo) {
		this.tcNo = tcNo;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDogumtarihi() {
		return dogumtarihi;
	}

	public void setDogumtarihi(Date dogumtarihi) {
		this.dogumtarihi = dogumtarihi;
	}

}
