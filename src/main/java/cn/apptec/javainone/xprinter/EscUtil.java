package cn.apptec.javainone.xprinter;

import lombok.extern.slf4j.Slf4j;

import javax.print.*;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.MediaPrintableArea;
import java.awt.print.PrinterJob;

@Slf4j
public class EscUtil {

    public static PrintService getPrinter(String printerCode) {
        PrintService[] printServices = PrinterJob.lookupPrintServices();
        if (printServices == null || printServices.length == 0) {
            log.warn("打印失败，未找到可用打印机，请检查。");
            throw new RuntimeException("打印失败，未找到可用打印机，请检查 一个都未找到");
        }
        PrintService printService = null;
        //匹配指定打印机
        for (int i = 0; i < printServices.length; i++) {
            System.out.println(printServices[i].getName());
            if (printServices[i].getName().contains(printerCode)) {
                printService = printServices[i];
                break;
            }
        }
        if (printService == null) {
            log.warn("打印失败，未找到指定的打印机，请检查。code:" + printerCode);
            throw new RuntimeException("打印失败，未找到指定的打印机，请检查。code:" + printerCode);
        }
        return printService;
    }

    public static PrintService[] getPrinter() {
        return PrinterJob.lookupPrintServices();
    }

    public static void doPrint(PrintService printService, byte[] data, MediaPrintableArea printerTable) throws  PrintException {
        DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
        Doc doc = new SimpleDoc(data, flavor, null);
        //printerTable
        PrintRequestAttributeSet pars = new HashPrintRequestAttributeSet();
        pars.add(printerTable);
        DocPrintJob printJob = printService.createPrintJob();
        printJob.print(doc,pars);
    }
}
