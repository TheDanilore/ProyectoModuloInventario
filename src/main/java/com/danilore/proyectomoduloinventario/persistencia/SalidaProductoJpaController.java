/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danilore.proyectomoduloinventario.persistencia;

import com.danilore.proyectomoduloinventario.logica.SalidaProducto;
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
public class SalidaProductoJpaController implements Serializable {

    public SalidaProductoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public SalidaProductoJpaController() {
        emf = Persistence.createEntityManagerFactory("JavaWebPU");
    }

    public void create(SalidaProducto salidaProducto) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(salidaProducto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(SalidaProducto salidaProducto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            salidaProducto = em.merge(salidaProducto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = salidaProducto.getId_salida_producto();
                if (findSalidaProducto(id) == null) {
                    throw new NonexistentEntityException("The salidaProducto with id " + id + " no longer exists.");
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
            SalidaProducto salidaProducto;
            try {
                salidaProducto = em.getReference(SalidaProducto.class, id);
                salidaProducto.getId_salida_producto();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The salidaProducto with id " + id + " no longer exists.", enfe);
            }
            em.remove(salidaProducto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<SalidaProducto> findSalidaProductoEntities() {
        return findSalidaProductoEntities(true, -1, -1);
    }

    public List<SalidaProducto> findSalidaProductoEntities(int maxResults, int firstResult) {
        return findSalidaProductoEntities(false, maxResults, firstResult);
    }

    private List<SalidaProducto> findSalidaProductoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(SalidaProducto.class));
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

    public SalidaProducto findSalidaProducto(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(SalidaProducto.class, id);
        } finally {
            em.close();
        }
    }

    public int getSalidaProductoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<SalidaProducto> rt = cq.from(SalidaProducto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
