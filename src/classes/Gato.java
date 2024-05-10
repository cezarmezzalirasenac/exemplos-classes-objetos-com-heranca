package classes;

public class Gato extends Animal {

  private int vidas;
  private int quantidadeOlhos;

  // Padrão
  public Gato(String raca, String idade, String cor,
      double tamanho, double peso, char genero) {
    super(raca, idade, cor, tamanho, peso, genero, "Felino");
  }

  // Padrão + vidas + quantidadeOlhos
  public Gato(String raca, String idade, String cor,
      double tamanho, double peso, char genero,
      int vidas, int quantidadeOlhos) {
    super(raca, idade, cor, tamanho, peso, genero, "Felino");
    this.vidas = vidas;
    this.quantidadeOlhos = quantidadeOlhos;
  }

  public Gato(String raca, String idade, String cor,
      double tamanho, double peso, char genero,
      int quantidadeOlhos) {
    super(raca, idade, cor, tamanho, peso, genero, "Felino");
    this.vidas = 7;
    this.quantidadeOlhos = quantidadeOlhos;
  }

  public int getVidas() {
    return vidas;
  }

  public void setVidas(int vidas) {
    this.vidas = vidas;
  }

}
