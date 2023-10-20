import java.util.ArrayList;

public class Acervo {
    public static ArrayList<Livro> livros = new ArrayList<>();
    public static void adicionar(Livro l) {
        livros.add(l);
    }

    public static Livro buscar(String titulo){
        for (int i = 0; i < livros.size(); i++){
            if (titulo == livros.get(i).getTitulo()){
                return livros.get(i);
            }
        }
        return null;
    }

    public static void alugar(String titulo){
       Livro l = buscar(titulo);
        if (l != null && l.isDisponivel()){
            l.setDisponivel(false);
            System.out.println(l.getTitulo() + " alugado com Sucesso");
        } else if (l != null && !l.isDisponivel()) {
            System.out.println("Livro Não Disponivel");
        } else {
            System.out.println("Livro não encontrado");
        }
    }

    public static void remover(String titulo){
        Livro l = buscar(titulo);
        livros.remove(l);
    }
}
