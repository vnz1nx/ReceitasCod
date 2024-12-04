package Receitas.com.br;

import java.sql.PreparedStatement;

public class IngredientesDB {

	public boolean insert(Ingredientes a) {
		try {
			String sql = "INSERT INTO ingrediente " +
		    "(quantidade,unidade,receita_id,produto_id)" +
			"VALUES (?, ?, ?, ?)";
			PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
			p.setLong(1, a.getQuantidade());
			p.setLong(2, a.getUnidade());
			p.setLong(3, a.getReceitaId());
			p.setLong(4, a.getProdutoId());
			p.execute();
			p.close();
			ConnectionFactory.close();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
		
		public boolean remove(Ingredientes a) {
			try {
				String sql = "DELETE FROM ingrediente " + 
			    "WHERE id = ? ";
				PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
				p.setInt(1, a.getId());
				p.execute();
				p.close();
				ConnectionFactory.close();
				return true;
			}catch(Exception ex) {
				return false;
			}
	}

}
