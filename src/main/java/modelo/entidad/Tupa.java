/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author carlos
 */
@Entity
@Table(name = "TUPA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tupa.findAll", query = "SELECT t FROM Tupa t")
    , @NamedQuery(name = "Tupa.findByIdtup", query = "SELECT t FROM Tupa t WHERE t.idtup = :idtup")
    , @NamedQuery(name = "Tupa.findByDentup", query = "SELECT t FROM Tupa t WHERE t.dentup = :dentup")
    , @NamedQuery(name = "Tupa.findByPlatup", query = "SELECT t FROM Tupa t WHERE t.platup = :platup")
    , @NamedQuery(name = "Tupa.findByIdare", query = "SELECT t FROM Tupa t WHERE t.idare = :idare")})
public class Tupa implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTUP")
    private BigDecimal idtup;
    @Size(max = 120)
    @Column(name = "DENTUP")
    private String dentup;
    @Column(name = "PLATUP")
    private BigInteger platup;
    @Column(name = "IDARE")
    private BigInteger idare;

    public Tupa() {
    }

    public Tupa(BigDecimal idtup) {
        this.idtup = idtup;
    }

    public BigDecimal getIdtup() {
        return idtup;
    }

    public void setIdtup(BigDecimal idtup) {
        this.idtup = idtup;
    }

    public String getDentup() {
        return dentup;
    }

    public void setDentup(String dentup) {
        this.dentup = dentup;
    }

    public BigInteger getPlatup() {
        return platup;
    }

    public void setPlatup(BigInteger platup) {
        this.platup = platup;
    }

    public BigInteger getIdare() {
        return idare;
    }

    public void setIdare(BigInteger idare) {
        this.idare = idare;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtup != null ? idtup.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tupa)) {
            return false;
        }
        Tupa other = (Tupa) object;
        if ((this.idtup == null && other.idtup != null) || (this.idtup != null && !this.idtup.equals(other.idtup))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidad.Tupa[ idtup=" + idtup + " ]";
    }
    
}
