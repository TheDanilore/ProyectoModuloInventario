/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danilore.proyectomoduloinventario.persistencia;

import com.danilore.proyectomoduloinventario.logica.GuiaRemisionSalida;
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
public class GuiaRemisionSalidaJpaController implements Serializable {

    public GuiaRemisionSalidaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public GuiaRemisionSalidaJpaController() {
        emf = Persistence.createEntityManagerFactory("JavaWebPU");
    }

    public void create(GuiaRemisionSalida guiaRemisionSalida) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(guiaRemisionSalida);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(GuiaRemisionSalida guiaRemisionSalida) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            guiaRemisionSalida = em.merge(guiaRemisionSalida);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = guiaRemisionSalida.getId();
                if (findGuiaRemisionSalida(id) == null) {
                    throw new NonexistentEntityException("The guiaRemisionSalida with id " + id + " no longer exists.");
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
            GuiaRemisionSalida guiaRemisionSalida;
            try {
                guiaRemisionSalida = em.getReference(GuiaRemisionSalida.class, id);
                guiaRemisionSalida.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The guiaRemisionSalida with id " + id + " no longer exists.", enfe);
            }
            em.remove(guiaRemisionSalida);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<GuiaRemisionSalida> findGuiaRemisionSalidaEntities() {
        return findGuiaRemisionSalidaEntities(true, -1, -1);
    }

    public List<GuiaRemisionSalida> findGuiaRemisionSalidaEntities(int maxResults, int firstResult) {
        return findGuiaRemisionSalidaEntities(false, maxResults, firstResult);
    }

    private List<GuiaRemisionSalida> findGuiaRemisionSalidaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(GuiaRemisionSalida.class));
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

    public GuiaRemisionSalida findGuiaRemisionSalida(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(GuiaRemisionSalida.class, id);
        } finally {
            em.close();
        }
    }

    public int getGuiaRemisionSalidaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<GuiaRemisionSalida> rt = cq.from(GuiaRemisionSalida.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
