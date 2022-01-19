package country.model;



import javax.persistence.*;
import java.util.List;


@Entity
public class Continent {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String code;

    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="CONTINENT_ID")
    private List<Country> countries;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }


}
