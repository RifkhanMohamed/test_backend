package com.example.test.modal;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "itemCode")
@EntityListeners(AuditingEntityListener.class)
public class itemCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    @ManyToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", referencedColumnName = "id", nullable = true)
    private category categories;


    public itemCode() {
    }

    public itemCode(long id, String description, category categories) {
        this.id = id;
        this.description = description;
        this.categories = categories;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public category getCategories() {
        return categories;
    }

    public void setCategories(category categories) {
        this.categories = categories;
    }
}
