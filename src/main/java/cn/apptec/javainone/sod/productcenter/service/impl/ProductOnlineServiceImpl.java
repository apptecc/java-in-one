package cn.apptec.javainone.sod.productcenter.service.impl;

import cn.apptec.javainone.sod.productcenter.entity.ProductOnline;
import cn.apptec.javainone.sod.productcenter.dao.ProductOnlineDao;
import cn.apptec.javainone.sod.productcenter.service.ProductOnlineService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 线上商品库(ProductOnline)表服务实现类
 *
 * @author makejava
 * @since 2020-02-21 09:50:20
 */
@Service("productOnlineService")
public class ProductOnlineServiceImpl implements ProductOnlineService {
    @Resource
    private ProductOnlineDao productOnlineDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ProductOnline queryById(Long id) {
        return this.productOnlineDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ProductOnline> queryAllByLimit(int offset, int limit) {
        return this.productOnlineDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param productOnline 实例对象
     * @return 实例对象
     */
    @Override
    public ProductOnline insert(ProductOnline productOnline) {
        this.productOnlineDao.insert(productOnline);
        return productOnline;
    }

    /**
     * 修改数据
     *
     * @param productOnline 实例对象
     * @return 实例对象
     */
    @Override
    public ProductOnline update(ProductOnline productOnline) {
        this.productOnlineDao.update(productOnline);
        return this.queryById(productOnline.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.productOnlineDao.deleteById(id) > 0;
    }
}