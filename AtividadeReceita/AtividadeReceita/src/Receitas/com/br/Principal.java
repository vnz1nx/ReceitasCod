package Receitas.com.br;
import java.util.Scanner;

public class Principal {

    public Principal() {
        Scanner s = new Scanner(System.in);
        int op = -1;
        while (true) {
        	if(op == 4) {
        		break;
        	}
        	else {
            System.out.println("Digite uma opção:");
            System.out.println("1: Receita");
            System.out.println("2: Produto");
            System.out.println("3: Ingrediente");
            System.out.println("4: Sair");
            op = s.nextInt();
            s.nextLine(); // Consumir a quebra de linha após nextInt()
            switch (op) {
                case 0:
                    return;
                case 1:
                    receita();
                    System.out.println("Cadastrado com sucesso!!!");
                    break;
                case 2:
                    produto();
                    System.out.println("Excluído com sucesso!!!");
                    break;
                case 3:
                    ingrediente();
                    System.out.println("Alterado com sucesso!!!");
                    break;
                case 4:
                    System.out.println("Você saiu!");
                    break;
                	}
        	}
            }
        }
    

    public void receita() {
        Scanner s = new Scanner(System.in);
        int op = -1;
        while (true) {
            System.out.println("Digite uma opção:");
            System.out.println("1: Cadastrar");
            System.out.println("2: Excluir");
            System.out.println("3: Voltar");
            op = s.nextInt();
            s.nextLine(); // Consumir a quebra de linha após nextInt()
            switch (op) {
                case 0:
                    return;
                case 1:
                    Receita a = new Receita();
                    System.out.println("Nome: ");
                    a.setNome(s.nextLine());
                    System.out.println("Adicione o tipo: ");
                    a.setTipo(s.nextLine());
                    ReceitaDB DB = new ReceitaDB();
                    DB.insert(a);
                    System.out.println("Cadastrado com sucesso!!!");
                    break;
                case 2:
                	Receita removea = new Receita();
            		System.out.println("Digite o ID: ");
            		removea.setId(s.nextInt());
            		ReceitaDB remove = new ReceitaDB();
            		remove.remove(removea);
                    System.out.println("Excluído com sucesso!!!");
                    break;
                case 3:
                    System.out.println("Você voltou!");
                    break;
            }
            break;
        }
    }

    public void produto() {
        Scanner s = new Scanner(System.in);
        int op = -1;
        while (true) {
        	if(op == 3) {
        		break;
        	}else {
            System.out.println("Digite uma opção:");
            System.out.println("1: Cadastrar");
            System.out.println("2: Excluir");
            System.out.println("3: Voltar");
            op = s.nextInt();
            s.nextLine(); // Consumir a quebra de linha após nextInt()
            switch (op) {
                case 0:
                    return;
                case 1:
                    Produto b = new Produto();
                    System.out.println("Descreva o produto: ");
                    b.setDescricao(s.nextLine());
                    ProdutoDB PD = new ProdutoDB();
                    PD.insert(b);
                    System.out.println("Cadastrado com sucesso!!!");
                    break;
                case 2:
                	Produto removea = new Produto();
            		System.out.println("Digite o ID: ");
            		removea.setId(s.nextInt());
            		ProdutoDB remove = new ProdutoDB();
            		remove.remove(removea);
                    System.out.println("Excluído com sucesso!!!");
                    break;
                case 3:
                    System.out.println("Você saiu!");
                    break;
            }
        	}
        }
    }

    public void ingrediente() {
        Scanner s = new Scanner(System.in);
        int op = -1;
        while (true) {
            System.out.println("Digite uma opção:");
            System.out.println("1: Cadastrar");
            System.out.println("2: Excluir");
            System.out.println("3: Voltar");
            op = s.nextInt();
            s.nextLine(); // Consumir a quebra de linha após nextInt()
            switch (op) {
                case 0:
                    return;
                case 1:
                    Ingredientes a = new Ingredientes();
                    System.out.println("Insira a quantidade: ");
                    a.setQuantidade(s.nextInt());
                    System.out.println("Insira a unidade: ");
                    a.setUnidade(s.nextInt());
                    System.out.println("Insira o ID da receita: ");
                    a.setReceitaId(s.nextInt());
                    System.out.println("Insira o Id do produto: ");
                    a.setProdutoId(s.nextInt());
                    IngredientesDB DB = new IngredientesDB();
                    DB.insert(a);
                    System.out.println("Cadastrado com sucesso!!!");
                    break;
                case 2:
                	Ingredientes removea = new Ingredientes();
            		System.out.println("Digite o ID: ");
            		removea.setId(s.nextInt());
            		IngredientesDB removeDB = new IngredientesDB();
            		removeDB.remove(removea);
                    System.out.println("Excluído com sucesso!!!");
                    break;
                case 3:
                    System.out.println("Você voltou!");
                    break;
            }
            break;
        }
    }

    public static void main(String[] args) {
        new Principal();
    }
}
