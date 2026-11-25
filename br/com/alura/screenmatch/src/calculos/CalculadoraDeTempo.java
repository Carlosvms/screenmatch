package br.com.alura.screenmatch.br.com.alura.screenmatch.src.calculos;
import br.com.alura.screenmatch.br.com.alura.screenmatch.src.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
