package model;

public class Autor {
  final private String nome;
  final private String sobrenome;

  public Autor(String sobrenome, String nome) {
    this.sobrenome = sobrenome;
    this.nome = nome;
  }

  public String getNomeCompleto() {
    return String.format("%s %s", this.nome, this.sobrenome);
  }

  public String getSobrenome() {
    return this.sobrenome;
  }

  public String getNome() {
    return this.nome;
  }

  @Override
  public String toString() {
    return String.format("%s, %s", this.sobrenome, this.nome);
  }
}
