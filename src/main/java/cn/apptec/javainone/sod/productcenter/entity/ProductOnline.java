package cn.apptec.javainone.sod.productcenter.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 线上商品库(ProductOnline)实体类
 *
 * @author makejava
 * @since 2020-02-21 09:50:12
 */
public class ProductOnline implements Serializable {
    private static final long serialVersionUID = -64425213029087810L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 商品转化类型：1-标品，2-非标，3-组合
    */
    private Object transformType;
    /**
    * 商品名称
    */
    private String productName;
    /**
    * 商品编码
    */
    private String productCode;
    /**
    * 商品条码/UPC
    */
    private String upcCode;
    /**
    * 商品规格
    */
    private String productSpecific;
    /**
    * 商品单位
    */
    private String productUnit;
    /**
    * 专供渠道编码
    */
    private String exclusiveChannelCode;
    /**
    * 产地
    */
    private String originPlace;
    /**
    * 保质期
    */
    private String shelfLife;
    /**
    * 储藏方式
    */
    private String storageType;
    /**
    * 商品描述
    */
    private String productBrief;
    /**
    * 是否有效：0-无效，1-有效。默认0。
    */
    private Object isValid;
    /**
    * 品牌编码
    */
    private String brandCode;
    /**
    * 品牌名称
    */
    private String brandName;
    /**
    * 构成转标品或组合商品的基础商品哈希
    */
    private String sapProductHash;
    /**
    * 初始默认单价，单位：分
    */
    private Integer productPrice;
    /**
    * 线下大类归属
    */
    private String offlineLargeClassBelongTo;
    /**
    * 线下中类归属
    */
    private String offlineMiddleClassBelongTo;
    /**
    * 线下小类归属
    */
    private String offlineSmallClassBelongTo;
    /**
    * 重量，单位：kg
    */
    private Double weight;
    /**
    * 长，单位：mm
    */
    private Integer length;
    /**
    * 宽，单位：mm
    */
    private Integer width;
    /**
    * 高，单位：mm
    */
    private Integer height;
    /**
    * 创建时间
    */
    private Date createdTime;
    /**
    * 创建人
    */
    private String createdBy;
    /**
    * 更新时间
    */
    private Date updatedTime;
    /**
    * 修改人
    */
    private String updatedBy;
    /**
    * 逻辑删除，0-否，1-是
    */
    private Object isDelete;
    /**
    * 是否支持退换货 0-否，1-是
    */
    private Object isReturn;
    /**
    * 是否置顶 0-否，1-是
    */
    private Object isTop;
    /**
    * 是否支持称重退差价 0-否，1-是
    */
    private Object isWeightReturnPrice;
    /**
    * 副标题
    */
    private String subTitle;
    /**
    * 搜索关键字
    */
    private String keywords;
    /**
    * 是否生鲜 0-否 1-是
    */
    private Object isFresh;
    /**
    * 线下根类归属
    */
    private String offlineRootClassBelongTo;
    /**
    * 课组
    */
    private String purchaseGroupCode;
    /**
    * 能否调价
    */
    private Object canAdjustPrice;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Object getTransformType() {
        return transformType;
    }

    public void setTransformType(Object transformType) {
        this.transformType = transformType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public void setUpcCode(String upcCode) {
        this.upcCode = upcCode;
    }

    public String getProductSpecific() {
        return productSpecific;
    }

    public void setProductSpecific(String productSpecific) {
        this.productSpecific = productSpecific;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public String getExclusiveChannelCode() {
        return exclusiveChannelCode;
    }

    public void setExclusiveChannelCode(String exclusiveChannelCode) {
        this.exclusiveChannelCode = exclusiveChannelCode;
    }

    public String getOriginPlace() {
        return originPlace;
    }

    public void setOriginPlace(String originPlace) {
        this.originPlace = originPlace;
    }

    public String getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(String shelfLife) {
        this.shelfLife = shelfLife;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public String getProductBrief() {
        return productBrief;
    }

    public void setProductBrief(String productBrief) {
        this.productBrief = productBrief;
    }

    public Object getIsValid() {
        return isValid;
    }

    public void setIsValid(Object isValid) {
        this.isValid = isValid;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSapProductHash() {
        return sapProductHash;
    }

    public void setSapProductHash(String sapProductHash) {
        this.sapProductHash = sapProductHash;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public String getOfflineLargeClassBelongTo() {
        return offlineLargeClassBelongTo;
    }

    public void setOfflineLargeClassBelongTo(String offlineLargeClassBelongTo) {
        this.offlineLargeClassBelongTo = offlineLargeClassBelongTo;
    }

    public String getOfflineMiddleClassBelongTo() {
        return offlineMiddleClassBelongTo;
    }

    public void setOfflineMiddleClassBelongTo(String offlineMiddleClassBelongTo) {
        this.offlineMiddleClassBelongTo = offlineMiddleClassBelongTo;
    }

    public String getOfflineSmallClassBelongTo() {
        return offlineSmallClassBelongTo;
    }

    public void setOfflineSmallClassBelongTo(String offlineSmallClassBelongTo) {
        this.offlineSmallClassBelongTo = offlineSmallClassBelongTo;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Object getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Object isDelete) {
        this.isDelete = isDelete;
    }

    public Object getIsReturn() {
        return isReturn;
    }

    public void setIsReturn(Object isReturn) {
        this.isReturn = isReturn;
    }

    public Object getIsTop() {
        return isTop;
    }

    public void setIsTop(Object isTop) {
        this.isTop = isTop;
    }

    public Object getIsWeightReturnPrice() {
        return isWeightReturnPrice;
    }

    public void setIsWeightReturnPrice(Object isWeightReturnPrice) {
        this.isWeightReturnPrice = isWeightReturnPrice;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Object getIsFresh() {
        return isFresh;
    }

    public void setIsFresh(Object isFresh) {
        this.isFresh = isFresh;
    }

    public String getOfflineRootClassBelongTo() {
        return offlineRootClassBelongTo;
    }

    public void setOfflineRootClassBelongTo(String offlineRootClassBelongTo) {
        this.offlineRootClassBelongTo = offlineRootClassBelongTo;
    }

    public String getPurchaseGroupCode() {
        return purchaseGroupCode;
    }

    public void setPurchaseGroupCode(String purchaseGroupCode) {
        this.purchaseGroupCode = purchaseGroupCode;
    }

    public Object getCanAdjustPrice() {
        return canAdjustPrice;
    }

    public void setCanAdjustPrice(Object canAdjustPrice) {
        this.canAdjustPrice = canAdjustPrice;
    }

}