package utility;

import java.sql.*;
import java.util.*;

import model.Account;
import model.Dipendente;

public class Crud implements ICrud{

	public void create(Account u) {
		Connection conn = Connettore.getInstance().apriConnessione();
		String insertSQL = "insert into utente (username, passw) values (?,?)";
		PreparedStatement ps = null;
		try {
			ps = Connettore.getInstance().apriConnessione().prepareStatement(insertSQL);
			ps.setString(1,u.getUsername());
			ps.setString(2, u.getPassw());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			};
		}
	}
	public Dipendente read(Integer i) {
		Connection conn = Connettore.getInstance().apriConnessione();
		String insertSQL = "select * from v_account_dipendente where id = ?";
		PreparedStatement ps = null;
		Account u = null;
		Dipendente d = null;
		try {
			ps = conn.prepareStatement(insertSQL);
			ps.setInt(1, i);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				u = new Account();
				d = new Dipendente();
				u.setUsername(rs.getString("username"));
				u.setPassw(rs.getString("passw"));
				d.setAccount(u);
				d.setId(rs.getInt("id"));
				d.setNome(rs.getString("nome"));
				d.setCognome(rs.getString("cognome"));
				d.setCodice_fiscale(rs.getString("codice_fiscale"));
				d.setStipendio(rs.getDouble("stipendio"));
			}

		} catch(SQLException e){
			e.printStackTrace();
		}
		finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			};
		}
		return d;
	}
	public List<Account> readList(){
		List<Account> utenti = new ArrayList<>();
		Connection conn = Connettore.getInstance().apriConnessione();
		String insertSQL = "select * from utente";
		PreparedStatement ps = null;
		try {
			Account u = new Account();
			ps = conn.prepareStatement(insertSQL);
			ResultSet rs = ps.executeQuery(insertSQL);
			while(rs.next()) {
				u.setId(rs.getInt("id"));
				u.setUsername(rs.getString("username"));
				u.setPassw(rs.getString("passw"));
				utenti.add(u);
			}
			return utenti;
		} catch(SQLException e){
			e.printStackTrace();
		}
		finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			};
		}
		return null;
	}
	public void update(Account u) {
		Connection conn = Connettore.getInstance().apriConnessione();
		String comandoSQL = "update utente set username = ?, passw = ? where id = ?" ;
		PreparedStatement ps = null;
			try {
				ps = conn.prepareStatement(comandoSQL);
				ps.setString(1, u.getUsername());
				ps.setString(2, u.getPassw());
				ps.setInt(3, u.getId());			
				ps.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					ps.close();
					Connettore.getInstance().apriConnessione().close();
				} catch (SQLException e) {
					e.printStackTrace();
				};
			}
	}

	public void cancel(Integer i) {
		Connection conn = Connettore.getInstance().apriConnessione();
		String insertSQL = "delete from utente where id = ?";
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(insertSQL);
			ps.setInt(1, i);
			ps.execute();
		} catch(SQLException e){
			e.printStackTrace();
		}
		finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			};
		}
	}
}
