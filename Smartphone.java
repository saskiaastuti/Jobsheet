
package smartphone;
class smartphone{
 String nama;
 String jenis;
 String warna;
}

public class Smartphone {
    
    public static void main(String[] args) {
       smartphone saskia= new smartphone();
       saskia.nama = "Saskia Astuti";
       saskia.jenis = "samsung";
       saskia.warna = "pink";
      String a = saskia.nama;
      String b = saskia.jenis;
      String c = saskia.warna;
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
    }
    
}
