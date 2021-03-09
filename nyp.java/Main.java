package nyp_odev_118050561_Betul_Sarýteke;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
 
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ParseException {
		
		Ogretim_Gorevlisi gorevli1 = new Ogretim_Gorevlisi();
		
		gorevli1.setIsim("Gorevliismi");
		gorevli1.setSoyisim("gorevlisoyisimi");
		gorevli1.setTcNo(123456789);
		gorevli1.setTelNo("05555555555");
		gorevli1.setEmail("gorevli1@gmail.com");
		gorevli1.setCinsiyet("erkek");
		
		String tarih = "MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(tarih);
		Date dogumtarihi = simpleDateFormat.parse("11-20-1999");
		gorevli1.setDogumtarihi(dogumtarihi);
		
		Ders ders1 = new Ders();
		ders1.setAd("Nesne YP");
		ders1.setKredi(5);
		Ders ders2 = new Ders();
		ders2.setAd("Yapay Zeka");
		ders2.setKredi(2);
		List <Ders> dersler = new ArrayList<Ders>();
		dersler.add(ders1);
		dersler.add(ders2);
		gorevli1.setDers(dersler);
		
		gorevli1.Kimlik_Bilgisi_Yazdir();
		for(Ders ders:dersler)
		{
			System.out.println("Ders: "+ders.getAd()+" Kredisi: "+ders.getKredi());
		}	
		
		
	}

}
