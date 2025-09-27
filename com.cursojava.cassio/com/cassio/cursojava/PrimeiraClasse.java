public class PrimeiraClasse {

    public static void main(String[] args) {
        System.out.println("Ola Cassio");
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Ar 14 Conjunto 01");
        cliente.setCodigo(1);
        System.out.println(cliente.getCodigo());
        System.out.println("cliente.getEndereco");
        System.out.println(cliente.getValorTotal());
        System.out.println(cliente.retornarNomeCliente());

    }

}
