package adapter;

/**
 * Created by wjk on 16/2/26.
 */
public class ApplyCosmetics implements BeautifulGirl {
    private UglyGirl uglyGirl;

    public ApplyCosmetics(UglyGirl uglyGirl) {
        this.uglyGirl = uglyGirl;
    }

    public void smile() {
        uglyGirl.cry();
    }
}
