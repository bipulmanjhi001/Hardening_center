package hardeningcenter.org.service.model.db;

import com.orm.SugarApp;
import com.orm.SugarRecord;
import com.orm.dsl.Unique;

public class DailyBasistbl extends SugarRecord {
    @Unique
    private String total_no;
    private String date;
    private String age;
    private String no_of_birds;
    private String mortality;
    private String sale;
    private String feed_req;
    private String feed_req_50;
    private String avg_weight;

    public DailyBasistbl(String total_no, String date, String age, String no_of_birds, String mortality, String sale, String feed_req, String feed_req_50, String avg_weight) {
        this.total_no = total_no;
        this.date = date;
        this.age = age;
        this.no_of_birds = no_of_birds;
        this.mortality = mortality;
        this.sale = sale;
        this.feed_req = feed_req;
        this.feed_req_50 = feed_req_50;
        this.avg_weight = avg_weight;
    }

    public String getTotal_no() {
        return total_no;
    }

    public void setTotal_no(String total_no) {
        this.total_no = total_no;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNo_of_birds() {
        return no_of_birds;
    }

    public void setNo_of_birds(String no_of_birds) {
        this.no_of_birds = no_of_birds;
    }

    public String getMortality() {
        return mortality;
    }

    public void setMortality(String mortality) {
        this.mortality = mortality;
    }

    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }

    public String getFeed_req() {
        return feed_req;
    }

    public void setFeed_req(String feed_req) {
        this.feed_req = feed_req;
    }

    public String getFeed_req_50() {
        return feed_req_50;
    }

    public void setFeed_req_50(String feed_req_50) {
        this.feed_req_50 = feed_req_50;
    }

    public String getAvg_weight() {
        return avg_weight;
    }

    public void setAvg_weight(String avg_weight) {
        this.avg_weight = avg_weight;
    }
}
