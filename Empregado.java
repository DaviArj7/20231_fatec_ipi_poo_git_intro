public class Empregado{
    private int tipo;
    //variável de instância (obejto)
    private String nome;
    //variável de instância (obejto)
    private int idade;
    private double salario;
    private double comissao;
    private double bonus;

    public double calcularSalario(){
        if (tipo == 0)
            return salario;
        if (tipo == 1)
            return salario + salario * comissao;
        if (tipo == 2)
            return salario + bonus;
        return 0;
    }

    public String getNome(){
        return  nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

   public int getIdade() {
       return idade;
   }
   public void setIdade(int idade) {
       this.idade = idade;
   }

   public int getTipo() {
       return tipo;
   }
   public void setTipo(int tipo) {
       this.tipo = tipo;
   }

   public double getBonus() {
       return bonus;
   }

   public double getComissao() {
       return comissao;
   }

   public double getSalario() {
       return salario;
   }

   public void setBonus(double bonus) {
       this.bonus = bonus;
   }

   public void setComissao(double comissao) {
       this.comissao = comissao;
   }

   public void setSalario(double salario) {
       this.salario = salario;
   }
}