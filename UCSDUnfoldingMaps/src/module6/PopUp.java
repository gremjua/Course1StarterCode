package module6;

public class PopUp {

    protected String title;
    protected int bgColor;
    protected int textColor;
    protected float titleSize;
    protected float bodyTextSize;
    protected boolean hidden;

    public PopUp() {
        hidden = true;
    }

    public PopUp(String title, int bgColor, int textColor, float titleSize, float bodyTextSize) {
        this.hidden = true;
        this.title = title;
        this.bgColor = bgColor;
        this.textColor = textColor;
        this.titleSize = titleSize;
        this.bodyTextSize = bodyTextSize;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBgColor() {
        return bgColor;
    }

    public void setBgColor(int bgColor) {
        this.bgColor = bgColor;
    }

    public int getTextColor() {
        return textColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }

    public float getTitleSize() {
        return titleSize;
    }

    public void setTitleSize(float titleSize) {
        this.titleSize = titleSize;
    }

    public float getBodyTextSize() {
        return bodyTextSize;
    }

    public void setBodyTextSize(float bodyTextSize) {
        this.bodyTextSize = bodyTextSize;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }
}
