

 public class Date {
     int dato, anno;
     String giorno, mese;
     public static void main (String[]args) {
         Date d = new Date();
     d.giorno = "martedi";
     d.dato = 9;
     d.mese = "settembre";
     d.anno = 2025;
     
     System.out.println("American format: " + d.giorno + ", " + d.mese + " " + d.dato + ", " + d.anno);
     System.out.println("European format: " + d.giorno + " " + d.dato + " " + d.mese + " " + d.anno);
 }
}