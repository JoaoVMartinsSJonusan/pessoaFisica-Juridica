package empresas;

public class PessoaFisica extends Empresa{
    
    private Double gastosSaude;
    
    public PessoaFisica(){
        
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {

        this.gastosSaude = gastosSaude;
    }

    @Override
    public void calImposto() {
        double imposto;
        if (this.getRendaAnual() < 20000) {
            imposto = this.getRendaAnual() * 0.15;
            setImposto(imposto);
            if (getGastosSaude() > 0) {
                imposto -= getGastosSaude() * 0.50;
                setImposto(imposto);
            }
        } else if (this.getRendaAnual() > 20000) {
            imposto = this.getRendaAnual() * 0.25;
            setImposto(imposto);
            if (getGastosSaude() > 0) {
                imposto -= getGastosSaude() * 0.50;
                setImposto(imposto);
            }
        }
    }


}
