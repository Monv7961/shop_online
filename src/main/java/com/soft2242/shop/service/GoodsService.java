package com.soft2242.shop.service;

import com.soft2242.shop.common.result.PageResult;
import com.soft2242.shop.entity.Goods;
import com.baomidou.mybatisplus.extension.service.IService;
import com.soft2242.shop.query.Query;
import com.soft2242.shop.query.RecommendByTabGoodsQuery;
import com.soft2242.shop.vo.GoodsVO;
import com.soft2242.shop.vo.IndexTabGoodsVO;
import com.soft2242.shop.vo.IndexTabRecommendVO;
import com.soft2242.shop.vo.RecommendGoodsVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ycshang
 * @since 2023-11-09
 */
public interface GoodsService extends IService<Goods> {
    IndexTabRecommendVO getTabRecommendGoodsByTabId(RecommendByTabGoodsQuery query);
    PageResult<RecommendGoodsVO> getRecommendGoodsByPage(Query query);
    GoodsVO getGoodsDetail(Integer id);
}

