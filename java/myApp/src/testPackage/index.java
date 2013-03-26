package testPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Servlet implementation class index
 */
@WebServlet("/index")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");

		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html><html><head>" +
				"<style>" +
				"body { background: #c1c2c3; }" +
				"div { width: 500px; margin: 20px auto; padding: 10px 30px; border: 1px solid #q1q1q1; background: white;}" +
				"</style>" +
				"</head><body>");

/* Öğrenci Sınıfı  */
		Ogrenci ogr = new Ogrenci(10060285, "Aydın", "Doyak", 1991, 14, 04, "Bil-Muh", "Samsun");
		out.println("<div> Öğrenci");
		out.println("<ul>");
		out.println(
				"<li>Öğrenci No : " + ogr.getOgrNo() + "</li>" +
				"<li>Sınıf : " + ogr.getSinif() + "</li>" +
				"<li>Bölüm : " + ogr.getBolum() + "</li>" +
				"<li>Memleket : " + ogr.getMemleket() + "</li></ul>"
			   );
		out.println(
				ogr.DerseGir() + "</br>" +
				ogr.KantineGit()
			   );
		out.println("</div>");

/* Personel Sınıfı  */
		Personel mmr = new Personel(123123123, "Ahmet", "Çebi", 1966, 271712123, "Öğrenci İşleri");
		out.println("<div> Memur");
		out.println("<ul>");
		out.println(
				"<li> TC : " + mmr.getTcNo() + "</li>" +
				"<li> Ad : " + mmr.getAd() + "</li>" +
				"<li> Soyad : " + mmr.getSoyad() + "</li>" +
				"<li> Doğum Tarihi : " + mmr.getDtarihi() + "</li>" +
				"<li> Sicil No : " + mmr.getSicilNo() + "</li>" +
				"<li> Birim : " + mmr.getBirim() + "</li></ul>"
			   );

		out.println(
				mmr.EvrakGetir() + "</br>" +
				mmr.EvrakGotur()
			   );
		out.println("</div>");

/* Hoca Sınıfı */
		Hoca ort = new Hoca(321321321, "Kadir", "Çöpdemir", 1967, 112112123, "Kimya");
		out.println("<div> Öğretmen");
		out.println("<ul>");
		out.println(
				"<li> TC : " + ort.getTcNo() + "</li>" +
				"<li> Ad : " + ort.getAd() + "</li>" +
				"<li> Soyad : " + ort.getSoyad() + "</li>" +
				"<li> Doğum Tarihi : " + ort.getDtarihi() + "</li>" +
				"<li> Sicil No : " + ort.getSicilNo() + "</li>" +
				"<li> Bölüm : " + ort.getBolum() + "</li></ul>"
			   );

		out.println(
				ort.SinavYap() + "</br>" +
				ort.DerseGir()
			   );
		out.println("</div>");

/* Öğretim Üyesi Sınıfı  */
		OgretimUyesi ogr_uye = new OgretimUyesi(900123123, "Kemal", "Balaş", 1977, 929292, "Elektronik", "Doçent");
		out.println("<div> Öğretim Üyesi");
		out.println("<ul>");
		out.println(
				"<li> TC : " + ogr_uye.getTcNo() + "</li>" +
				"<li> Ad : " + ogr_uye.getAd() + "</li>" +
				"<li> Soyad : " + ogr_uye.getSoyad() + "</li>" +
				"<li> Doğum Tarihi : " + ogr_uye.getDtarihi() + "</li>" +
				"<li> Sicil No : " + ogr_uye.getSicilNo() + "</li>" +
				"<li> Bölüm : " + ogr_uye.getBolum() + "</li>" +
				"<li> Ünvan : " + ogr_uye.getUnvan() + "</li></ul>"
			   );
		out.println("</div>");
		out.println("</html></body>");
	}
		


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
