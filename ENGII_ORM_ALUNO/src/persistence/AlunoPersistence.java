package persistence;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import model.Aluno;

public class AlunoPersistence implements IAlunoDisciplina<Aluno>{

	
	
	
	private SessionFactory sf;

	public AlunoPersistence(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public void insert(Aluno aluno) throws SQLException {
		EntityManager entityManager = sf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(aluno);
		transaction.commit();

	}

	@Override
	public void update(Aluno aluno) throws SQLException {
		EntityManager entityManager = sf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.merge(aluno);
		transaction.commit();
	}

	@Override
	public void delete(Aluno aluno) throws SQLException {
		EntityManager entityManager = sf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.remove(aluno);
		transaction.commit();
	}

	@Override
	public Aluno selectOne(Aluno aluno) throws SQLException {
		EntityManager entityManager = sf.createEntityManager();
		aluno = entityManager.find(Aluno.class, aluno.getRa());
		return aluno;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Aluno> selectAll() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT * ");
		sql.append("FROM aluno");
		EntityManager entityManager = sf.createEntityManager();
		Query query = entityManager.createNativeQuery(sql.toString());
		List<Object[]> alunosResultSet = query.getResultList();
		List<Aluno> aluno = new ArrayList<Aluno>();
		for (Object[] o : alunosResultSet) {
			Aluno al = new Aluno();
			al.setRa(o[0].toString());
			al.setEmail(o[1].toString());
			al.setNome(o[2].toString());
			al.setPosicaoVestibular(Integer.parseInt(o[3].toString()));
			
			aluno.add(al);
	}
		return aluno;
	
}
}
