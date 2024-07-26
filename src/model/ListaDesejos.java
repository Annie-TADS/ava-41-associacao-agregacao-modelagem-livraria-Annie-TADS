package model;

import java.util.ArrayList;

public class ListaDesejos {
  final private String nome;
  final private boolean publica;
  final private ArrayList<Livro> livrosDesejados = new ArrayList();

  public ListaDesejos(String nome, boolean publica) {
    this.nome = nome;
    this.publica = publica;
  }

  public String getNome() {
    return this.nome;
  }

  public boolean isPublica() {
    return this.publica;
  }

  public boolean isPrivada() {
    return !isPublica();
  }

  public void adicionar(Livro livro) {
    livrosDesejados.add(livro);
  }

  public ArrayList<Livro> getLivros() {
    return livrosDesejados;
  }

  public Livro getLivro(int index) {
    try {
      return livrosDesejados.get(index);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }

  public int getQuantidade() {
    return livrosDesejados.size();
  }

  public boolean isVazia() {
    return getQuantidade() == 0;
  }
}
