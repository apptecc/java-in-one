package cn.apptec.javainone.xprinter;

import javax.print.*;
import java.awt.print.PrinterJob;
import java.io.InputStream;

/**
 * Created by liuyangsheng on 2019/8/5.
 *
 * @Description:
 * @Modified By:
 */
public class DemoXprinter {

    public static void main(String[] args) throws PrintException {

        DocPrintJob printJob = null;
        PrintService[] printServices = PrinterJob.lookupPrintServices();

        for (PrintService printService : printServices) {
            if (printService.getName().contains("XP-80C (副本 2)")) {
                printJob = printService.createPrintJob();
                break;
            }
        }

        InputStream in = new java.io.ByteArrayInputStream("Java 实现 POS 打印机无驱打印 - Kevin - ITeye博客2009年12月15日 - 不使用 PrinterJob 获得打印机的名字的方法进行打印...主要用于USB接口的POS小票打印机,在58mm小票机测试成功...用JAVA中的Socket方法实现无驱动POS机...".getBytes());
        Doc doc = new SimpleDoc(in, DocFlavor.INPUT_STREAM.AUTOSENSE, null);

        printJob.print(doc, null);
    }
}
