package classes;

public class Cachorro extends Animal {

  private int vidas;

  public Cachorro(String raca, String idade, String cor,
      double tamanho, double peso, char genero) {
    super(raca, idade, cor, tamanho, peso, genero, "Canino");
    this.vidas = 1;
  }

  public int getVidas() {
    return vidas;
  }
}
