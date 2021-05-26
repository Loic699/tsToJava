package tsToJava;
 public class Photo {
    public String url;
    public String filename;
    public Number width;
    public Number height;

      public Photo(String url, String filename, Number width, Number height) {
        this.url = url;
        this.filename = filename;
        this.width = width;
        this.height = height;
    }
}