import java.io.Serializable;

public class BookGenreBean implements Serializable {
    
   private int bgenre_id;
   private int genre_id;

   public BookGenreBean(){}

    public BookGenreBean(int bgenre_id, int genre_id) {
        this.bgenre_id = bgenre_id;
        this.genre_id = genre_id;
    }

    public int getBgenre_id() {
        return bgenre_id;
    }

    public void setBgenre_id(int bgenre_id) {
        this.bgenre_id = bgenre_id;
    }

    public int getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(int genre_id) {
        this.genre_id = genre_id;
    }
   
   
}
