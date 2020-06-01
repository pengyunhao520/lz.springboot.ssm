package hospital.util;

import jcifs.smb.SmbException;
import jcifs.smb.SmbFile;
import jcifs.smb.SmbFileInputStream;

import java.io.*;
import java.net.MalformedURLException;

public class TestVideo {
    public static void main(String[] args) throws MalformedURLException {
        //smb://xxx:xxx@.../testIndex/
        //xxx:xxx是共享机器的用户名密码
        //SmbFile smbFile = new SmbFile("smb://域名;登录账号:登录密码@服务器ip/文件夹名称/");
        String url="smb://Administrator:Lz8312@192.168.28.56/video/tt.mp4";
        SmbFile file = new SmbFile(url);
        System.out.println(file);
        getFile(url, "D:/log");
    }


    /**
     * 从共享目录下载文件
     * @param remoteUrl 共享目录
     * @param localDir 本地目录
     */
    public static void getFile(String remoteUrl,String localDir) {
        InputStream in = null;
        OutputStream out = null;
        try {
            SmbFile remoteFile = new SmbFile(remoteUrl);
            if(remoteFile==null){
                System.out.println("共享文件不存在");
                return;
            }
            String fileName = remoteFile.getName();
            File localFile = new File(localDir+File.separator+fileName);
            in = new BufferedInputStream(new SmbFileInputStream(remoteFile));
            System.out.println(in);
            out = new BufferedOutputStream(new FileOutputStream(localFile));
            System.out.println(remoteFile.toString());
            System.out.println(localFile.toString());
            System.out.println(in.toString());
            System.out.println(out.toString());
            byte[] buffer = new byte[2048];
            while(in.read(buffer)!=-1){
                out.write(buffer);
                buffer = new byte[2048];
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                assert out != null;
                out.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
