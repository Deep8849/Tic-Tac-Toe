package models;

import java.util.List;

public class Symbol {

  private char aChar;
  private String image;

  public Symbol(char aChar, String image) {
      this.aChar = aChar;
      this.image = image;
  }
  public char getaChar() {
      return aChar;
  }
  public void setaChar(char aChar) {
      this.aChar = aChar;
  }
  public String getImage() {
      return image;
  }
  public void setImage(String image) {
      this.image = image;
  }


}
