package leap.paas.model;

import leap.lang.meta.annotation.Creatable;
import leap.lang.meta.annotation.Filterable;
import leap.orm.annotation.Table;

import java.util.Date;

/**
 * Created by Jason on 2016/12/28.
 */
@Table("sec_user")
public class SecUser extends ModelBase {
    @Creatable
    @Filterable
    private String id;
    @Filterable
    private String loginId;
    @Filterable
    private String idCard;
    @Filterable
    private Date birthday;
    @Filterable
    private String password;
    @Filterable
    private String rePassword;
    @Filterable
    private String nation;
    @Filterable
    private String pinyin;
    @Filterable
    private String sex;
    @Filterable
    private String jh;
    @Filterable
    private String mobilePhone;
    @Filterable
    private String telephone;
    @Filterable
    private String email;
    @Filterable
    private String fax;
    @Filterable
    private String familyAddress;
    @Filterable
    private String companyName;
    @Filterable
    private String work;
    @Filterable
    private String type;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getJh() {
        return jh;
    }

    public void setJh(String jh) {
        this.jh = jh;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getFamilyAddress() {
        return familyAddress;
    }

    public void setFamilyAddress(String familyAddress) {
        this.familyAddress = familyAddress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
