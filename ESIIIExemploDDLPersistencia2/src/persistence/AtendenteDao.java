package persistence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import model.Atendente;

public class AtendenteDao implements IObjDao<Atendente> {

	private SessionFactory sf;

	public AtendenteDao(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public void insere(Atendente at) {
		EntityManager entityManager = sf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(at);
		transaction.commit();
	}

	@Override
	public void modifica(Atendente at) {
		EntityManager entityManager = sf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.merge(at);
		transaction.commit();

	}

	@Override
	public void remove(Atendente at) {
		EntityManager entityManager = sf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.remove(at);
		transaction.commit();

	}

	@Override
	public Atendente busca(Atendente at) {
		EntityManager entityManager = sf.createEntityManager();
		at = entityManager.find(Atendente.class, at.getId());
		return at;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Atendente> lista() {
		List<Atendente> atendentes = new ArrayList<Atendente>();
		StringBuffer buffer = new StringBuffer();
		buffer.append("SELECT a.id, a.hora_entrada, a.hora_saida, a.email"); 
		buffer.append("f.nome, f.data_nascimento, f.salario, f.telefone "); 
		buffer.append("FROM atentende a inner join funcionario f ");
		buffer.append("on a.id=f.id");
		buffer.append("ORDER BY id");
		EntityManager entityManager = sf.createEntityManager();
		Query query = entityManager.createNativeQuery(buffer.toString());
		List<Object[]> lista = query.getResultList();
		for (Object[] obj : lista) {
			Atendente atendente = new Atendente();
			atendente.setId(Integer.parseInt(obj[0].toString()));
			atendente.setHoraEntrada(Integer.parseInt((String) obj[1]));
			atendente.setHoraSaida(Integer.parseInt((String) obj[2]));
			atendente.setEmail(obj[3].toString());
			atendente.setNome(obj[4].toString());
			atendente.setDataNascimento(LocalDate.parse(obj[5].toString()));
			atendente.setSalario(Float.parseFloat(obj[6].toString()));
			atendente.setTelefone(obj[7].toString());
			atendentes.add(atendente);
		}
		return atendentes;
	}

}
