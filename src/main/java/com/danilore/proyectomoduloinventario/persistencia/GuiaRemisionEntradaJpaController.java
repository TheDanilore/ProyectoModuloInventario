/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danilore.proyectomoduloinventario.persistencia;

import com.danilore.proyectomoduloinventario.logica.GuiaRemisionEntrada;
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
public class GuiaRemisionEntradaJpaController implements Serializable {

    public GuiaRemisionEntradaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public GuiaRemisionEntradaJpaController() {
        emf = Persistence.createEntityManagerFactory("JavaWebPU");
    }

    public void create(GuiaRemisionEntrada guiaRemisionEntrada) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(guiaRemisionEntrada);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(GuiaRemisionEntrada guiaRemisionEntrada) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            guiaRemisionEntrada = em.merge(guiaRemisionEntrada);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = guiaRemisionEntrada.getId();
                if (findGuiaRemisionEntrada(id) == null) {
                    throw new NonexistentEntityException("The guiaRemisionEntrada with id " + id + " no longer exists.");
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
            GuiaRemisionEntrada guiaRemisionEntrada;
            try {
                guiaRemisionEntrada = em.getReference(GuiaRemisionEntrada.class, id);
                guiaRemisionEntrada.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The guiaRemisionEntrada with id " + id + " no longer exists.", enfe);
            }
            em.remove(guiaRemisionEntrada);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<GuiaRemisionEntrada> findGuiaRemisionEntradaEntities() {
        return findGuiaRemisionEntradaEntities(true, -1, -1);
    }

    public List<GuiaRemisionEntrada> findGuiaRemisionEntradaEntities(int maxResults, int firstResult) {
        return findGuiaRemisionEntradaEntities(false, maxResults, firstResult);
    }

    private List<GuiaRemisionEntrada> findGuiaRemisionEntradaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(GuiaRemisionEntrada.class));
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

    public GuiaRemisionEntrada findGuiaRemisionEntrada(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(GuiaRemisionEntrada.class, id);
        } finally {
            em.close();
        }
    }

    public int getGuiaRemisionEntradaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<GuiaRemisionEntrada> rt = cq.from(GuiaRemisionEntrada.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
