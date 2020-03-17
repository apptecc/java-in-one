package cn.apptec.javainone.yh.productcenter.csx;

import com.alibaba.fastjson.JSON;
import okhttp3.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyangsheng on 2020/2/3.
 *
 * @Description: 新品引入PI接口测试
 * @Modified By:
 */
public class AppTest {
    public static void main(String[] args) throws IOException {

        List<String> excelLineData = new ArrayList<>();

        excelLineData.add("abc");
        excelLineData.add("def");
        excelLineData.add(null);
        excelLineData.add("g");
        String[] strings = excelLineData.toArray(new String[excelLineData.size()]);
        System.out.println(JSON.toJSONString(strings));

        List<String[]> excelDataList = new ArrayList<>();
        excelDataList.add(strings);
        System.out.println(excelDataList.get(0)[4]);
        // row.createCell(j).setCellValue(((String[]) list.get(i))[j]);

    }
}
