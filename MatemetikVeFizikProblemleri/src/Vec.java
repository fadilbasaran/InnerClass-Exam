
import java.util.Scanner;



public class Vec {
    private String isim;
    private int i;
    private int j;
    private int k;
    
    public Vec(String isim){
        this.isim=isim;
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println(isim+ " ün i, j ve k değerlerini giriniz...");
        
        System.out.print("i : ");
        i=scanner.nextInt();
        
        System.out.print("j : ");
        j=scanner.nextInt();
        
        System.out.print("k : ");
        k=scanner.nextInt();
        
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
