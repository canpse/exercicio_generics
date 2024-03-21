# Exercicio aula de POOII sobre generics
## Nota ao professor: Execute em um codespace, ja esta configurado


1. O exemplo abaixo apresenta uma classe que tem como tipo de atributo uma String, utilizando o conceito de Generics crie uma classe que seja capaz de ser genérica, portanto, armazene qualquer tipo. Crie a classe e o Main, demonstrando no Main pelo menos a utilização com três tipos diferentes (objetos do Java e pelo menos um que você criou).

``` java
// Classe 
public class MeuString {

  private String str; 
  public MeuString(String str) {
    dado = str;
  } 

  public String getStr() {
    return str;
  }

}

// Main Meu
String d = new MeuString(“Oi”); 
String x = d.getStr();
```


2. Um software já implantado de uma comércio de produtos tem como id de produto o tipo Integer, porém com as ampliações e novas vendas do software alguns novos clientes usam o id como tipo String. Os atributos da classe são apresentados abaixo: Produto (id, valor, dataFabricação, dataVencimento) Recrie a classe Produto usando Generics permitindo assim que o id possa ser Integer ou String dependendo da utilização em cada um dos clientes, também crie o Main mostrando as duas utilizações.

3. Uma classe de Pedido deve conter uma lista de Produtos e ter os métodos de adicionar e mostrar lista de Produtos. Mas os produtos desta lista só podem ser produtos que herdam caracterı́sticas da classe ProdutoX (classe que você irá criar e definir atributos mı́nimos ao seu critério). Crie a classe ProdutoX, Pedido e o Main demonstrando a utilização dos dois métodos de Pedido.

4. Crie uma estrutura em uma classe onde ela seja capaz de armazenar uma lista de chave e valor, onde a chave é do tipo String e deve ser única dentro da lista. Com isso o método de add deve retornar true caso tenha conseguido inserir chave e valor e false caso não tenha inserido pois já existia uma chave igual. Outro método necessário é o de busca pela chave, este deve retornar chave e valor. Lembrando que a chave é String, porém o valor é Generic. Crie também o Main testando todas as condições. Não
use as estrutura de dados já existentes no Java (List e ArrayList são permitidos usar)

5. Pesquisar sobre o uso de Wildcard (?) e criar um exemplo de cada um dos tipos.