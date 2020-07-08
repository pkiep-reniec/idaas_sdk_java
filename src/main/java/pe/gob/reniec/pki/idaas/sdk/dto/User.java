package pe.gob.reniec.pki.idaas.sdk.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Miguel Pazo (http://miguelpazo.com)
 */
public class User {

    @JsonProperty("doc")
    private String doc;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("ruc")
    private String ruc;
    @JsonProperty("sub")
    private String sub;

    public User() {
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    @Override
    public String toString() {
        return "User{" +
                "doc='" + doc + '\'' +
                ", firstName='" + firstName + '\'' +
                ", ruc='" + ruc + '\'' +
                ", sub='" + sub + '\'' +
                '}';
    }
}