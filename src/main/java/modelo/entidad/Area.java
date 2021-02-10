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
@Table(name = "AREA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Area.findAll", query = "SELECT a FROM Area a")
    , @NamedQuery(name = "Area.findByIdare", query = "SELECT a FROM Area a WHERE a.idare = :idare")
    , @NamedQuery(name = "Area.findByNomare", query = "SELECT a FROM Area a WHERE a.nomare = :nomare")
    , @NamedQuery(name = "Area.findByIdaregen", query = "SELECT a FROM Area a WHERE a.idaregen = :idaregen")})
public class Area implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDARE")
    private BigDecimal idare;
    @Size(max = 100)
    @Column(name = "NOMARE")
    private String nomare;
    @Column(name = "IDAREGEN")
    private BigInteger idaregen;

    public Area() {
    }

    public Area(BigDecimal idare) {
        this.idare = idare;
    }

    public BigDecimal getIdare() {
        return idare;
    }

    public void setIdare(BigDecimal idare) {
        this.idare = idare;
    }

    public String getNomare() {
        return nomare;
    }

    public void setNomare(String nomare) {
        this.nomare = nomare;
    }

    public BigInteger getIdaregen() {
        return idaregen;
    }

    public void setIdaregen(BigInteger idaregen) {
        this.idaregen = idaregen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idare != null ? idare.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Area)) {
            return false;
        }
        Area other = (Area) object;
        if ((this.idare == null && other.idare != null) || (this.idare != null && !this.idare.equals(other.idare))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidad.Area[ idare=" + idare + " ]";
    }
    
}
