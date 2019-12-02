
public class MainClass {
	
	public static void main(String[]args){
		
    Kedi kedi=new Kedi("Tekir");
    Balýk balik=new Balýk("Jaws");
    
    //String output =balik.oyna();
    //System.out.println(output);
    System.out.println(kedi.getIsim()+"oyun oynuyor");
    System.out.println(balik.oyna());
	}
}
