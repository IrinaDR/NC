package ru.ncedu.purchasebot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Status {
    @Id
    @ManyToOne
    private long status_id;
    @Column(nullable = false)
    private String value;

    public Status() {
    }

    public Status(long status_id, String value, Messages message) {
        this.status_id = status_id;
        this.value = value;
    }

    public long getStatus_id() {
        return status_id;
    }

    public void setStatus_id(long status_id) {
        this.status_id = status_id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Status{" +
                "status_id=" + status_id +
                ", value='" + value + '\'' +
                '}';
    }
}
