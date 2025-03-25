 // Classe Funcionario
public class Funcionario {
    private String nome;
    private char nivel; // T, J, P, S
    private double salarioBase;
    private boolean afastado;
    private static final double SALARIO_MINIMO = 1518.0;
    
    public Funcionario(String nome, char nivel, double salarioBase, boolean afastado) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.afastado = afastado;
    }
    
    public double calcularSalario(boolean temFalta, boolean temHoraExtra) {
        double salarioFinal = salarioBase;
        double descontoFalta = 0;
        double aumentoHoraExtra = 0;
        
        if (temFalta) {
            descontoFalta = salarioBase * 0.1;
            salarioFinal -= descontoFalta;
        }
        if (temHoraExtra) {
            aumentoHoraExtra = salarioFinal * 0.1;
            salarioFinal += aumentoHoraExtra;
        }
        
        return Math.max(salarioFinal, SALARIO_MINIMO);
    }
    
    public void exibirDados(boolean temFalta, boolean temHoraExtra) {
        double salarioFinal = afastado ? salarioBase : calcularSalario(temFalta, temHoraExtra);
        double descontoFalta = temFalta ? salarioBase * 0.1 : 0;
        double aumentoHoraExtra = temHoraExtra ? salarioFinal * 0.1 : 0;
        
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Afastado: " + (afastado ? "Sim" : "Não"));
        if (temFalta) {
            System.out.println("Falta apontada: Sim (Desconto de R$" + descontoFalta + ")");
        } else {
            System.out.println("Falta apontada: Não");
        }
        if (temHoraExtra) {
            System.out.println("Hora extra: Sim (Aumento de R$" + aumentoHoraExtra + ")");
        } else {
            System.out.println("Hora extra: Não");
        }
        System.out.println("Salário final: R$" + salarioFinal);
    }
}
