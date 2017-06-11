package ru.ncedu.purchasebot.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Messages {
    @Id
    private long message_id;
    @OneToMany(mappedBy = "login")
    private List<Customer> user;
    @OneToMany(mappedBy = "message")
    private List<Status> status;
    @Column(nullable = false)
    private String content;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;


    public Messages() {
    }

    public Messages(long message_id, List<Customer> user, List<Status> status, String content, Date date) {
        this.message_id = message_id;
        this.user = user;
        this.status = status;
        this.content = content;
        this.date = date;
    }

    public long getMessage_id() {
        return message_id;
    }

    public void setMessage_id(long message_id) {
        this.message_id = message_id;
    }

    public List<Customer> getUser() {
        return user;
    }

    public void setUser(List<Customer> user) {
        this.user = user;
    }

    public List<Status> getStatus() {
        return status;
    }

    public void setStatus(List<Status> status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Messages{" +
                "message_id=" + message_id +
                ", user=" + user +
                ", status=" + status +
                ", content='" + content + '\'' +
                ", date=" + date +
                '}';
    }
}
