/**
 * <p></p>
 *
 * @author luohuiqi
 * @date 2023/6/6 14:31
 */

public class ReflectionTest {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> userClass = Class.forName("pojo.Human");
        System.out.println("userClass = " + userClass);
        System.out.println("userClass = " + userClass);

    }

}
