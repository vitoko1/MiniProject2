public class Phone {

    private String mobilePhone;
    private String workPhone;
    private String homePhone;

    public Phone(String mobilePhone, String workPhone, String homePhone) {
        this.mobilePhone = mobilePhone;
        this.workPhone = workPhone;
        this.homePhone = homePhone;
    }

    public Phone() {
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "mobilePhone='" + mobilePhone + '\'' +
                ", workPhone='" + workPhone + '\'' +
                ", homePhone='" + homePhone + '\'' +
                '}';
    }
}
