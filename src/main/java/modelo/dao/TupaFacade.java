/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.entidad.Tupa;

/**
 *
 * @author carlos
 */
@Stateless
public class TupaFacade extends AbstractFacade<Tupa> {

    @PersistenceContext(unitName = "DB_Tramite")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TupaFacade() {
        super(Tupa.class);
    }
    
}
