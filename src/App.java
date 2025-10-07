import java.util.Scanner;
public class App
{
    public static void main(String[] args) throws Exception
    {
        Scanner s = new Scanner(System.in);
        // Acqui é puxada a classe Corpo_Humano para o App
        Corpo_Humano c1 = new Corpo_Humano(0, 0, 0, 0);

        System.out.println("=== CRIAÇÃO DO OBJETO CORPO HUMANO ===");
        System.out.print("Digite a massa inicial (kg): ");
        float massa = s.nextFloat();
        System.out.print("Digite o volume inicial (m³): ");
        float volume = s.nextFloat();
        System.out.print("Digite a densidade inicial (kg/m³): ");
        float densidade = s.nextFloat();
        System.out.print("Digite a altura inicial (m): ");
        float altura = s.nextFloat();

        // Os valores lidos antes são atribuídos às variáveis do Corpo_Humano
        c1.Massa = massa;
        c1.Volume = volume;
        c1.Densidade = densidade;
        c1.Altura = altura;

        System.out.println("\n=== VALORES INICIAIS ===");
        System.out.println("Massa: "+massa);
        System.out.println("Volume: "+volume);
        System.out.println("Densidade: "+densidade);
        System.out.println("Altura: "+altura);
        // Uma vez que os valores estão ligados, basta utilizar o c1 para utilizar o método calcularIMC
        System.out.println("IMC: "+c1.calculoIMC());

        System.out.print("\nDigite uma nova massa (kg): ");
        massa = s.nextFloat();
        System.out.print("Digite uma nova altura (m): ");
        altura = s.nextFloat();

        c1.Massa = massa;
        c1.Altura = altura;

        System.out.println("Novos valores:");
        System.out.println("Massa: "+massa);
        System.out.println("Altura: "+altura);
        System.out.println("Novo IMC: "+c1.calculoIMC());

        s.close();
    }
}
