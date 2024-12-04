package Receitas.com.br;

import java.sql.PreparedStatement;

public class ProdutoDB {

	public boolean insert(Produto a) {
		try {
			String sql = "INSERT INTO produto " +
			"(descricao) " +
			"VALUES (?)";
			PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
			p.setString(1, a.getDescricao());
			p.execute();
			p.close();
			ConnectionFactory.close();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
		
		public boolean remove(Produto a) {
			try {
				String sql = "DELETE FROM produto " + 
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
