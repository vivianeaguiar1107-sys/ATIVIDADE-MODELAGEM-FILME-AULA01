public class Filme {
    // Atributos privados - encapsulamento
    private String titulo;
    private String diretor;
    private int ano;
    private double avaliacao;

    // Método para exibir todas as informações
    public void exibirInformacoes() {
        System.out.println("🎬 DETALHES DO FILME");
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Ano: " + ano);
        System.out.println("Avaliação: " + avaliacao + "/10");
        System.out.println("----------------------------");
    }
    // GETTERS - permitem ler os valores
    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getAno() {
        return ano;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    // SETTERS - permitem modificar os valores com validações

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Erro: Título não pode ser vazio!");
        }
    }

    public void setDiretor(String diretor) {
        if (diretor != null && !diretor.trim().isEmpty()) {
            this.diretor = diretor;
        } else {
            System.out.println("Erro: Diretor não pode ser vazio!");
        }
    }

    public void setAno(int ano) {
        // ✅ Validação: ano não pode ser menor que 1900
        if (ano >= 1900) {
            this.ano = ano;
        } else {
            System.out.println("Erro: Ano de lançamento não pode ser menor que 1900!");
        }
    }

    public void setAvaliacao(double avaliacao) {
        // ✅ Validação: avaliação deve estar entre 0 e 10
        if (avaliacao >= 0 && avaliacao <= 10) {
            this.avaliacao = avaliacao;
        } else {
            System.out.println("Erro: Avaliação deve ser entre 0 e 10!");
        }
    }
}