package repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Topico;
import model.Usuario;

public class RepositorioTopico {

	private static RepositorioTopico instance;
	protected EntityManager entityManager;

	public static RepositorioTopico getInstance() {
		if (instance == null) {
			instance = new RepositorioTopico();
		}

		return instance;
	}

	private RepositorioTopico() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("topico");
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}

		return entityManager;
	}

	public Topico getPorID(String id_topico) {
		return entityManager.find(Topico.class, Integer.parseInt(id_topico));
	}
	
	public Usuario getUsuario(int id) {
		return entityManager.find(Usuario.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Topico> getTodos() {
		Query query = entityManager.createQuery("from "+Topico.class.getName()+"");
		List<Topico> listaTopico = query.getResultList();
		return listaTopico;
	}

	public void Salvar(Topico Topico) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(Topico);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void Editar(Topico Topico) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(Topico);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void Excluir(Topico Topico) {
		try {
			entityManager.getTransaction().begin();
			Topico = entityManager.find(Topico.class, Topico.getId());
			entityManager.remove(Topico);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
}
