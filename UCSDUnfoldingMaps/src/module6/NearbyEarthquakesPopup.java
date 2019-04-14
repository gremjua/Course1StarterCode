package module6;

public class NearbyEarthquakesPopup extends PopUp{

    private float xInit;
    private float yInit;
    private float width;
    private float height;
    private int countNearbyEarthquakes;
    private float avgMagnitude;
    private String mostRecentEarthquake;

    public NearbyEarthquakesPopup() {
    }

    public NearbyEarthquakesPopup(String title, int bgColor, int textColor, float titleSize, float bodyTextSize) {
        super(title, bgColor, textColor, titleSize, bodyTextSize);
    }

    public float getxInit() {
        return xInit;
    }

    public void setxInit(float xInit) {
        this.xInit = xInit;
    }

    public float getyInit() {
        return yInit;
    }

    public void setyInit(float yInit) {
        this.yInit = yInit;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getCountNearbyEarthquakes() {
        return countNearbyEarthquakes;
    }

    public void setCountNearbyEarthquakes(int countNearbyEarthquakes) {
        this.countNearbyEarthquakes = countNearbyEarthquakes;
    }

    public float getAvgMagnitude() {
        return avgMagnitude;
    }

    public void setAvgMagnitude(float avgMagnitude) {
        this.avgMagnitude = avgMagnitude;
    }

    public String getMostRecentEarthquake() {
        return mostRecentEarthquake;
    }

    public void setMostRecentEarthquake(String mostRecentEarthquake) {
        this.mostRecentEarthquake = mostRecentEarthquake;
    }

    //    @Override
//    void draw() {
//        pg.pushStyle();
//
//        pg.fill(getBgColor());
//        pg.textSize(getTitleSize());
//        pg.rectMode(PConstants.CORNER);
//        pg.rect(xInit, yInit, width, height);
//        pg.fill(getTextColor());
//        pg.textAlign(PConstants.LEFT, PConstants.TOP);
//        pg.text(getTitle(), xInit+3, yInit+3);
//        pg.text("Nearby Earthquakes: " + countNearbyEarthquakes, xInit+3, yInit+13);
//        pg.text("Average Magnitude: " + avgMagnitude, xInit+3, yInit+23);
//        pg.text("Most Recent: " + mostRecentEarthquake, xInit+3, yInit+33);
//
//        pg.popStyle();
//    }
}
