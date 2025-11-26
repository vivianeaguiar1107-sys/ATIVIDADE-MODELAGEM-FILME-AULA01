public class Principal {
    public static void main(String[] args) {
        System.out.println("🎥 SISTEMA DE CATÁLOGO DE FILMES");
        System.out.println("=================================\n");

        // 🎭 Criando o primeiro filme
        Filme filme1 = new Filme();
        
        // Usando SETTERS para atribuir valores
        filme1.setTitulo("O Poderoso Chefão");
        filme1.setDiretor("Francis Ford Coppola");
        filme1.setAno(1972);
        filme1.setAvaliacao(9.2);
        
        // 🚀 Criando o segundo filme
        Filme filme2 = new Filme();
        
        // Usando SETTERS para atribuir valores
        filme2.setTitulo("Interestelar");
        filme2.setDiretor("Christopher Nolan");
        filme2.setAno(2014);
        filme2.setAvaliacao(8.6);

        // 📊 Exibindo informações dos filmes
        System.out.println("CATÁLOGO COMPLETO:");
        filme1.exibirInformacoes();
        filme2.exibirInformacoes();

        // 🧪 TESTANDO AS VALIDAÇÕES
        System.out.println("TESTANDO VALIDAÇÕES:");
        
        Filme filmeTeste = new Filme();
        
        // Teste de validação do ano (deve falhar)
        System.out.println("\nTentando definir ano como 1850:");
        filmeTeste.setAno(1850); // Deve mostrar erro
        
        // Teste de validação da avaliação (deve falhar)
        System.out.println("\nTentando definir avaliação como 15:");
        filmeTeste.setAvaliacao(15); // Deve mostrar erro
        
        // Teste de título vazio (deve falhar)
        System.out.println("\nTentando definir título vazio:");
        filmeTeste.setTitulo(""); // Deve mostrar erro

        // Agora definindo valores válidos
        System.out.println("Definindo valores válidos:");
        filmeTeste.setTitulo("Clube da Luta");
        filmeTeste.setDiretor("David Fincher");
        filmeTeste.setAno(1999);
        filmeTeste.setAvaliacao(8.8);
        filmeTeste.exibirInformacoes();

        // EXEMPLO DE ATUALIZAÇÃO DE DADOS
        System.out.println("ATUALIZANDO DADOS DO FILME 1:");
        
        // Usando GETTERS para ler valores atuais
        System.out.println("Avaliação atual do " + filme1.getTitulo() + ": " + filme1.getAvaliacao());
        
        // Atualizando a avaliação
        filme1.setAvaliacao(9.5);
        System.out.println("Nova avaliação: " + filme1.getAvaliacao());
        
        filme1.exibirInformacoes();
    }
}