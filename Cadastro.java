import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {
    Scanner scanner = new Scanner(System.in);
    private List<Livro> livCadastrado = new ArrayList<>();

    public void adicionarLivro(){
        System.out.println("Quantidade de livros que deseja cadastrar: ");
        int n = scanner.nextInt();

        scanner.nextLine();

        for(int i = 0; i < n; i++){
            int id = i;

            System.out.print("Livro que deseja adicionar: ");
            String titulo = scanner.nextLine();

            System.out.print("Do autor: ");
            String autor = scanner.nextLine();

            System.out.print("Livro do gênero: ");
            String genero = scanner.nextLine();

            System.out.print("Quantidade de páginas que o livro possui: ");
            int qntdPag= scanner.nextInt();

            scanner.nextLine();

            Livro livro = new Livro(id, titulo, autor, genero, qntdPag);
            livCadastrado.add(livro);

        }
    }
    
    public void mostrarLivro(){
        if(livCadastrado.isEmpty()){
            System.out.println("Não há livros cadastrados no momento");
        }
        else{
            for(Livro livro : livCadastrado){
            System.out.println("Seus livros são: ");
            System.out.println(livro);
            }
        }
    }
}
