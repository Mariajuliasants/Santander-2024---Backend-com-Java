public class Usuario {
    public static void main(String[] args) throws Exception {
       
    SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual:"+smartTv.volume);


    System.out.println("Tv ligada? "+smartTv.ligada);
  
    System.out.println("Volume atual:"+smartTv.volume);

    System.out.println("Canal atual: "+smartTv.canal);
    smartTv.mudarCanal(13);
    System.out.println("Canal atual: "+smartTv.canal);

    smartTv.ligar();
    System.out.println(" Novo status  --> Tv ligada? "+smartTv.ligada);

    }

}
