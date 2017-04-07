package leap.paas.model;

import leap.lang.meta.annotation.Filterable;
import leap.lang.meta.annotation.Sortable;
import leap.orm.annotation.Id;
import leap.orm.model.Model;

import java.util.Date;

/**
 * Created by Administrator on 2017-01-04.
 */
public class ModelBaseSimple extends Model {
    @Id
    private String id;
    @Sortable
    @Filterable
    private int status;
    @Filterable
    private int isDelete;
    @Sortable
    @Filterable
    private Date createdDate;
    @Filterable
    private String createdBy;
    @Sortable
    @Filterable
    private Date lastUpdatedDate;
    @Filterable
    private String lastUpdatedBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
}
