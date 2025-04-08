import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HashMapsYmas {
    public static void main(String[] args) {

        HashMap<String, List<String>> videojuegos = new HashMap<>();

        videojuegos.put("Zelda", Arrays.asList("N64", "switch"));
        videojuegos.put("Minecraft", Arrays.asList("PC", "Mac", "Xbox"));

        System.out.println(videojuegos);

    }
}
