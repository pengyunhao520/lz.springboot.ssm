package hospital.util;

import org.apache.tomcat.util.codec.binary.Base64;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.Blob;
import java.sql.SQLException;


@SuppressWarnings({"ALL", "AlibabaCommentsMustBeJavadocFormat"})
public class TestImage {
    /*
     * 图片转换为二进制
     *
     * @param fileName
     *            本地图片路径
     * @return
     *       图片二进制流
     * */
    public String getImageBinary(String fileName) {
        File f = new File(fileName);
        BufferedImage bi;
        try {
            bi = ImageIO.read(f);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bi, "jpg", baos);
            byte[] bytes = baos.toByteArray();
            return Base64.encodeBase64String(bytes);
            //return encoder.encodeBuffer(bytes).trim();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将二进制转换为图片
     *
     * @param base64String 图片二进制流
     */
    public File toImage(String base64String) {
        File w2 = new File("F://java//second//2018-12-10-springboot//springboot.ssm//src//main//webapp//static//images//");
        try {
            byte[] bytes1 = Base64.decodeBase64(base64String);
            ByteArrayInputStream bais = new ByteArrayInputStream(bytes1);
            BufferedImage bi1 = ImageIO.read(bais);
            System.out.println(bi1);
            // 可以是jpg,png,gif格式
            ImageIO.write(bi1, "jpg", w2);// 不管输出什么格式图片，此处不需改动
        } catch (IOException e) {
            e.printStackTrace();
        }
        return w2;
    }

   /* public static void main(String[] args) {
//        String fileName = "E://images//hospitl.jpg";
//        TestImage testImage = new TestImage();
//        System.out.println(testImage.getImageBinary(fileName));
//        testImage.toImage(testImage.getImageBinary(fileName));

    }*/

    /**
     * @param blob 二进制对象
     * 二进制转成Base64
     */
    public String blobToBase64(Blob blob) {
        String result = "";
        if (null != blob) {
            try {
                InputStream msgContent = blob.getBinaryStream();
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                byte[] buffer = new byte[100];
                int n = 0;
                while (-1 != (n = msgContent.read(buffer))) {
                    output.write(buffer, 0, n);
                }
                result = new BASE64Encoder().encode(output.toByteArray());
                output.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return result;
        } else {
            return null;
        }
    }

}