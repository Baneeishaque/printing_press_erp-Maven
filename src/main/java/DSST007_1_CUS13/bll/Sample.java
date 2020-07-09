package DSST007_1_CUS13.bll;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.AUTO;
import jakarta.persistence.Id;
import java.io.Serializable;

@Entity
public class Sample implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    
    String value1;
    String value2;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getValue1()
    {
        return value1;
    }

    public void setValue1(String value1)
    {
        this.value1 = value1;
    }

    public String getValue2()
    {
        return value2;
    }

    public void setValue2(String value2)
    {
        this.value2 = value2;
    }

    
    
    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sample))
        {
            return false;
        }
        Sample other = (Sample) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "DSST007_1_CUS13.bll.Sample[ id=" + id + " ]";
    }
    
}
