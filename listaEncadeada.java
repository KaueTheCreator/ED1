public class listaEncadeada<T> {
    
    No<T> referenciaEntrada; // Referência para o primeiro nó da lista
    
    // Construtor padrão que inicializa a referência de entrada como null
    public listaEncadeada() {
        this.referenciaEntrada = null;
    }

    // Método para adicionar um novo elemento à lista
    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo); // Cria um novo nó com o conteúdo fornecido
        if (this.isEmpty()) { // Verifica se a lista está vazia
            referenciaEntrada = novoNo; // Se estiver vazia, define o novo nó como a referência de entrada
            return;
        } else {
            No<T> noAuxiliar = referenciaEntrada;
            // Percorre a lista até o último nó
            for (int i = 0; i < this.size() - 1; i++) {
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            // Adiciona o novo nó após o último nó existente
            noAuxiliar.setProximoNo(novoNo);
        }
    }

    // Método para obter o conteúdo de um nó em um determinado índice
    public T get(int index) {
        return getNo(index).getConteudo();
    }

    // Método privado para obter o nó em um determinado índice
    private No<T> getNo(int index) {
        validaIndice(index); // Verifica se o índice é válido
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    // Método para remover o elemento em um determinado índice
    public T remove(int index) {
        No<T> noPivo = this.getNo(index); // Obtém o nó a ser removido
        if (index == 0) { // Se o índice for o primeiro
            referenciaEntrada = noPivo.getProximoNo(); // Atualiza a referência de entrada
            return noPivo.getConteudo(); // Retorna o conteúdo removido
        }
        No<T> noAnterior = getNo(index - 1); // Obtém o nó anterior ao nó a ser removido
        noAnterior.setProximoNo(noPivo.getProximoNo()); // Atualiza o próximo nó do nó anterior
        return noPivo.getConteudo(); // Retorna o conteúdo removido
    }

    // Retorna o tamanho da lista
    public int size() {
        int tamanhoLista = 0; // Inicializa o tamanho da lista como zero
        No<T> referenciaAux = referenciaEntrada; // Cria uma referência auxiliar para percorrer a lista
        
        // Loop para percorrer a lista
        while (referenciaAux != null) {
            tamanhoLista++; // Incrementa o tamanho da lista
            referenciaAux = referenciaAux.getProximoNo(); // Avança para o próximo nó
        }
        return tamanhoLista; // Retorna o tamanho da lista
    }

    // Método privado para validar um índice
    private void validaIndice(int index) {
        if (index >= size()) { // Verifica se o índice está dentro dos limites da lista
            int ultimoIndice = size() - 1; // Obtém o último índice válido
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Essa lista só vai até o índice " + ultimoIndice + ".");
        }
    }

    // Retorna se a lista está vazia ou não
    public boolean isEmpty() {
        return referenciaEntrada == null; // Retorna verdadeiro se a referência de entrada for nula, caso contrário, falso
    }

    // Método para representar a lista como uma string
    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        // Percorre a lista concatenando os conteúdos dos nós
        for (int i = 0; i < this.size(); i++) {
            strRetorno += "No[conteudo=" + noAuxiliar.getConteudo() + "]";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null"; // Adiciona "null" para indicar o fim da lista
        return strRetorno;
    }
}
