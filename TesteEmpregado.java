public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado e1 = new Empregado();
        Empregado e2 = new Empregado();
        Empregado e3 = new Empregado();
        e1.setTipo(0);
        e2.setTipo(1);
        e3.setTipo(2);

        e1.setSalario(2000);
        e2.setSalario(1800);
        e2.setComissao(0.1);
        e3.setSalario(1700);
        e3.setBonus(400);
        }
}
