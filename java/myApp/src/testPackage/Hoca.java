package testPackage;

public class Hoca extends Kisi {

		private int SicilNo;
		private String Bolum;

		public int getSicilNo() {
			return SicilNo;
		}
		public void setSicilNo(int sicilNo) {
			SicilNo = sicilNo;
		}
		public String getBolum() {
			return Bolum;
		}
		public void setBolum(String bolum) {
			Bolum = bolum;
		}

		public Hoca() {

		}
		public Hoca(int tcNo, String ad, String soyad, int dtarihi,
				int sicilNo, String bolum) {
		    super(tcNo, ad, soyad, dtarihi);
			SicilNo = sicilNo;
			Bolum = bolum;
		}

		public String DerseGir() {
			return "Dersteyiz.";
		}
		public String SinavYap() {
			return "Sınavdayız.";
		}

	}
