package cl.tarrobuild.provider.dto;

public class ProviderRequest {

    private String name;

    private String contact;

    private String website;

    private Boolean isActive;

    public ProviderRequest() {
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