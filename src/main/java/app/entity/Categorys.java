
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela CATEGORYS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"CATEGORYS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Categorys")
public class Categorys implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "name", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String name;


    /**
    * @generated
    */
    @Column(name = "icon", nullable = true, unique = false, insertable=true, updatable=true)
        
        private byte[] icon;


    /**
    * @generated
    */
    @Column(name = "color", nullable = true, unique = false, insertable=true, updatable=true)
        
        private byte[] color;


    /**
    * Construtor
    * @generated
    */
    public Categorys(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Categorys setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém name
    * return name
    * @generated
    */
    public java.lang.String getName() {
        return this.name;
    }

    /**
    * Define name
    * @param name name
    * @generated
    */
    public Categorys setName(java.lang.String name) {
        this.name = name;
        return this;
    }
    /**
    * Obtém icon
    * return icon
    * @generated
    */
    public byte[] getIcon() {
        return this.icon;
    }

    /**
    * Define icon
    * @param icon icon
    * @generated
    */
    public Categorys setIcon(byte[] icon) {
        this.icon = icon;
        return this;
    }
    /**
    * Obtém color
    * return color
    * @generated
    */
    public byte[] getColor() {
        return this.color;
    }

    /**
    * Define color
    * @param color color
    * @generated
    */
    public Categorys setColor(byte[] color) {
        this.color = color;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Categorys object = (Categorys)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}