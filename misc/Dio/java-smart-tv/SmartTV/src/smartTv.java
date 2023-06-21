public class smartTv {

    boolean ligada = true;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void ligar() {
        ligada = true;

    }

    public void Desligar() {
        ligada = false;

    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;

    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }
}