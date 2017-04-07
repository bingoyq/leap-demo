package leap.paas.model;

import leap.lang.meta.annotation.Filterable;

/**
 * Created by Administrator on 2017-01-04.
 */
public class ModelBase extends ModelBaseSimple {
    @Filterable
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
