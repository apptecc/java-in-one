package cn.apptec.javainone.xprinter;

import org.apache.commons.lang.StringUtils;

import java.awt.*;
import java.awt.print.*;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Prient implements Printable {

    @Override
    public int print(Graphics g, PageFormat pf, int page) throws PrinterException {

        if (page > 0) {
            return NO_SUCH_PAGE;
        }

        Graphics2D g2d = (Graphics2D) g;
        g2d.setFont(new Font("Default", Font.PLAIN, 14));
        g2d.drawString("你看这个怎么样", 7, 10);
        g2d.draw3DRect(7, 20, 20, 30, true);
        g2d.drawString("-------------------------------------", 7, 20);
        g2d.drawString("手机号码：" + "19941588171", 7, 35);
        g2d.drawString("商品编码：" + "123123141214", 7, 65);
        g2d.drawString("-------------------------------------", 7, 80);
        g2d.setFont(new Font("Default", Font.PLAIN, 25));
        g2d.drawString("小号", 7, 105);
        g2d.setFont(new Font("Default", Font.PLAIN, 14));
        g2d.drawString("总金额: " + 5 + " 元", 7, 130);
        g2d.drawString("-------------------------------------", 7, 145);
        g2d.drawString("打印时间:" + new SimpleDateFormat("yyyyMMdd HH:mm:ss").format(new Date()), 7, 160);
        g2d.drawString("店名：" + "永辉超市-俊峰小店永辉超市-俊峰小店永辉超市-俊峰小店永辉超市-俊峰小店永辉超市-俊峰小店永辉超市-俊峰小店永辉超市-俊峰小店永辉超市-俊峰小店永辉超市-俊峰小店永辉超市-俊峰小店永辉超市-俊峰小店永辉超市-俊峰小店永辉超市-俊峰小店", 7, 175);

        return PAGE_EXISTS;
    }

    // public static String[] getSubedStrings(String string, int unitLength) {
    //     if (StringUtils.isEmpty(string)) {
    //         return null;
    //     }
    //     String str = string;
    //
    //     int arraySize = 0;
    //     try {
    //         arraySize = str.getBytes("GBK").length / unitLength;
    //     } catch (UnsupportedEncodingException e) {
    //         e.printStackTrace();
    //     }
    //     if (str.getBytes().length % unitLength > 0) {
    //         arraySize++;
    //     }
    //     String[] result = new String[arraySize];
    //     for (int i = 0; i < arraySize; i++) {
    //         result[i] = subStr(str, unitLength);
    //         str = str.replace(result[i], "");
    //     }
    //
    //     return result;
    // }
    //
    // public static String subStr(String str, int subSLength) {
    //     if (str == null)
    //         return "";
    //     else {
    //         int tempSubLength = subSLength;//截取字节数
    //         String subStr = str.substring(0, str.length() < subSLength ? str.length() : subSLength);//截取的子串
    //         int subStrByetsL = 0;//截取子串的字节长度
    //         //int subStrByetsL = subStr.getBytes().length;//截取子串的字节长度
    //         // 说明截取的字符串中包含有汉字
    //         try {
    //             subStrByetsL = subStr.getBytes("GBK").length;
    //
    //             while (subStrByetsL > tempSubLength) {
    //                 int subSLengthTemp = --subSLength;
    //                 subStr = str.substring(0, subSLengthTemp > str.length() ? str.length() : subSLengthTemp);
    //                 subStrByetsL = subStr.getBytes("GBK").length;
    //                 //subStrByetsL = subStr.getBytes().length;
    //             }
    //             return subStr;
    //         } catch (UnsupportedEncodingException e) {
    //             e.printStackTrace();
    //         }
    //     }
    //     return str;
    // }

    public static void main(String[] args) {

        int height = 175 + 3 * 15 + 20;

        // 通俗理解就是书、文档
        Book book = new Book();

        // 打印格式
        PageFormat pf = new PageFormat();
        pf.setOrientation(PageFormat.PORTRAIT);

        // 通过Paper设置页面的空白边距和可打印区域。必须与实际打印纸张大小相符。
        Paper p = new Paper();
        p.setSize(230, height);
        p.setImageableArea(5, -20, 230, height + 20);
        pf.setPaper(p);

        // 把 PageFormat 和 Printable 添加到书中，组成一个页面
        book.append(new Prient(), pf);

        // 获取打印服务对象
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPageable(book);
        try {
            job.print();
        } catch (PrinterException e) {
            System.out.println("================打印出现异常");
        }

    }

}