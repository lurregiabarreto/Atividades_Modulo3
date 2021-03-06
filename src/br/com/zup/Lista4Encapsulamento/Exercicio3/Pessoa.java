package br.com.zup.Lista4Encapsulamento.Exercicio3;

// Atributos
public class Pessoa {

    private String nome;
    private Data dataDeNascimento;
    private double altura;
    private int idade;

    // Métodos Construtores
    public Pessoa() {

    }

    public Pessoa(String nome, Data dataDeNascimento, double altura) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
    }

    public Pessoa(Data dataDeNascimento) {
    }

    // Criando getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Data dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    // Criando método para calcular idade da pessoa
    public void calcularIdade(int anoAtual) {
        int idade = anoAtual - dataDeNascimento.getAno();
        this.idade = idade;
        // return idade;
    }

    // Classe responsável por imprimir os dados
    public void imprimirDados() {
        System.out.println("Nome da pessoa: " + nome);
        System.out.println("Data de nascimento da pessoa: " + dataDeNascimento.getDia() + "/" + dataDeNascimento.getMes() + "/" + dataDeNascimento.getAno());
        System.out.println("Altura da pessoa: " + altura);
        System.out.println("Idade " + nome + " é: " + idade+ " anos");
    }


}
