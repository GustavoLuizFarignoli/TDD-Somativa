import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class Classedeteste {
    @Test
    public void testcadastro() {
        Livro l = new Livro("Frankenstein", "Mary Shelly",true);
        Acervo.adicionar(l);
    }
}
