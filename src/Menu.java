import java.util.Scanner;

public class Menu {


    public void show() {

        JocDaus jocDaus = new JocDaus();

        Scanner scanner = new Scanner(System.in);
        int sel = 0;

        while (sel != 5) {

            System.out.println("## Menú de Selección ##");
            System.out.println("1. Juego de 3 dados");
            System.out.println("2. Juego de 2 dados");
            System.out.println("3. Ping Pong (Ejemplo)");
            System.out.println("4. Counter Strike (Ejemplo)");
            System.out.println("5. Salir");

            sel = scanner.nextInt();

            switch (sel) {
                case 1:
                    jocDaus.jugar();
                    break;

                case 2:
                    Dados.iniciar();
                    break;

                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Gràcies per jugar!");
                    System.out.println("## Estadísticas 3 daus ##");
                    System.out.println("Partides totals: " + jocDaus.getTotalPartidas());
                    System.out.println("Total guanyades: " + jocDaus.getTotalGanadas());
                    System.out.println("Total perdudes: " + jocDaus.getTotalPerdidas());
            }

        }

    }

}
