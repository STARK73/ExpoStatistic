package ru.expo.servercontrol.model;

//@Entity
//@Table("site")
public class Site {

    /*@Id
    @Column("id")
    @GeneratedValue(GenerationType.IDENTITY)*/
    private Integer id;

    private String name;

    private String url;

    //@Column(name = "count_view")
    private String countView;

    //@Column(name = "count_click")
    private String countClick;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCountView() {
        return countView;
    }

    public void setCountView(String countView) {
        this.countView = countView;
    }

    public String getCountClick() {
        return countClick;
    }

    public void setCountClick(String countClick) {
        this.countClick = countClick;
    }
}