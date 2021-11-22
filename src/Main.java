import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        ArrayList<Serie> biblioteca=new ArrayList<>();

        int op=0;
        do{
            System.out.println("Digite 1 para adicionar uma série");
            System.out.println("Digite 2 para listar as séries ");
            System.out.println("Digite 3 para remover uma série por posição");
            System.out.println("Digite 4 para buscar uma série");
            System.out.println("Digite 5 para ver a quantidade de séries");
            System.out.println("Digite 6 para listar séries vistas");
            System.out.println("Digite 7 para sair");
            op=tc.nextInt();
            switch (op){
                case 1:
                    Serie serie = new Serie("a");
                    serie.lerDados();
                    serie.exibirDados();
                    biblioteca.add(serie);
                    break;
                case 2:
                    if(biblioteca.isEmpty()){
                        System.out.println("Séries não cadastradas");
                    }else {
                        for (int i = 0; i <= biblioteca.size(); i++){
                            biblioteca.get(i).exibirDados();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite a posição que deseja remover");
                    int posicao=tc.nextInt();
                    Serie apagar = biblioteca.remove(posicao);
                    if(apagar!=null){
                        System.out.println("Série Removida");
                    }else{
                        System.out.println("Série não encontrada");
                    }
                    break;
                case 4:
                    System.out.println("Digite o nome da série");
                    String nome=tc.next();
                    Serie buscar=new Serie(nome);
                    if(biblioteca.contains(buscar)){
                       System.out.println("Encontrei na posição:"+biblioteca.indexOf(buscar));
                   }else{
                        System.out.println("Não encontrado");
                    }
                    break;
                case 5:
                    System.out.println(biblioteca.size());
                    break;
                case 6:
                    for (int i = 0;i<biblioteca.size();i++){
                        if(biblioteca.get(i).visto){
                            biblioteca.get(i).exibirDados();
                        }
                    }
                    break;
            }
        }while(op!=7);
    }
}
