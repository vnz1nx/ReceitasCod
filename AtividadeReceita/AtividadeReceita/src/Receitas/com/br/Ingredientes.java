package Receitas.com.br;

public class Ingredientes {

	private int unidade,quantidade,id,ReceitaId,ProdutoId;

	public Ingredientes() {
		super();
		this.unidade = unidade;
		this.quantidade = quantidade;
		this.id = id;
		this.ProdutoId = ProdutoId;
		this.ReceitaId = ReceitaId;
	}

	public int getUnidade() {
		return unidade;
	}

	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getReceitaId() {
		return ReceitaId;
	}

	public void setReceitaId(int receitaId) {
		ReceitaId = receitaId;
	}

	public int getProdutoId() {
		return ProdutoId;
	}

	public void setProdutoId(int produtoId) {
		ProdutoId = produtoId;
	}
	
	
	
	
	
	
}
