import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input = 1;
        String descricaoCompra;
        int valorCompra = 0;
        String menu = """
            Digite a Opção que deseja: \n
            0 - sair | 1 - continuar
                """;


        Scanner leitura = new Scanner(System.in);
        ImprimeInfo imprimir = new ImprimeInfo();
        List<String> descricoes = new ArrayList<>();
        List<Integer> valores = new ArrayList<>();

        System.out.println("Digite o limite do cartão: ");
        int limite = leitura.nextInt();
        leitura.nextLine();// Correcting bugs on eadline

        while(input != 0){
            System.out.println("Digite a descrição da compra: ");
            descricaoCompra = leitura.nextLine();

            System.out.println("Digite o valor da compra: ");
            valorCompra = leitura.nextInt();

            if(valorCompra > limite){
                System.out.println("Saldo Insuficiente!");
                input = 0;
            }else{
                descricoes.add(descricaoCompra);
                valores.add(valorCompra);
                limite -= valorCompra;
                System.out.println("O saldo atual é de " + limite+ " R$");
                System.out.println(menu);
                input = leitura.nextInt();
                leitura.nextLine();// Correcting bugs on readline
            }
        }

        imprimir.ImprimeValores(descricoes,valores);
    }


}