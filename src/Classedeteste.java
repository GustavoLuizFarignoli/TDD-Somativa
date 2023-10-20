import org.junit.Test;

import static org.junit.Assert.*;

public class Classedeteste {
    @Test
    public void testcadastro() {
        Livro l = new Livro("Frankenstein", "Mary Shelly",true);
        Acervo.adicionar(l);
        assertEquals(Acervo.livros.get(0), l);
    }

    @Test
    public void testebusca() {
        Livro l = new Livro("Frankenstein", "Mary Shelly",true);
        Acervo.adicionar(l);
        Livro l2 = Acervo.buscar("Frankenstein");
        assertEquals(l,l2);
    }

    @Test
    public void testealuguel() {
        Livro l = new Livro("Frankenstein", "Mary Shelly",true);
        Acervo.adicionar(l);
        Acervo.alugar("Frankenstein");
        assertFalse(l.isDisponivel());
    }

    @Test
    public void testeremover() {
        Livro l = new Livro("Frankenstein", "Mary Shelly",true);
        Acervo.adicionar(l);
        Acervo.remover("Frankenstein");
        Livro l2 = Acervo.buscar("Frankenstein");
        assertNull(l2);
    }
}
