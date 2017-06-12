package ru.ncedu.purchasebot.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
public class Bot {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment" , strategy = "increment")
    private long bot_id;
    @OneToMany(mappedBy = "login")
    private List<Customer> user;
    @Column(nullable = false, length = 10)
    private String good_name;
    @OneToMany(mappedBy = "adress")
    private List<Shops> shop;
    @Temporal(TemporalType.TIMESTAMP)
    private Date start_time;
    @Temporal(TemporalType.TIMESTAMP)
    private Date finish_time;
    @OneToMany(mappedBy = "search_mode_id")
    private List<Search_mode> search_mode_id;
    private long num;

    public Bot() {    }

    public Bot(long bot_id, List<Customer> user, String good_name, List<Shops> shop, Date start_time, Date finish_time, List<Search_mode> search_mode_id, long num) {
        this.bot_id = bot_id;
        this.user = user;
        this.good_name = good_name;
        this.shop = shop;
        this.start_time = start_time;
        this.finish_time = finish_time;
        this.search_mode_id = search_mode_id;
        this.num = num;
    }


    public long getBot_id() {
        return bot_id;
    }

    public void setBot_id(long bot_id) {
        this.bot_id = bot_id;
    }


    public List<Customer> getUser() {
        return user;
    }

    public void setUser(List<Customer> user) {
        this.user = user;
    }

    public String getGood_name() {
        return good_name;
    }

    public void setGood_name(String good_name) {
        this.good_name = good_name;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public List<Shops> getShop() {
        return shop;
    }

    public void setShop(List<Shops> shop) {
        this.shop = shop;
    }

    public Date getFinish_time() {
        return finish_time;
    }

    public void setFinish_time(Date finish_time) {
        this.finish_time = finish_time;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public List<Search_mode> getSearch_mode_id() {
        return search_mode_id;
    }

    public void setSearch_mode_id(List<Search_mode> search_mode_id) {
        this.search_mode_id = search_mode_id;
    }

    @Override
    public String toString() {
        return "Bot{" +
                "bot_id=" + bot_id +
                ", user='" + user + '\'' +
                ", good_name='" + good_name + '\'' +
                ", shop='" + shop + '\'' +
                ", start_time=" + start_time +
                ", finish_time=" + finish_time +
                ", search_mode_id=" + search_mode_id +
                ", num=" + num +
                '}';
    }


}
