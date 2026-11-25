package br.com.alura.screenmatch.br.com.alura.screenmatch.src.principal;

import br.com.alura.screenmatch.br.com.alura.screenmatch.src.modelos.Filme;
import br.com.alura.screenmatch.br.com.alura.screenmatch.src.modelos.Serie;
import br.com.alura.screenmatch.br.com.alura.screenmatch.src.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);
        var filmeDoCarlos = new Filme("Creed", 2003);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoCarlos);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        List<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Carlos");
        buscarPorArtista.add("Vinicius");
        buscarPorArtista.add("Maia");

        Collections.sort(buscarPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscarPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
