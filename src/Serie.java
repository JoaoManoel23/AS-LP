import java.util.Scanner;
public class Serie {
    public int episodio;
    public int temporada;
    public String titulo;
    public String sinopse;
    public boolean visto;

    public void lerDados() {
        System.out.println("Informe o titulo");
        Scanner tc = new Scanner(System.in);
        titulo = tc.next();
        System.out.println("informe a quantidade  de episodios");
        episodio = tc.nextInt();
        System.out.println("Informe a quantidade de temporadas");
        temporada = tc.nextInt();
        System.out.println("Informe a sinopse");
        sinopse = tc.next();
        System.out.println("Já assistiu?");
        String ok=tc.next();
        if(ok.equals("sim")){
            visto=true;
            System.out.println("Sim");
        }
    }

    public void exibirDados() {
        System.out.println("Nome:"+this.titulo);
        System.out.println("Episodios:"+this.episodio);
        System.out.println("Temporadas:"+this.temporada);
        System.out.println("Sinopse:"+this.sinopse);
        if(this.visto){
            System.out.println("Assistido:sim");
        }else{
            System.out.println("Assistido:não");
        }
        System.out.println("   ");
    }
    public Serie(String nome){
        this.titulo=nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return titulo.equals(serie.titulo);
    }

}