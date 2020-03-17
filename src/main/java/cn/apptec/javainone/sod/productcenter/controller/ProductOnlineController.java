package cn.apptec.javainone.sod.productcenter.controller;

import cn.apptec.javainone.sod.productcenter.entity.ProductOnline;
import cn.apptec.javainone.sod.productcenter.service.ProductOnlineService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 线上商品库(ProductOnline)表控制层
 *
 * @author makejava
 * @since 2020-02-21 09:50:21
 */
@RestController
@RequestMapping("productOnline")
public class ProductOnlineController {
    /**
     * 服务对象
     */
    @Resource
    private ProductOnlineService productOnlineService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ProductOnline selectOne(Long id) {
        return this.productOnlineService.queryById(id);
    }

}