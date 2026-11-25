package br.com.alura.screenmatch.br.com.alura.screenmatch.src.principal;

import br.com.alura.screenmatch.br.com.alura.screenmatch.src.modelos.Episodio;
import br.com.alura.screenmatch.br.com.alura.screenmatch.src.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.br.com.alura.screenmatch.src.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.br.com.alura.screenmatch.src.modelos.Filme;
import br.com.alura.screenmatch.br.com.alura.screenmatch.src.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.exibeFichaTecnica();
        System.out.println("Duração em minutos: " + meuFilme.getDuracaoEmMinutos() + " minutos");

        meuFilme.avalia(5);
        meuFilme.avalia(5);
        meuFilme.avalia(5);
        System.out.println("Avaliação: " + meuFilme.pegaMedia());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        Serie serie = new Serie("The chosen", 2022);
        serie.exibeFichaTecnica();
        serie.setTemporadas(4);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);
        System.out.println(serie.getTemporadas() + " Temporadas");
        System.out.println(serie.getEpisodiosPorTemporada() + " Episodios por temporada");
        System.out.println("Matatona: " + serie.getDuracaoEmMinutos() + " minutos");

        Filme outroFilme = new Filme("Avatar", 2022);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println("Total de tempo: " + calculadora.getTempoTotal() + " minutos");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoCarlos = new Filme("creed", 2003);
        filmeDoCarlos.setDuracaoEmMinutos(200);
        filmeDoCarlos.avalia(8);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoCarlos);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);
        System.out.println("tamanho: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
    }
}
