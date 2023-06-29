/**
 * <p></p>
 *
 * @author luohuiqi
 * @date 2023/6/6 14:31
 */

public class ReflectionTest {

//    public static void main(String[] args) throws ClassNotFoundException {
//        Class<?> userClass = Class.forName("pojo.Human");
//        int a = 1;
//        int b = 2;
//        int c = a = b;
//        System.out.println("c = " + c + " a = " + a + " b = " + b);
//    }

    public static void testContinue() {
        retry:
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(j + ", ");
                if(j == 3) {
                    continue retry;
                }
            }
        }
        System.out.print(" >>> OK \b\t");
    }

    public static void main(String[] args) {
        testContinue();
    }


}

