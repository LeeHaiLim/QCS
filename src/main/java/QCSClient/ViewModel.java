package QCSClient;

import java.awt.*;

public class ViewModel {
  private int width;
  private int heignt;
  private String dotStyle;
  private Color dotColor;
  private Color bgColor;

  public ViewModel(int width, int heignt, String dotStyle, Color dotColor, Color bgColor) {
    this.width = width;
    this.heignt = heignt;
    this.dotStyle = dotStyle;
    this.dotColor = dotColor;
    this.bgColor = bgColor;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeignt() {
    return heignt;
  }

  public void setHeignt(int heignt) {
    this.heignt = heignt;
  }

  public String getDotStyle() {
    return dotStyle;
  }

  public void setDotStyle(String dotStyle) {
    this.dotStyle = dotStyle;
  }

  public Color getDotColor() {
    return dotColor;
  }

  public void setDotColor(Color dotColor) {
    this.dotColor = dotColor;
  }

  public Color getBgColor() {
    return bgColor;
  }

  public void setBgColor(Color bgColor) {
    this.bgColor = bgColor;
  }
}
