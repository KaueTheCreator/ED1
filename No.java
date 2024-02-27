public class No <T>{
    
    private  T conteudo; // Conteúdo armazenado no nó
    private  No proximoNo; // Referência para o próximo nó
    
    // Construtor padrão que inicializa o conteúdo como null
    public No() {
        this.conteudo = null;
    }
    
    // Construtor que aceita um conteúdo como parâmetro
    public No(T conteudo) {
        this.conteudo = null; // Aqui, inicializa como null por padrão
        this.conteudo = conteudo; // Define o conteúdo com o parâmetro fornecido
    }
    
    // Construtor que aceita conteúdo e próximo nó como parâmetros
    public No(T conteudo, No proximoNo) {
        this.conteudo = conteudo; // Define o conteúdo
        this.proximoNo = proximoNo; // Define o próximo nó
    }
    
    // Getters and Setters
    public T getConteudo() {
        return conteudo; // Retorna o conteúdo do nó
    }
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo; // Define o conteúdo do nó
    }
    public No getProximoNo() {
        return proximoNo; // Retorna o próximo nó
    }
    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo; // Define o próximo nó
    }
    
    // Método para retornar uma representação encadeada dos nós
    public String toStringEncadeado() {
        String str = "No [conteudo=" + conteudo + "]"; // Inicializa a string com o conteúdo deste nó
        
        // Verifica se há um próximo nó
        if(proximoNo != null){
            str += "->" + proximoNo.toString(); // Se sim, concatena a representação do próximo nó
        } else {
            str += "->null"; // Se não, indica que não há próximo nó
        }
        
        return str; // Retorna a string resultante
    }
}
