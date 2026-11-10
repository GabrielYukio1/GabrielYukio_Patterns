public class Main {
    public static void main(String[] args) {
        Personagem base = new Personagem(
                "Guerreiro Base", "Guerreiro", 1, 100, 15
        );

        Personagem p1 = base.clone();
        p1.setNome("Arthur");

        Personagem p2 = base.clone();
        p2.setNome("Merlin");

        Personagem p3 = base.clone();
        p3.setNome("Lancelot");

        System.out.println("=== Personagem Base ===");
        base.exibir();

        System.out.println("\n=== Personagens Clonados ===");
        p1.exibir();
        p2.exibir();
        p3.exibir();
    }
}
