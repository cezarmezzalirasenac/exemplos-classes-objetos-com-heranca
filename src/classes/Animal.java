package classes;

public class Animal {
  // atributos da classe
  private String raca;
  private String idade;
  private String cor;
  private double tamanho;
  private double peso;
  private char genero;
  private String especie;

  // método construtor
  public Animal(String raca,
      String idade,
      String cor,
      double tamanho,
      double peso,
      char genero,
      String especie) {
    this.raca = raca;
    this.idade = idade;
    this.cor = cor;
    this.tamanho = tamanho;
    this.peso = peso;
    this.genero = genero;
    this.especie = especie;
  }

  public String getRaca() {
    return raca;
  }

  public void setRaca(String raca) {
    this.raca = raca;
  }

  public String getIdade() {
    return idade;
  }

  public void setIdade(String idade) {
    this.idade = idade;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public double getTamanho() {
    return tamanho;
  }

  public void setTamanho(double tamanho) {
    this.tamanho = tamanho;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public char getGenero() {
    return genero;
  }

  public void setGenero(char genero) {
    this.genero = genero;
  }

  public String getEspecie() {
    return especie;
  }

}
