package Application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import empresas.Empresa;
import empresas.PessoaFisica;
import empresas.PessoaJuridica;


public class Principal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

    
        
        List<Empresa> empresas = new ArrayList<>();

        System.out.print("Quantos pagaram o imposto: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print("Pessoa Fisica ou Juridica [f/j]: ");
            char escolha = sc.next().charAt(0);
            if (escolha == 'f') {
                System.out.print("Razao social: ");
                sc.nextLine();
                String nome = sc.nextLine();

                System.out.print("Renda Anual: ");
                Double rendaAnual = sc.nextDouble();

                System.out.print("Gastos com saúde: ");
                Double gastosSaude = sc.nextDouble();

                empresas.add(new PessoaFisica(nome, rendaAnual, gastosSaude));

            } else if (escolha == 'j') {
                System.out.print("Razao social: ");
                sc.nextLine();
                String nome = sc.nextLine();

                System.out.print("Renda Anual: ");
                Double rendaAnual = sc.nextDouble();

                System.out.print("Número de funcionarios: ");
                int numFunc = sc.nextInt();

                empresas.add(new PessoaJuridica(nome, rendaAnual, numFunc));
            }
        }
        
        double totImposto = 0;
        for (Empresa empresa : empresas) {
            empresa.calImposto();
            System.out.println(empresa);
            totImposto += empresa.getImposto();
        }
        System.out.println("Total de imposto: R$" + String.format("%.2f", totImposto));
        sc.close();
    }
}
