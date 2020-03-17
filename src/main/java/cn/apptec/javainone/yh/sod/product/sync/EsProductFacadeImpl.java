package cn.apptec.javainone.yh.sod.product.sync;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author 这个类从product sync 项目中拷过来, 方便做单元测试用, 没有其它用途
 * @date 2019/7/23 21:07
 * @Description
 */
@RestController
@Slf4j
public class EsProductFacadeImpl
        // implements EsProductFacade
{

    /*@Autowired
    private EsProductService esProductService;

    @Autowired
    private RedisMessageHandler redisMessageHandler;

    @Autowired
    private MqMessageHandler mqMessageHandler;

    @Override
    public String queryEsProduct(@RequestBody  List<String> productCodeList) {
        log.info("query sku product info ------------");
        List<EsProductSkuBO> esProductSkuBOS = esProductService.queryEsProductList(productCodeList);
        return JSONObject.toJSONString(esProductSkuBOS);
    }

    @Override
    public void updateEsProduct() {
        log.info("update sku product info ---------");
        List<EsProductSkuBO> esProductSkuBOS = new ArrayList<>();
        EsProductSkuBO esProductSkuBO = new EsProductSkuBO();
        esProductSkuBO.setId("4");
        esProductSkuBO.setOriginPlace("两年保质期");
        esProductSkuBOS.add(esProductSkuBO);
        esProductService.updateESProduct(esProductSkuBOS);
    }

    @Override
    public void updatePrice() {
        SkuPriceNotification skuPriceNotification = new SkuPriceNotification();
        List<SkuPrice> skuPrices = new ArrayList<>();
        SkuPrice skuPrice = new SkuPrice();
        skuPrice.setStoreCode("9010");
        skuPrice.setProductCode("NS1000172");
        skuPrice.setCostPrice(1111);
        skuPrice.setSalePrice(2222);
        skuPrices.add(skuPrice);
        skuPriceNotification.setSkuPrices(skuPrices);
        redisMessageHandler.handlerSkuPrice(skuPriceNotification);
    }

    @Override
    public void updateIsOnSale() {
        SkuSellStatusNotification skuSellStatusNotification = new SkuSellStatusNotification();
        skuSellStatusNotification.setIsOnsale(true);
        List<SkuSellStatus> skuSellStatuses = new ArrayList<>();
        SkuSellStatus skuSellStatus = new SkuSellStatus();
        skuSellStatus.setChannelCode("22");
        skuSellStatus.setStoreCode("9010");
        skuSellStatus.setProductCode("NS1000172");
        skuSellStatuses.add(skuSellStatus);
        skuSellStatusNotification.setSellStatus(skuSellStatuses);
        redisMessageHandler.handlerSkuSellStatus(skuSellStatusNotification);
    }

    @Override
    public void updateIsHidden() {
        SkuLackHiddenNotification skuLackHiddenNotification = new SkuLackHiddenNotification();
        skuLackHiddenNotification.setIsHidden(true);
        List<SkuLackHidden> skuLackHiddens = new ArrayList<>();
        SkuLackHidden skuLackHidden = new SkuLackHidden();
        skuLackHidden.setChannelCode("22");
        skuLackHidden.setStoreCode("9010");
        skuLackHidden.setProductCode("NS1000172");
        skuLackHiddens.add(skuLackHidden);
        skuLackHiddenNotification.setLackHiddens(skuLackHiddens);
        redisMessageHandler.handlerSkuLackHidden(skuLackHiddenNotification);
    }

    @Override
    public void updateProductNote() {
        SkuNoteNotification skuNoteNotification = new SkuNoteNotification();
        List<SkuNote> skuNotes = new ArrayList<>();
        SkuNote skuNote = new SkuNote();
        skuNote.setChannelCode("22");
        skuNote.setStoreCode("9010");
        skuNote.setProductCode("NS1000172");
        skuNote.setProductNoteId(3L);
        skuNotes.add(skuNote);
        skuNoteNotification.setSkuNotes(skuNotes);
        redisMessageHandler.handlerProductNote(skuNoteNotification);
    }

    @Override
    public void updateProductDesc() {
        SkuNotification skuNotification = new SkuNotification();
        List<Sku> skus = new ArrayList<>();
        Sku sku = new Sku();
        sku.setProductCode("NS1000172");
        sku.setChangeType(3);
        skus.add(sku);
        skuNotification.setSkus(skus);
        redisMessageHandler.handlerSku(skuNotification);
    }

    @Override
    public void updateProductCategory() {
        SkuNotification skuNotification = new SkuNotification();
        List<Sku> skus = new ArrayList<>();
        Sku sku = new Sku();
        sku.setProductCode("NS1000172");
        sku.setChangeType(2);
        skus.add(sku);
        skuNotification.setSkus(skus);
        redisMessageHandler.handlerSku(skuNotification);
    }

    @Override
    public void updateProductInventory() {
        String message = "[{\"alertInventory\":0.000,\"attrInfo\":\"[{\\\"channelCode\\\":\\\"2\\\",\\\"jdLock\\\":0,\\\"lock\\\":\\\"0\\\"}]\"," +
                "\"closeSyncType\":1,\"createdBy\":\"system\",\"createdTime\":\"2020-01-06 13:42:04\",\"frontInventory\":0.000,\"frontPreemptionInventory\":0" +
                ".000,\"frontSaleInventory\":0,\"fullInventory\":false,\"id\":187058,\"onlineInventory\":920,\"onlinePreemptionInventory\":1.000," +
                "\"onlineSaleInventory\":919,\"pickingType\":0,\"pickingTypeName\":\"\",\"productBarCode\":\"2730100040429\",\"productCode\":\"10149961\"," +
                "\"productInventoryType\":2,\"productName\":\"红心柚子\",\"productType\":2,\"realInventory\":920.934,\"saleInventory\":919," +
                "\"scProductCode\":\"901010149961\",\"securityInventory\":0.000,\"shopCode\":\"9010\",\"syncInventory\":1,\"updatedBy\":\"80745506_刘阳生\"," +
                "\"updatedTime\":\"2020-01-10 00:15:00\",\"zeroInventory\":false}]";
        List<ResInventoryListQueryVO> resInventoryListQueryVOS = JSON.parseArray(message, ResInventoryListQueryVO.class);
//            log.info("收到的库存消息体, 转换后的对象: {}", JsonUtils.toJson(resInventoryListQueryVOS));
        if (CollectionUtils.isEmpty(resInventoryListQueryVOS)) {
            log.info("收到的库存消息体为空");
            return;
        }
        List<InventoryNotification> inventoryNotifications = new ArrayList<>();
        InventoryNotification inventoryNotification = new InventoryNotification();
        inventoryNotification.setId(538L);
        inventoryNotification.setCloseSyncType(77);
        inventoryNotification.setFrontInventory(new BigDecimal(88));
        inventoryNotification.setFullInventory(true);
        inventoryNotification.setSyncInventory(0);
        inventoryNotification.setOnlineInventory(new BigDecimal(4));
        inventoryNotification.setPickingType(1);
        inventoryNotification.setPickingTypeName("全仓");
        inventoryNotification.setProductInventoryType(1);
        inventoryNotification.setRealInventory(new BigDecimal(55));
        inventoryNotification.setSaleInventory(new BigDecimal(55));
        inventoryNotification.setSecurityInventory(new BigDecimal(66));
        inventoryNotification.setZeroInventory(true);
        inventoryNotifications.add(inventoryNotification);
        for (ResInventoryListQueryVO inventoryListQuery : resInventoryListQueryVOS) {
            InventoryNotification inventoryNotification = new InventoryNotification();
            BeanUtils.copyProperties(inventoryListQuery,inventoryNotification);
            inventoryNotifications.add(inventoryNotification);
        }
        redisMessageHandler.handlerInventory(inventoryNotifications);
    }
    @Override
    public void updatePromoinfo() {
        String message = "\n" +
                "[{\"shopCode\":\"9010\",\"productCode\":\"570324\",\"promotionInfoList\":[{\"discountPrice\":880,\"priceType\":1," +
                "\"promotionCode\":\"2200004885\"}]},{\"shopCode\":\"9010\",\"productCode\":\"57032533\",\"promotionInfoList\":[{\"discountPrice\":870," +
                "\"priceType\":1,\"promotionCode\":\"2200004885\"}]},{\"shopCode\":\"9010\",\"productCode\":\"570327\",\"promotionInfoList\":[{\"discountPrice\":990,\"priceType\":1,\"promotionCode\":\"2200004885\"}]},{\"shopCode\":\"9010\",\"productCode\":\"570334\",\"promotionInfoList\":[{\"discountPrice\":890,\"priceType\":1,\"promotionCode\":\"2200004885\"}]},{\"shopCode\":\"9010\",\"productCode\":\"652379\",\"promotionInfoList\":[{\"discountPrice\":970,\"priceType\":1,\"promotionCode\":\"2200004885\"}]},{\"shopCode\":\"9010\",\"productCode\":\"731523\",\"promotionInfoList\":[{\"discountPrice\":940,\"priceType\":1,\"promotionCode\":\"2200004885\"}]},{\"shopCode\":\"9010\",\"productCode\":\"731525\",\"promotionInfoList\":[{\"discountPrice\":960,\"priceType\":1,\"promotionCode\":\"2200004885\"}]},{\"shopCode\":\"9010\",\"productCode\":\"NS3442641\",\"promotionInfoList\":[{\"discountPrice\":360,\"priceType\":1,\"promotionCode\":\"2200004885\"}]},{\"shopCode\":\"9010\",\"productCode\":\"NS3743488\",\"promotionInfoList\":[]},{\"shopCode\":\"9010\",\"productCode\":\"NS4827794\",\"promotionInfoList\":[{\"discountPrice\":12800,\"priceType\":1,\"promotionCode\":\"2200004885\"}]},{\"shopCode\":\"9010\",\"productCode\":\"NS5019102\",\"promotionInfoList\":[{\"discountPrice\":688,\"priceType\":1,\"promotionCode\":\"2200004885\"}]},{\"shopCode\":\"9010\",\"productCode\":\"NS5056784\",\"promotionInfoList\":[{\"discountPrice\":1289,\"priceType\":1,\"promotionCode\":\"2200004885\"}]},{\"shopCode\":\"9010\",\"productCode\":\"NS5481458\",\"promotionInfoList\":[{\"discountPrice\":589,\"priceType\":1,\"promotionCode\":\"2200004885\"}]},{\"shopCode\":\"9010\",\"productCode\":\"NS5715682\",\"promotionInfoList\":[{\"discountPrice\":1278,\"priceType\":1,\"promotionCode\":\"2200004885\"}]},{\"shopCode\":\"9010\",\"productCode\":\"NS5715757\",\"promotionInfoList\":[{\"discountPrice\":897,\"priceType\":1,\"promotionCode\":\"2200004885\"}]},{\"shopCode\":\"9010\",\"productCode\":\"NS8030884\",\"promotionInfoList\":[{\"discountPrice\":203,\"priceType\":1,\"promotionCode\":\"2200004885\"}]},{\"shopCode\":\"9010\",\"productCode\":\"NS8140535\",\"promotionInfoList\":[{\"discountPrice\":387,\"priceType\":1,\"promotionCode\":\"2200004885\"}]},{\"shopCode\":\"9010\",\"productCode\":\"NS9540397\",\"promotionInfoList\":[{\"discountPrice\":648,\"priceType\":1,\"promotionCode\":\"2200004885\"}]}]";
        log.info("接收到促销价格消息---------------"+message);
        List<PromotionPriceMessage> promotionPriceMessages = JSONObject.parseObject(message,List.class);
        if(CollectionUtils.isEmpty(promotionPriceMessages)){
            return;
        }
        List<PromotionPriceMessage> promotionPriceMessages1 = new ArrayList<>();
        for(int i = 0 ; i < promotionPriceMessages.size() ; i++){
            PromotionPriceMessage promotionPriceMessage = JSONObject.parseObject(JSONObject.toJSONString(promotionPriceMessages.get(i)), PromotionPriceMessage.class);
            promotionPriceMessages1.add(promotionPriceMessage);
        }
        mqMessageHandler.handlerPromotionPriceMessage(promotionPriceMessages1);
    }

    @Override
    public void insertCsp() {
        StoreProductNotification storeProductNotification = new StoreProductNotification();
        List<StoreProductBO> storeProducts = new ArrayList<>();
        StoreProductBO storeProduct = new StoreProductBO();
        storeProduct.setChannelCode("22");
        storeProduct.setStoreCode("9010");
        storeProduct.setProductCode("NS1000927");
        storeProducts.add(storeProduct);
        storeProductNotification.setStoreProductBOS(storeProducts);
        redisMessageHandler.handlerAddStoreProduct(storeProductNotification);
    }*/
}

