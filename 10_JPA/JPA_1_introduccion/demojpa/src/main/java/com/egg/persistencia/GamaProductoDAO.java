package com.egg.persistencia;


import com.egg.entidades.GamaProducto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class GamaProductoDAO {


    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPU");
    private final EntityManager em = emf.createEntityManager();


    public void guardaEmpleado(GamaProducto gamaProducto) throws Exception {
        em.getTransaction().begin();
        em.persist(gamaProducto);
        em.getTransaction().commit();
    }


}