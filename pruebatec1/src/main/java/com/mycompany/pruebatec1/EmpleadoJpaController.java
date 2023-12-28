package com.mycompany.pruebatec1;

import com.mycompany.pruebatec1.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


//Controlador JPA para la entidad Empleado, encargado de realizar operaciones CRUD en la base de datos.
public class EmpleadoJpaController implements Serializable {

    //Factoría de EntityManager para gestionar la persistencia
    private EntityManagerFactory emf = null;

    //Constructor de la clase que inicializa la factoría de EntityManager.
    public EmpleadoJpaController() {
        emf = Persistence.createEntityManagerFactory("com.mycompany_pruebatec1_jar_1.0-SNAPSHOTPU");
    }

    
    
    //METODOS
    //Método para obtener un EntityManager.
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    //Método para crear un nuevo empleado en la base de datos.
    public void create(Empleado empleado) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(empleado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    //Método para editar un empleado existente en la base de datos.
    public void edit(Empleado empleado) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            empleado = em.merge(empleado);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = empleado.getId();
                if (findEmpleado(id) == null) {
                    throw new NonexistentEntityException("The empleado with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    //Método para eliminar un empleado de la base de datos por su ID.
    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Empleado empleado;
            try {
                empleado = em.getReference(Empleado.class, id);
                empleado.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The empleado with id " + id + " no longer exists.", enfe);
            }
            em.remove(empleado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    //Método para buscar empleados por cargo en la base de datos.
    public List<Empleado> findEmpleadoByCargo(String cargo) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Empleado> query = em.createQuery("SELECT e FROM Empleado e WHERE e.cargo = :cargo", Empleado.class);
            query.setParameter("cargo", cargo);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    //Método para obtener una lista de empleados paginada.
    public List<Empleado> findEmpleadoEntities(int maxResults, int firstResult) {
        return findEmpleadoEntities(false, maxResults, firstResult);
    }

    //Método privado para obtener la lista de empleados paginada
    private List<Empleado> findEmpleadoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Empleado.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    //Método para buscar un empleado por su ID.
    public Empleado findEmpleado(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Empleado.class, id);
        } finally {
            em.close();
        }
    }

    //Método para obtener el número total de empleados en la base de datos.
    public int getEmpleadoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Empleado> rt = cq.from(Empleado.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    Object buscarEmpleadoPorNombreCargo(String nombre, String cargo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
