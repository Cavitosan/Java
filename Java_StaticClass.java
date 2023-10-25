import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Cria uma instância da classe comum
        MinhaClasseComum instancia = new MinhaClasseComum();

        // Chama métodos da classe comum
        instancia.metodoComum();
        instancia.metodoAbstratoImplementado();
    }

    // Classe abstrata
    abstract static class MinhaClasseAbstrata {
        public abstract void metodoAbstrato();

        public void metodoAbstratoImplementado() {
            System.out.println("Método abstrato implementado na classe abstrata");
        }
    }

    // Classe comum não estática
    static class MinhaClasseComum extends MinhaClasseAbstrata {
        @Override
        public void metodoAbstrato() {
            System.out.println("Método abstrato implementado na classe comum");
        }

        public void metodoComum() {
            System.out.println("Método da classe comum");
        }
    }
}


// Como Funcionam as Classes Estáticas em Java:

//Classes Estáticas: Em Java, as classes estáticas são classes aninhadas que não dependem de uma instância da classe externa e podem ser acessadas diretamente a partir do nome da classe. Elas são frequentemente usadas para agrupar funcionalidades relacionadas.

// Acesso Direto: Como as classes estáticas não estão vinculadas a instâncias da classe externa, você pode acessar seus membros (métodos e campos) diretamente, sem criar uma instância da classe estática.

// Boas Práticas: Classes estáticas são úteis para agrupar utilitários, métodos de fábrica ou constantes. Elas podem ajudar a manter o código organizado.


// Como Não Devemos Implementar:

// 1. Classes Estáticas como Classes Internas Estáticas: Evite declarar classes estáticas dentro de uma classe não estática, a menos que haja uma razão específica para fazer isso. Classes internas estáticas não devem ser usadas apenas para agrupar membros.

// 2. Uso Excessivo: Não crie classes estáticas desnecessariamente. Elas devem ser usadas com moderação e apenas quando oferecem uma organização lógica e útil para o código.

// 3. Classes Estáticas em Contextos Inadequados: Não use classes estáticas em situações onde você precisa do acesso a membros não estáticos da classe externa. Nesse caso, classes não estáticas ou interfaces podem ser mais apropriadas.
