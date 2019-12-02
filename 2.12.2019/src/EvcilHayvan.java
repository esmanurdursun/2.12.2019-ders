
public class EvcilHayvan extends MainClass {
	public EvcilHayvan(String isim){
		this.isim=isim;
		System.out.println(isim + "oyun oynuyor");
	}

	private String isim;
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	String oyna(){
		return this.isim + "oynamaktan yoruldu";
	}
}
