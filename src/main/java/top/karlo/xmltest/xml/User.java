package top.karlo.xmltest.xml;

/**
 * 功能描述:
 *
 * @author karlo
 * @date 2018/10/29 22:11
 * @since 1.0.0
 */

public class User {
    private String id;
    private String name;
    private Car car;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
