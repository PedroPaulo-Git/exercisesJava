
import entities.Comments;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comments c1 = new Comments("Hello comment 1");
        Comments c2 = new Comments("Hello comment 2");

        Post postInstance = new Post(
                sdf.parse("22/03/2023 12:22:33") ,
                "title post 1","substittle post 1",12);
        postInstance.addComemmt(c1);
        postInstance.addComemmt(c2);

        Comments c3 = new Comments("Hello comment 1 POST2");
        Comments c4 = new Comments("Hello comment 2 POST2");

        Post postInstance2 = new Post(
                sdf.parse("03/01/2024 16:03:13") ,
                "title post 2","substittle post 2",33);

        postInstance2.addComemmt(c3);
        postInstance2.addComemmt(c4);
        System.out.println(postInstance);
        System.out.println(postInstance2);

    }

}