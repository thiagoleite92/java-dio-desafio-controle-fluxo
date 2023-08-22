import java.util.Scanner;

public class Contador {

  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);

    try {
      int firstInt;
      int secondInt;
      do {
        System.out.print("Digite um número inteiro: ");
        while (!terminal.hasNextInt()) {
          System.out.print("Entrada inválida. Digite um número inteiro: ");
          terminal.nextInt();
        }
        firstInt = terminal.nextInt();
      } while (firstInt != (int) firstInt);

      do {
        System.out.print("Digite outro número inteiro: ");
        while (!terminal.hasNextInt()) {
          System.out.print("Entrada inválida. Digite outro número inteiro: ");
          terminal.nextInt();
        }
        secondInt = terminal.nextInt();
      } while (secondInt != (int) secondInt);

      counting(firstInt, secondInt);
    } catch (ParametrosInvalidosExcpetion exception) {
      System.out.println(exception.getMessage());
    } finally {
      terminal.close();
    }
  }

  static void counting(int firstInt, int secondInt)
    throws ParametrosInvalidosExcpetion {
    if (firstInt > secondInt) {
      throw new ParametrosInvalidosExcpetion(
        "O segundo parâmetro deve ser maior que o primeiro"
      );
    }

    int counting = secondInt - firstInt;

    for (int number = 1; number <= counting; number += 1) {
      System.out.println("Imprimindo o número: " + number);
    }
  }
}
