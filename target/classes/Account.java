package io.fabric8.quickstarts.cxf.jaxrs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Account")
public class Account {
    private long id;
    private String name;
    private String email;
    private String company;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }
}
