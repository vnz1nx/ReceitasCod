package Receitas.com.br;

import java.sql.PreparedStatement;

public class ReceitaDB {

	public boolean insert(Receita a) {
		try {
			String sql = "INSERT INTO receita " +
		    "(nome, tipo) " +
			"VALUES (?, ?)";
			PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
			p.setString(1, a.getNome());
			p.setString(2, a.getTipo());
			p.execute();
			p.close();
			ConnectionFactory.close();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
		
		public boolean remove(Receita a) {
			try {
				String sql = "DELETE FROM receita " + 
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
