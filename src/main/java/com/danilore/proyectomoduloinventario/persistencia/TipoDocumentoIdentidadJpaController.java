/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danilore.proyectomoduloinventario.persistencia;

import com.danilore.proyectomoduloinventario.logica.TipoDocumentoIdentidad;
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
public class TipoDocumentoIdentidadJpaController implements Serializable {

    public TipoDocumentoIdentidadJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public TipoDocumentoIdentidadJpaController() {
        emf = Persistence.createEntityManagerFactory("JavaWebPU");
    }

    public void create(TipoDocumentoIdentidad tipoDocumentoIdentidad) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tipoDocumentoIdentidad);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TipoDocumentoIdentidad tipoDocumentoIdentidad) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tipoDocumentoIdentidad = em.merge(tipoDocumentoIdentidad);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = tipoDocumentoIdentidad.getId_tipo_documento_identidad();
                if (findTipoDocumentoIdentidad(id) == null) {
                    throw new NonexistentEntityException("The tipoDocumentoIdentidad with id " + id + " no longer exists.");
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
            TipoDocumentoIdentidad tipoDocumentoIdentidad;
            try {
                tipoDocumentoIdentidad = em.getReference(TipoDocumentoIdentidad.class, id);
                tipoDocumentoIdentidad.getId_tipo_documento_identidad();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipoDocumentoIdentidad with id " + id + " no longer exists.", enfe);
            }
            em.remove(tipoDocumentoIdentidad);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TipoDocumentoIdentidad> findTipoDocumentoIdentidadEntities() {
        return findTipoDocumentoIdentidadEntities(true, -1, -1);
    }

    public List<TipoDocumentoIdentidad> findTipoDocumentoIdentidadEntities(int maxResults, int firstResult) {
        return findTipoDocumentoIdentidadEntities(false, maxResults, firstResult);
    }

    private List<TipoDocumentoIdentidad> findTipoDocumentoIdentidadEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TipoDocumentoIdentidad.class));
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

    public TipoDocumentoIdentidad findTipoDocumentoIdentidad(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TipoDocumentoIdentidad.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipoDocumentoIdentidadCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TipoDocumentoIdentidad> rt = cq.from(TipoDocumentoIdentidad.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
