package repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Comentario;
import model.Topico;
import model.Usuario;

public class RepositorioComentario {

	private static RepositorioComentario instance;
	protected EntityManager entityManager;

	public static RepositorioComentario getInstance() {
		if (instance == null) {
			instance = new RepositorioComentario();
		}

		return instance;
	}

	private RepositorioComentario() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("comentario");
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}

		return entityManager;
	}

	public Comentario getPorID(String id) {
		return entityManager.find(Comentario.class, Integer.parseInt(id));
	}
	
	public Topico getTopico(final int id) {
		return entityManager.find(Topico.class, id);
	}
	
	public Usuario getUsuario(final int id) {
		return entityManager.find(Usuario.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Comentario> getTodos() {
		Query query = entityManager.createQuery("from "+Comentario.class.getName()+"");
		List<Comentario> listaComentario = query.getResultList();
		return listaComentario;
	}

	public void Salvar(Comentario Comentario) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(Comentario);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void Editar(Comentario Comentario) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(Comentario);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void Excluir(Comentario Comentario) {
		try {
			entityManager.getTransaction().begin();
			Comentario = entityManager.find(Comentario.class, Comentario.getId());
			entityManager.remove(Comentario);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
}
