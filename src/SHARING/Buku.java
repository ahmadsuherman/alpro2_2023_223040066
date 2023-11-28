package SHARING;

public class Buku {
	
	/*	
	 * Didalam record field tidak boleh langsung diakses.
	 * Input nilai dan tampil nilai dari field harus dilakukan melalui method (prosedur/fungsi)
	 * 
	 */
	String sJudul;
	String sPenulis;
	String sPenerbit;
	int iHarga;
	
	public void inputNilai(String sJudul, String sPenulis, String sPenerbit, int iHarga) {
		this.sJudul 		= sJudul;
		this.sPenulis 		= sPenulis;
		this.sPenerbit 		= sPenerbit;
		this.iHarga 		= iHarga;
	}
	
	public void tampilNilai() {
		System.out.println("Judul: " + sJudul);
		System.out.println("Penulis: " + sPenulis);
		System.out.println("Penerbit: " + sPenerbit);
		System.out.println("Harga: " + iHarga);
	}
	
	public String getJudul() {
		return sJudul;
	}
}
