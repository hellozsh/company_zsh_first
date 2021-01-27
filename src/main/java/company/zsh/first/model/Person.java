package company.zsh.first.model;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * @author zhousuhua
 * @date 26/1/21 下午4:29
 */
public class Person {

    private Long id;
    private String name;
    private Integer age;
    private Date createdAt;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
