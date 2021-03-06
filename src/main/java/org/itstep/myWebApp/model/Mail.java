package org.itstep.myWebApp.model;

import org.hibernate.annotations.OnDelete;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Mail extends BaseEntity {

    private String text;

    private String to; // email

    private LocalDateTime created;

    private Integer userId; // owner

    @ManyToOne(cascade = CascadeType.REMOVE)
    private User user;

    public Mail() {
    }

    public Mail(Integer id, String name, String text, String to, LocalDateTime created, Integer userId) {
        this.id = id;
        this.name = name;
        this.text = text;
        this.to = to;
        this.created = created;
        this.userId = userId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "text='" + text + '\'' +
                ", to='" + to + '\'' +
                ", created=" + created +
                ", userId=" + userId +
                "}";
    }
}
