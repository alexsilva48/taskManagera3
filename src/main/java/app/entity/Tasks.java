
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
* Classe que representa a tabela TASKS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"TASKS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Tasks")
public class Tasks implements Serializable {
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
    @Column(name = "title", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String title;


    /**
    * @generated
    */
    @Column(name = "description", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String description;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "due_date", nullable = true, unique = false, insertable=true, updatable=true, columnDefinition = "TIMESTAMP")
        
        private java.util.Date due_date;


    /**
    * @generated
    */
    @Column(name = "completed", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean completed;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = true, unique = false, insertable=true, updatable=true, columnDefinition = "TIMESTAMP")
        
        private java.util.Date created_at;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = true, unique = false, insertable=true, updatable=true, columnDefinition = "TIMESTAMP")
        
        private java.util.Date updated_at;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private User user;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_categorys", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Categorys categorys;


    /**
    * Construtor
    * @generated
    */
    public Tasks(){
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
    public Tasks setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém title
    * return title
    * @generated
    */
    public java.lang.String getTitle() {
        return this.title;
    }

    /**
    * Define title
    * @param title title
    * @generated
    */
    public Tasks setTitle(java.lang.String title) {
        this.title = title;
        return this;
    }
    /**
    * Obtém description
    * return description
    * @generated
    */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
    * Define description
    * @param description description
    * @generated
    */
    public Tasks setDescription(java.lang.String description) {
        this.description = description;
        return this;
    }
    /**
    * Obtém due_date
    * return due_date
    * @generated
    */
    public java.util.Date getDue_date() {
        return this.due_date;
    }

    /**
    * Define due_date
    * @param due_date due_date
    * @generated
    */
    public Tasks setDue_date(java.util.Date due_date) {
        this.due_date = due_date;
        return this;
    }
    /**
    * Obtém completed
    * return completed
    * @generated
    */
    public java.lang.Boolean getCompleted() {
        return this.completed;
    }

    /**
    * Define completed
    * @param completed completed
    * @generated
    */
    public Tasks setCompleted(java.lang.Boolean completed) {
        this.completed = completed;
        return this;
    }
    /**
    * Obtém created_at
    * return created_at
    * @generated
    */
    public java.util.Date getCreated_at() {
        return this.created_at;
    }

    /**
    * Define created_at
    * @param created_at created_at
    * @generated
    */
    public Tasks setCreated_at(java.util.Date created_at) {
        this.created_at = created_at;
        return this;
    }
    /**
    * Obtém updated_at
    * return updated_at
    * @generated
    */
    public java.util.Date getUpdated_at() {
        return this.updated_at;
    }

    /**
    * Define updated_at
    * @param updated_at updated_at
    * @generated
    */
    public Tasks setUpdated_at(java.util.Date updated_at) {
        this.updated_at = updated_at;
        return this;
    }
    /**
    * Obtém user
    * return user
    * @generated
    */
    public User getUser() {
        return this.user;
    }

    /**
    * Define user
    * @param user user
    * @generated
    */
    public Tasks setUser(User user) {
        this.user = user;
        return this;
    }
    /**
    * Obtém categorys
    * return categorys
    * @generated
    */
    public Categorys getCategorys() {
        return this.categorys;
    }

    /**
    * Define categorys
    * @param categorys categorys
    * @generated
    */
    public Tasks setCategorys(Categorys categorys) {
        this.categorys = categorys;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Tasks object = (Tasks)obj;
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