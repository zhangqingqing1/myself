
import java.io.*;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws IOException {
        File file =new File("D:\\手机号.txt");
        Writer out =new FileWriter(file);
        BufferedWriter bw= new BufferedWriter(out);
        for (int i = 0; i <100000 ; i++) {
            bw.write( phone());
            bw.write( ",");
            bw.write( terminal());
            bw.newLine();
        }

        bw.flush();
        bw.close();

        System.out.println("1111111111111111");

        System.out.println("2222");
    }
    public static String phone() {
        String[] arr=new String[]{"135","136","137","138","139","150","151","152","157","158","159","130","131","132","155","156","133","153","185","186","188","189"};
        StringBuffer sb=new StringBuffer();
        sb.append(arr[new Random().nextInt(arr.length)]);
        for (int i = 0; i <8 ; i++) {
            sb.append(new Random().nextInt(10));

        }
        return sb.toString();
    }

    public static String terminal() {
        StringBuffer sb=new StringBuffer();
        sb.append("e26ca4ed001bc3e56be3fa7f7ff49245");
        for (int i = 0; i <8 ; i++) {
            sb.append(new Random().nextInt(10));

        }
        return sb.toString();
    }
}
