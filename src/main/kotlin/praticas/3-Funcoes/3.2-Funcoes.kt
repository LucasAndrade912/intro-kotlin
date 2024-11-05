package br.ifpb.pdm.praticas.`3-Funcoes`

val biblioteca = mutableMapOf<String, MutableList<String>>()

/**
 * Adiciona um livro à biblioteca.
 * Recebe o título do livro e uma lista de autores.
 * Retorna uma mensagem indicando o resultado.
 */

fun adicionarLivro(titulo: String, autores: MutableList<String> = mutableListOf()): String {
    // Dica: Verifique se o livro já existe no mapa 'biblioteca' usando containsKey.
    // Se o livro já existir, retorne uma mensagem de que ele já está na biblioteca.
    // Caso contrário, adicione o livro e a lista de autores ao mapa.
    return ""
}

/**
 * Remove um livro da biblioteca.
 * Retorna uma mensagem indicando o resultado.
 */
fun removerLivro(titulo: String): String {
    // Dica: Use o método remove para tentar remover o livro pelo título.
    // Verifique se o método remove retornou null para saber se o livro não foi encontrado.
    // Se o livro foi removido, retorne uma mensagem de sucesso.
    return ""
}

/**
 * Mostra todas as informações sobre um livro, incluindo seus autores.
 * Retorna uma mensagem com os detalhes do livro ou uma mensagem de erro se o livro não existir.
 */

fun mostrarDetalhesLivro(titulo: String): String {
    // Dica: Use o map atribuído a variável biblioteca para recuperar a lista de autores do livro.
    // Se o livro não for encontrado (o acesso retorna null), retorne uma mensagem de erro.
    // Caso contrário, use joinToString para formatar a lista de autores em uma única string.
    return ""
}

/**
 * Exibe uma lista de todos os livros na biblioteca com seus autores.
 * Retorna uma mensagem formatada com o título e autores de cada livro ou uma mensagem indicando que a biblioteca está vazia.
 */
fun listarLivros(): String {
    // Dica: Verifique se a biblioteca está vazia usando isEmpty.
    // Se estiver vazia, retorne uma mensagem indicando isso.
    // Caso contrário, use entries e joinToString para formatar os títulos e autores dos livros.
    return ""
}

fun main() {
    // Teste de adicionar livros (incluindo duplicação)
    println(adicionarLivro("A Revolução dos Bichos", mutableListOf("George Orwell")))
    println(adicionarLivro("1984", mutableListOf("George Orwell")))
    println(adicionarLivro("A Revolução dos Bichos")) // Tentativa de adicionar um livro duplicado

    // Teste de mostrar detalhes de um livro existente e um não existente
    println(mostrarDetalhesLivro("A Revolução dos Bichos"))
    println(mostrarDetalhesLivro("O Senhor dos Anéis")) // Livro não existente

    // Teste de remoção de livro existente e não existente
    println(removerLivro("1984"))
    println(removerLivro("O Pequeno Príncipe")) // Livro não encontrado

    // Teste de listar livros em uma biblioteca com livros e depois de esvaziá-la
    println("Livros na biblioteca:\n${listarLivros()}")

    // Remover o último livro para esvaziar a biblioteca e testar o comportamento com uma biblioteca vazia
    println(removerLivro("A Revolução dos Bichos"))
    println("Livros na biblioteca após remoção de todos os livros:\n${listarLivros()}")
}