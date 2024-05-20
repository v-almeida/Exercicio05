import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        // LER O ARQUIVO DE TEXTO
        File arquivoLeitura = new File(
                "C:\\Users\\autologon\\Documents\\vitor-java\\lista05\\Exercicio05\\ExemploEx\\src\\arquivo.txt");
        Scanner scanner = new Scanner(arquivoLeitura);
        // Enquanto estiver linha no arquivo
        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println(linha);
        }
        // GRAVAR UM ARQUIVO DE TEXTO
    }
}
