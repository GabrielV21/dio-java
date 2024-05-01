public class Main {
    public static void main(String[] args) {
        System.out.println("Classes de um Teleco");
    }
}
class ReprodutorMusical {
    boolean ligado;
    String musica;
    public void playPause(){
        this.ligado = !this.ligado;
    }
    public void selecionarMusica(String musga){
        this.musica = musga;
    }
}
class AparelhoTelefonico{
    public void ligar(int num){
        System.out.println("Ligando para: "+num);
    }
    public void atender(int num){
        System.out.println("Atendendo :"+num);
    }
    public void correioVoz(int num){
        System.out.println("Mensagem de :"+ num);
    }
}
class NavegadorInternet{
    public void exibirPag(String url){
        System.out.println("Exibir "+ url);
    }
    public void adicionarAba(){
        System.out.println("a");
    }
    public void atualizarPag(){
        System.out.println("F5");
    }
}