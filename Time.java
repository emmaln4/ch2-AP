 public class Time {
     public static void main (String[]args) {
    int ora, minuto, secondo;
    int mezzanotte, giorno; 
    double rimanente;
     
    ora = 13;
    minuto = 14;
    secondo = 50;
    mezzanotte = 0;
    giorno = 86400;
    rimanente = ((86400 - (ora*3600  + minuto*60 + secondo))/86400.0)*100; //add decimals
    System.out.println("tempo da mezzannotte: " + (ora*3600  + minuto*60 + secondo) + " secondi");
    System.out.println("tempo rimanente del giorno: " + (86400 - (ora*3600  + minuto*60 + secondo)) + " secondi");
    System.out.println("percento del giorno rimanente: " + rimanente + " secondi");
}
}