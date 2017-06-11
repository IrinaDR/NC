package ru.ncedu.purchasebot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Search_mode {
    @Id
    @ManyToOne
    private long search_mode_id;
    @Column(nullable = false)
    private String value;

    public Search_mode() {
    }

    public Search_mode(long search_mode_id, String value) {
        this.search_mode_id = search_mode_id;
        this.value = value;
    }

    public long getSearch_mode_id() {
        return search_mode_id;
    }

    public void setSearch_mode_id(long search_mode_id) {
        this.search_mode_id = search_mode_id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Search_mode{" +
                "search_mode_id=" + search_mode_id +
                ", value='" + value + '\'' +
                '}';
    }
}
