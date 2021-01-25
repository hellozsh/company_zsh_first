package company.zsh.first.model;

/**
 * @author zhousuhua
 * @date 25/1/21 下午2:29
 */
public class Item {

    private Integer index;
    private String name;

    public void setName(String name) { this.name = name; }

    public void setIndex(Integer index) { this.index = index; }

    public String getName() { return name; }

    public Integer getIndex() { return index; }
}
