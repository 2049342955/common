//package com.demo.utils;
//
//import com.esudian.dto.FileBean;
//
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.zip.ZipEntry;
//import java.util.zip.ZipOutputStream;
//
///**
// * author : Sdniu
// * date   : 2017/3/29.
// * description : Zip工具类
// */
//public class ZipUtil {
//
//
//    /**
//     * 将文件打包为Zip,压入流
//     *
//     * @param fileList     文件项目
//     * @param outputStream 压入的输出流
//     * @throws IOException
//     */
//    public static void zipFile(List<FileBean> fileList, OutputStream outputStream) throws IOException {
//        //初始化 Zip输出流
//        Map<String, String> itemNameMap = new HashMap<String, String>();
//        ZipOutputStream out = new ZipOutputStream(outputStream);
//        for (FileBean f : fileList) {
//            String fWholeName = f.getFileName();
//            String fileName;
//            String fileType = "";
//            String strings[] = fWholeName.split("\\.");
//            if (strings.length == 2) {
//                fileName = strings[0];
//                fileType = "."+strings[1];
//            } else {
//                fileName = fWholeName;
//            }
//            String versionString = itemNameMap.get(fileName);
//            if (versionString == null) {
//                itemNameMap.put(fileName, "0");
//            } else {
//                itemNameMap.put(fileName, Integer.parseInt(versionString) + 1 + "");
//                f.setFileName(fileName + "("+(Integer.parseInt(versionString) + 1)+")" + fileType);
//            }
//            byte[] buffer = new byte[1024];
//            InputStream fis = new ByteArrayInputStream(f.getStream());
////            FileInputStream fis = new ByteArrayInputStream(f.getStream());
//            ZipEntry zipEntry = new ZipEntry(f.getFileName());
//            out.putNextEntry(zipEntry);
//            int len = 0;
//            // 读取文件的内容,打包到zip文件
//            while ((len = fis.read(buffer)) > 0) {
//                out.write(buffer, 0, len);
//            }
//            fis.close();
//        }
//        out.flush();
//        out.closeEntry();
//        out.close();
//    }
//}
