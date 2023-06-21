public class Usuario {
    public static void main(String[] args) throws Exception {

        smartTv smartTv = new smartTv();

        System.out.println("TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Canal atual: " + smartTv.canal);

        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status: TV está ligada? " + smartTv.ligada);

        smartTv.Desligar();
        System.out.println("Novo Status: TV está ligada? " + smartTv.ligada);

    }
}
