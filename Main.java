public class Main {
    
    public static void main(String[] args) {
        
        // Criando uma instância da lista encadeada de strings
        listaEncadeada<String> minhaListaEncadeada = new listaEncadeada<>();

        // Adicionando elementos à lista
        minhaListaEncadeada.add("teste1");
        minhaListaEncadeada.add("teste2");
        minhaListaEncadeada.add("teste3");
        minhaListaEncadeada.add("teste4");

        // Obtendo e imprimindo elementos da lista pelos índices
        System.out.println(minhaListaEncadeada.get(0)); // Imprime o elemento no índice 0
        System.out.println(minhaListaEncadeada.get(1)); // Imprime o elemento no índice 1
        System.out.println(minhaListaEncadeada.get(2)); // Imprime o elemento no índice 2
        System.out.println(minhaListaEncadeada.get(3)); // Imprime o elemento no índice 3

        // Imprimindo toda a lista
        System.out.println(minhaListaEncadeada); // Imprime a representação da lista como uma string
        
    }

}
