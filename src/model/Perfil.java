package model;

import java.util.ArrayList;

public class Perfil {
  final private String nome;
  final private ArrayList<ListaDesejos> listasDesejos = new ArrayList();

  public Perfil(String nome) {
    this.nome = nome;
  }

  public ArrayList<ListaDesejos> getListasDeDesejos() {
    return listasDesejos;
  }

  public String getNome() {
    return this.nome;
  }

  public ListaDesejos novaListaDesejos(String nomeLista, boolean publica) {
    ListaDesejos listaDesejos = new ListaDesejos(nomeLista, publica);
    listasDesejos.add(listaDesejos);

    return listaDesejos;
  }

  public ListaDesejos getListaDesejos(int index) {
    try {
      return listasDesejos.get(index);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }

  public ListaDesejos getListaDesejos(String nome) {
    for (ListaDesejos lista : listasDesejos) {
      if (lista.getNome().equals(nome)) {
        return lista;
      }
    }

    return null;
  }
}
