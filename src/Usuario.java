public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.print ("Tv ligada?" + smartTv.ligada);
         System.out.print ("Canal atual?" + smartTv.canal);
          System.out.print ("Qual o volume?" + smartTv.volume);


 smartTv.ligar();
 System.out.print ("Novo status -> Tv ligada?" + smartTv.ligada);

 smartTv.desligar();
 System.out.print ("Novo status -> Tv ligada?" + smartTv.ligada);
    }
}
