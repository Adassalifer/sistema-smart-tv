public class SmartTv{
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume(){
        //volume =volume + 1;
        volume++;
        System.out.print("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        //volume =volume - 1;
        volume--;
        System.out.print("diminuindo o volume para: " + volume);
    }


    public void ligar(){
        ligada = true;
    }

   public void desligar(){
        ligada = false;
    }

}