import  java.util.ArrayList;
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

        var empregados = new ArrayList<Empregado>();
        empregados.add(e1);
        empregados.add(e2);
        empregados.add(e3);

        //enhaced for (Java 5+)
        /*for(Empregado e : empregados){
            System.out.println(e.calcularSalario());
        }*/
        for(int i=1; i<empregados.size(); i++){
            System.out.println(empregados.get(i).calcularSalario());
        }
        
        }
}
