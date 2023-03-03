package Task03;
import java.time.Year;

public class House {
    private Integer floors;
    private Integer constructionYear;
    private String name;
    public void setHouseInfo (Integer floors, Integer constructionYear, String name) {
        this.floors = floors;
        this.constructionYear = constructionYear;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ": " +
                "floors - " + floors +
                ", constructionYear - " + constructionYear;
    }
    public void houseInfo() {
        System.out.println(this.toString());
    }
    public int houseAge() {
        return Year.now().getValue() - constructionYear;
    }
}
