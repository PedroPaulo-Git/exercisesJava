package entities;

public class Comments {
    String text;

    public String getComment() {
        return text;
    }

    public void setComment(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "text='" + text + '\'' +
                '}';
    }

    public Comments(String text) {
        this.text = text;
    }
}
