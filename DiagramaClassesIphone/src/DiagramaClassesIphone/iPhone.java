package DiagramaClassesIphone;
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
    private boolean ligado;

    public iPhone() {
        this.ligado = false;
    }

    @Override
    public void ligar() {
        this.ligado = true;
        System.out.println("iPhone ligado");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("iPhone desligado");
    }

    public boolean isLigado() {
        return this.ligado;
    }

    // Implementação dos métodos das interfaces ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    // Implementação dos métodos das interfaces AparelhoTelefonico
    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    // Implementação dos métodos das interfaces NavegadorNaInternet
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página na internet");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
