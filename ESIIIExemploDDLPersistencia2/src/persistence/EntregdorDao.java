package persistence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import model.Atendente;
import model.Entregador;

public class EntregdorDao implements IObjDao<Entregador> {

	private SessionFactory sf;

	public EntregdorDao(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public void insere(Entregador t) {
		EntityManager entityManager = sf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(t);
		transaction.commit();
	}

	@Override
	public void modifica(Entregador t) {
		EntityManager entityManager = sf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.merge(t);
		transaction.commit();
	}

	@Override
	public void remove(Entregador t) {
		EntityManager entityManager = sf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.remove(t);
		transaction.commit();

	}

	@Override
	public Entregador busca(Entregador t) {
		EntityManager entityManager = sf.createEntityManager();
		t = entityManager.find(Entregador.class, t.getId());
		return t;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Entregador> lista() {
		List<Entregador> entregadores = new ArrayList<Entregador>();
		StringBuffer buffer = new StringBuffer();
		buffer.append("SELECT e.id, e.num_cnh, e.categoria_cnh ");
		buffer.append("f.nome, f.data_nascimento, f.salario, f.telefone ");
		buffer.append("FROM entregador e inner join funcionario f ");
		buffer.append("on e.id=f.id");
		buffer.append("ORDER BY id");
		EntityManager entityManager = sf.createEntityManager();
		Query query = entityManager.createNativeQuery(buffer.toString());
		List<Object[]> lista = query.getResultList();
		for (Object[] obj : lista) {
			Entregador entregador = new Entregador();
			entregador.setId(Integer.parseInt(obj[0].toString()));
			entregador.setNumCnh(obj[1].toString());
			entregador.setCategoriaCnh(obj[2].toString());
			entregador.setNome(obj[3].toString());
			entregador.setDataNascimento(LocalDate.parse(obj[4].toString()));
			entregador.setSalario(Float.parseFloat(obj[5].toString()));
			entregador.setTelefone(obj[6].toString());
			entregadores.add(entregador);
		}
		return entregadores;
	}

}
