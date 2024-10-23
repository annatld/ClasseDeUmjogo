import java.util.Scanner;

public class AgentesValorant {
    private static String tipoDeAgente;

    public class Agente {
        private final String ataque;
        private String tipoDeAgente;

        public Agente(String tipoDeAgente, String ataque) {
            this.tipoDeAgente = tipoDeAgente;
            this.ataque = ataque;
        }

        public String getAtaque() {
            return ataque;
        }

        public String getTipoDeAgente() {
            return tipoDeAgente;
        }

        public void setTipoDeAgente(String tipoDeAgente) {
            this.tipoDeAgente = tipoDeAgente;
        }

        public void exibirInf() {
            System.out.println("Tipo de Agente: " + tipoDeAgente);
        }

        public String atacar() {
            return "O agente " + tipoDeAgente + " atacou usando: " + ataque;
        }

        public void exibirinformacoes() {
            System.out.println(atacar());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Agente: ");
        String agente = scanner.nextLine();

        String tipoDeAgente = "";
        String ataque = "";

        if (agente.equals("Jett")) {
            tipoDeAgente = "Jett";
            ataque = "Facas";
        } else if (agente.equals("Phoenix")) {
            tipoDeAgente = "Phoenix";
            ataque = "Labareda";
        } else if (agente.equals("Raze")) {
            tipoDeAgente = "Raze";
            ataque = "Explosivos";
        } else if (agente.equals("Neon")) {
            tipoDeAgente = "Neon";
            ataque = "Sobrecarga";
        } else if (agente.equals("Yoru")) {
            tipoDeAgente = "Yoru";
            ataque = "Espionagem Dimensional";
        }

        if (!tipoDeAgente.isEmpty()) {
            Agente novoAgente = new AgentesValorant().new Agente(tipoDeAgente, ataque);
            novoAgente.exibirinformacoes();
        } else {
            System.out.println("Agente desconhecido.");
        }

        scanner.close();
    }
}



