public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = sc.nextLine();
		int idade = sc.nextInt();
		Pessoa pessoa1 = new Pessoa(nome, idade);
		System.out.println(pessoa1);
		pessoa1.setIdade(sc.nextInt());
		System.out.println(pessoa1);
		sc.close();
	}
}