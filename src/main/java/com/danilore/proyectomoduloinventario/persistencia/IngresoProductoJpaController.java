/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danilore.proyectomoduloinventario.persistencia;

import com.danilore.proyectomoduloinventario.logica.IngresoProducto;
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
public class IngresoProductoJpaController implements Serializable {

    public IngresoProductoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public IngresoProductoJpaController() {
        emf = Persistence.createEntityManagerFactory("JavaWebPU");
    }

    public void create(IngresoProducto ingresoProducto) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(ingresoProducto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(IngresoProducto ingresoProducto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ingresoProducto = em.merge(ingresoProducto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = ingresoProducto.getId_ingreso_producto();
                if (findIngresoProducto(id) == null) {
                    throw new NonexistentEntityException("The ingresoProducto with id " + id + " no longer exists.");
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
            IngresoProducto ingresoProducto;
            try {
                ingresoProducto = em.getReference(IngresoProducto.class, id);
                ingresoProducto.getId_ingreso_producto();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The ingresoProducto with id " + id + " no longer exists.", enfe);
            }
            em.remove(ingresoProducto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<IngresoProducto> findIngresoProductoEntities() {
        return findIngresoProductoEntities(true, -1, -1);
    }

    public List<IngresoProducto> findIngresoProductoEntities(int maxResults, int firstResult) {
        return findIngresoProductoEntities(false, maxResults, firstResult);
    }

    private List<IngresoProducto> findIngresoProductoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(IngresoProducto.class));
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

    public IngresoProducto findIngresoProducto(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(IngresoProducto.class, id);
        } finally {
            em.close();
        }
    }

    public int getIngresoProductoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<IngresoProducto> rt = cq.from(IngresoProducto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
