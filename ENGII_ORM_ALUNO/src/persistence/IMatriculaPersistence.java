package persistence;

import java.sql.SQLException;
import java.util.List;

public interface IMatriculaPersistence<T>{

	public void insert(T t) throws SQLException;
	public void delete(T t) throws SQLException;
	public List<T> selectAll(T t);
}
