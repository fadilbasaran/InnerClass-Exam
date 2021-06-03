
import java.util.Scanner;



public class Main {
    
    //Basit Matematik ve Fizik Problemleri
    //Daire Alan-Matematik
    //Üçgen Çevresi-Matematik
    //3 Boyutlu Vöktörlerin İç Çarpımı-Fizik
    
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Matematik ve Fizik Problemleri Programına Hoşgeldiniz...");
        
        String islemler= "İşlemler...\n"
                         +"1. Daire ALanı Hesaplama\n"
                         +"2. Üçgen Çevresi Hesaplama\n"
                         +"3. İki Vektörün İç Çarpımını Hesaplama\n"
                         +"4. Çıkış için q'ya basın";
        
        
        while (true) {            
            
            System.out.println(islemler);
            
            System.out.print("İşlemi giriniz : ");
            
            String islem=scanner.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            
            else if (islem.equals("1")) {
                
                System.out.print("Dairenin yarıçapı : ");
                int yaricap=scanner.nextInt();
                scanner.nextLine();
                
                /*Matematik class'ımız ve daireAlan metodumuz static olduğu 
                için nesne oluşturmadan isimleriyle çağırabiliriz.*/
                Problem.Matematik.DaireAlan(yaricap);
                
                }
            
            else if (islem.equals("2")) {
                
                System.out.print("1. Kenar : ");
                int kenar1=scanner.nextInt();
                
                System.out.print("2. Kenar : ");
                int kenar2=scanner.nextInt();
                
                System.out.print("3. Kenar : ");
                int kenar3=scanner.nextInt();
                
                Problem.Matematik.ucgenCevresi(kenar1, kenar2, kenar3);
            }
            
            else if (islem.equals("3")) {
                
                Vec vec1=new Vec("Vektör1");
                Vec vec2=new Vec("Vektör2");
                
                Problem.Fizik.icCarpim(vec1, vec2);
            }
            
            else{
                System.out.println("Geçersiz bir işlem girdiniz...");
            }
        }
    }
    
}
