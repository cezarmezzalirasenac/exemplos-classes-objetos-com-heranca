package classes;

public class Pessoa {
  private String nome;
  private String cpf;
  private String dataNascimento;
  private char genero;
  private String email;

  // método construtor
  // método construtor vazio
  public Pessoa() {

  }

  public Pessoa(String nome,
      String cpf,
      String dataNascimento,
      char genero) {
    this.nome = nome;
    this.cpf = cpf;
    this.dataNascimento = dataNascimento;
    this.genero = genero;
  }

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }

  public char getGenero() {
    return genero;
  }

  public String getEmail() {
    return email;
  }

  public static void mensagem() {
    System.out.println("Este é um método estático");
  }
}
