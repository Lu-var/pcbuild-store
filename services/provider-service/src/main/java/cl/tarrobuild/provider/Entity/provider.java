
package cl.tarrobuild.provider.Entity;


@Entity
@Table(name = "providers")
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String contact;

    private String website;

    private Boolean isActive = true;

    public Provider() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getWebsite() {
        return website;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setIsActive(Boolean active) {
        isActive = active;
    }
}