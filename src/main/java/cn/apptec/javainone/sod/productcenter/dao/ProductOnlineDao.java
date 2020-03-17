package cn.apptec.javainone.sod.productcenter.dao;

import cn.apptec.javainone.sod.productcenter.entity.ProductOnline;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 线上商品库(ProductOnline)表数据库访问层
 *
 * @author makejava
 * @since 2020-02-21 09:50:16
 */
public interface ProductOnlineDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProductOnline queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ProductOnline> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param productOnline 实例对象
     * @return 对象列表
     */
    List<ProductOnline> queryAll(ProductOnline productOnline);

    /**
     * 新增数据
     *
     * @param productOnline 实例对象
     * @return 影响行数
     */
    int insert(ProductOnline productOnline);

    /**
     * 修改数据
     *
     * @param productOnline 实例对象
     * @return 影响行数
     */
    int update(ProductOnline productOnline);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}