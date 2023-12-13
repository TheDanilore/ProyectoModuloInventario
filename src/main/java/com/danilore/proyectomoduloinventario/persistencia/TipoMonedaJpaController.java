/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danilore.proyectomoduloinventario.persistencia;

import com.danilore.proyectomoduloinventario.logica.TipoMoneda;
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
public class TipoMonedaJpaController implements Serializable {

    public TipoMonedaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
        
    public TipoMonedaJpaController() {
        emf = Persistence.createEntityManagerFactory("JavaWebPU");
    }

    public void create(TipoMoneda tipoMoneda) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tipoMoneda);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TipoMoneda tipoMoneda) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tipoMoneda = em.merge(tipoMoneda);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = tipoMoneda.getId_tipo_moneda();
                if (findTipoMoneda(id) == null) {
                    throw new NonexistentEntityException("The tipoMoneda with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TipoMoneda tipoMoneda;
            try {
                tipoMoneda = em.getReference(TipoMoneda.class, id);
                tipoMoneda.getId_tipo_moneda();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipoMoneda with id " + id + " no longer exists.", enfe);
            }
            em.remove(tipoMoneda);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TipoMoneda> findTipoMonedaEntities() {
        return findTipoMonedaEntities(true, -1, -1);
    }

    public List<TipoMoneda> findTipoMonedaEntities(int maxResults, int firstResult) {
        return findTipoMonedaEntities(false, maxResults, firstResult);
    }

    private List<TipoMoneda> findTipoMonedaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TipoMoneda.class));
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

    public TipoMoneda findTipoMoneda(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TipoMoneda.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipoMonedaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TipoMoneda> rt = cq.from(TipoMoneda.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
