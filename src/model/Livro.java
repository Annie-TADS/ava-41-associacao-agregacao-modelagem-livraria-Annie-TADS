package model;

public class Livro {
  final private String titulo;
  final private Autor autor;
  final private int anoLancamento;
  final private Editora editora;


  public Livro(String titulo, Autor autor, int anoLancamento, Editora editora) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoLancamento = anoLancamento;
    this.editora = editora;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public Autor getAutor() {
    return this.autor;
  }

  public int getAno() {
    return this.anoLancamento;
  }

  public Editora getEditora() {
    return this.editora;
  }

  @Override
  public String toString() {
    return String.format("%s. %s. Ed. %s, %d.", this.autor.toString(), getTitulo(), editora.getNome(), this.anoLancamento);
  }
}
