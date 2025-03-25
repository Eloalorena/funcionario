// Classe TesteFuncionario para executar o código
public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Carlos", 'J', 5000, false);
        funcionario1.exibirDados(true, true); // Exemplo com falta e hora extra

        System.out.println();

        Funcionario funcionario2 = new Funcionario("Ana", 'S', 8000, true);
        funcionario2.exibirDados(false, false); // Exemplo de funcionário afastado
    }
}
