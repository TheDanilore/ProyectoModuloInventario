/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danilore.proyectomoduloinventario.persistencia;

import com.danilore.proyectomoduloinventario.logica.TipoMovimiento;
import com.danilore.proyectomoduloinventario.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Danilore
 */
public class TipoMovimientoJpaController implements Serializable {

    public TipoMovimientoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public TipoMovimientoJpaController() {
        emf = Persistence.createEntityManagerFactory("JavaWebPU");
    }

    public void create(TipoMovimiento tipoMovimiento) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tipoMovimiento);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TipoMovimiento tipoMovimiento) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tipoMovimiento = em.merge(tipoMovimiento);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                char id = tipoMovimiento.getId_tipo_movimiento();
                if (findTipoMovimiento(id) == null) {
                    throw new NonexistentEntityException("The tipoMovimiento with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(char id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TipoMovimiento tipoMovimiento;
            try {
                tipoMovimiento = em.getReference(TipoMovimiento.class, id);
                tipoMovimiento.getId_tipo_movimiento();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipoMovimiento with id " + id + " no longer exists.", enfe);
            }
            em.remove(tipoMovimiento);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TipoMovimiento> findTipoMovimientoEntities() {
        return findTipoMovimientoEntities(true, -1, -1);
    }

    public List<TipoMovimiento> findTipoMovimientoEntities(int maxResults, int firstResult) {
        return findTipoMovimientoEntities(false, maxResults, firstResult);
    }

    private List<TipoMovimiento> findTipoMovimientoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TipoMovimiento.class));
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

    public TipoMovimiento findTipoMovimiento(char id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TipoMovimiento.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipoMovimientoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TipoMovimiento> rt = cq.from(TipoMovimiento.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
