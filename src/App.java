import classes.Animal;
import classes.Cachorro;
import classes.Gato;
import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // listarPessoas();

        listarAnimais();
    }

    public static void listarAnimais() {

        Animal[] animais = new Animal[5];

        // método construtor sem vidas
        animais[0] = new Gato("angora",
                "10",
                "mesclado",
                0.20,
                2,
                'M',
                5,
                2);

        // método construtor sem vidas
        animais[1] = new Gato("siames",
                "2",
                "cinza",
                0.20,
                2,
                'M',
                0);

        animais[2] = new Cachorro("maltes", "1", "branco",
                0.23, 2.5, 'F');

        // casting - conversão de um tipo para outro

        for (Animal animal : animais) {
            if (animal != null) {
                System.out.println("Espécie: " + animal.getEspecie());
                if (animal instanceof Cachorro) {
                    Cachorro cachorro = (Cachorro) animal;
                    System.out.println(cachorro.getRaca() + "-" + cachorro.getVidas());
                }

                if (animal instanceof Gato) {
                    Gato gato = (Gato) animal;
                    System.out.println(gato.getRaca() + "-" + gato.getVidas());
                }
            }
        }

    }

    public static void listarPessoas() {
        Pessoa[] pessoas = new Pessoa[5];
        pessoas[0] = new Pessoa(
                "Cezar",
                "1234567890",
                "01/01/1970",
                'M');

        Pessoa.mensagem();

        pessoas[1] = new Pessoa(
                "William",
                "1234567890",
                "01/01/1970",
                'M');

        // for tradicional
        // for (int i = 0; i < pessoas.length; i++) {
        // System.out.println(pessoas[i].getNome());
        // }

        // for each - para cada item, do primeiro ao ultimo
        for (Pessoa pessoa : pessoas) {
            if (pessoa != null) {
                System.out.println(pessoa.getNome());
            }

        }

        System.out.println();
    }
}
