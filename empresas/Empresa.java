package empresas;

public class Empresa {
    private String nome;
    private Double rendaAnual;
    private double imposto;

    public Empresa() {
    }

    public Empresa(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {   
        return nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void calImposto() {
        
    }

    @Override
    public String toString() {
        return nome + ": R$" + String.format("%.2f", imposto);
    }

    

}
