package atividade02;
//atv03
public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor f1 = new Fornecedor("Empresa Solaris", "Rua Orion 45", "99122-3300", 15000, 4200);
        System.out.println("Fornecedor: " + f1.getNome());
        System.out.println("Endereço: " + f1.getEndereco());
        System.out.println("Telefone: " + f1.getTelefone());
        System.out.println("Saldo: " + f1.obterSaldo());

        Fornecedor f2 = new Fornecedor("Mercantil Aurora", 8000, 3500);
        f2.setEndereco("Av. Luminosa 210");
        f2.setTelefone("99888-1122");
        System.out.println("\nFornecedor: " + f2.getNome());
        System.out.println("Endereço: " + f2.getEndereco());
        System.out.println("Telefone: " + f2.getTelefone());
        System.out.println("Saldo: " + f2.obterSaldo());
    }
}