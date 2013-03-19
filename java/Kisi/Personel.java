
public class Personel extends Kisi {

	private int SicilNo;
	private String Birim;
	
	public int getSicilNo() {
		return SicilNo;
	}
	public void setSicilNo(int sicilNo) {
		SicilNo = sicilNo;
	}
	public String getBirim() {
		return Birim;
	}
	public void setBirim(String birim) {
		Birim = birim;
	}
	
	public Personel() {
		
	}
	public Personel(int tcNo, String ad, String soyad, int dtarihi, int sicilNo,
			String birim) {
		super(tcNo, ad, soyad, dtarihi);
		SicilNo = sicilNo;
		Birim = birim;
	}
	
	public void EvrakGetir() {
		System.out.println("Evrak getiriliyor...");
	}
	public void EvrakGötür() {
		System.out.println("Evrak Götürülüyor...");
	}
	
}
