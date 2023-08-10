package empresas;

public class PessoaJuridica extends Empresa {
    
    private int numFunc;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, Double rendaAnual, int numFunc) {
        super(nome, rendaAnual);
        this.numFunc = numFunc;
    }

    public int getNumFunc() {
        return numFunc;
    }

    public void setNumFunc(int numFunc) {
        this.numFunc = numFunc;
    }

    @Override
    public void calImposto() {
        double imposto;
        if(getNumFunc() < 10){
            imposto = getRendaAnual() * 0.16;
            setImposto(imposto);
        } else if(getNumFunc() > 10){
            imposto = getRendaAnual() * 0.14;
            setImposto(imposto);
        }
    }
    
    

}