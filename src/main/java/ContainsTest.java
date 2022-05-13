import java.io.InputStreamReader;
import org.locationtech.jts.geom.LinearRing;
import org.locationtech.jts.io.WKTReader;

public class ContainsTest {

  public static void main(String[] args) throws Exception {
    final LinearRing exterior = (LinearRing)
        new WKTReader()
            .read(new InputStreamReader(
                ContainsTest.class.getClassLoader().getResourceAsStream("exterior.txt")));
    final LinearRing interior = (LinearRing)
        new WKTReader()
            .read(new InputStreamReader(
                ContainsTest.class.getClassLoader().getResourceAsStream("interior.txt")));
    System.out.println(exterior.contains(interior));
  }
}
