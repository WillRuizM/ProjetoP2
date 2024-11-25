package bdruiz.crud.model;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class ClienteDAO {
    @Autowired
	DataSource dataSource;
	
	JdbcTemplate jdbc;
	
	@PostConstruct
	private void initialize() {
		jdbc = new JdbcTemplate(dataSource);
	}

    public void inserir(Cliente cli){
        String sql = "INSERT INTO cliente(nome,cpf) VALUES (?,?);";
        Object[] parametros = new Object[2];
        parametros[0] = cli.getNome();
        parametros[1] = cli.getCpf();
        jdbc.update(sql,parametros);
    }

    public List< Map<String,Object>> obterTodosClientes(){
            String sql = "Select * from cliente;";
            return jdbc.queryForList(sql);
        
    }

    public void atualizarCliente(int id, Cliente cli){
        String sql = "UPDATE cliente SET";
        sql += " nome = ?, cpf =? WHERE id = ?";
        jdbc.update (sql, cli.getNome(), cli.getCpf(), id);

    }

    public Cliente obterCliente(int id){
        String sql = "Select * from cliente WHERE id = ?";
        return Tool.converterCliente(jdbc.queryForMap(sql, id));
    }

    public void deletarCliente(int id){
        String sql = "DELETE FROM cliente WHERE id = ?";
        jdbc.update(sql,id);
    }

}
