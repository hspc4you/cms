package com.jsz.peini.mapper;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.jsz.peini.bean.OrderInfo;
import com.jsz.peini.bean.OrderInfoCustom;
import com.jsz.peini.bean.OrderInfoQueryVo;
public interface OrderInfoMapper {

//	List<LinkedHashMap<String, Object>> getOrderInfoList(OrderInfo orderInfo);
	
	//根据订单编号查询订单信息
	HashMap<String,Object> selectByOrderId(int orderId);
	
	//查询订单支付
	List<HashMap<String,Object>> selectPayByOrderId(int orderId);
	
	//查询订单账单交易明细
	List<HashMap<String,Object>> selectPayDetailByOrderId(int sellerId);
	/**
	 * @描述:<管理后台订单查询明细>
	 * @日期:2017年7月16日
	 * @作者:hesipeng
	 * @param orderInfoQueryVo
	 * @return <>
	 */
	List<OrderInfoCustom> selectOrderInfoListBySelective(OrderInfoQueryVo orderInfoQueryVo);
	/**
	 * @描述:<管理后台订单数据汇总>
	 * @日期:2017年7月16日
	 * @作者:hesipeng
	 * @param orderInfoQueryVo
	 * @return <>
	 */
	OrderInfoCustom selectOrderInfoSum(OrderInfoQueryVo orderInfoQueryVo);
	/**
	 * @描述:<商户端查询订单明细>
	 * @日期:2017年7月15日
	 * @作者:hesipeng
	 * @param orderInfoQueryVo
	 * @return 订单列表
	 */
	List<OrderInfoCustom> selectSellerOrderInfoListBySelective(OrderInfoQueryVo orderInfoQueryVo);
	/**
	 * @描述:<商户端订单数据汇总>
	 * @日期:2017年7月15日
	 * @作者:hesipeng
	 * @param orderInfoQueryVo
	 * @return 汇总数据
	 */
	OrderInfoCustom selectSellerOrderInfoSum(OrderInfoQueryVo orderInfoQueryVo);
	
	/**
	 * @描述:<买单收银页面查询>
	 * @日期:2017年7月16日
	 * @作者:hesipeng
	 * @param orderInfoQueryVo
	 * @return 订单列表页面
	 */
	List<OrderInfoCustom> selectSellerOrderInfoListForTwoDaysBySelective(OrderInfoQueryVo orderInfoQueryVo);
	
	
	/**
	 * @描述:<买单收银页面数据汇总>
	 * @日期:2017年7月16日
	 * @作者:hesipeng
	 * @param orderInfoQueryVo
	 * @return 汇总数据
	 */
	OrderInfoCustom selectSellerOrderInfoForTwoDaysSum(OrderInfoQueryVo orderInfoQueryVo);
	
	
	/**
	 * @描述:<商户后台财务对账列表>
	 * @日期:2017年7月19日
	 * @作者:hesipeng
	 * @param orderInfoQueryVo
	 * @return 统计列表
	 */
	List<OrderInfoCustom> selectFinancialAuditListBySelective(OrderInfoQueryVo orderInfoQueryVo);
	
	/**
	 * @描述:<商户后台财务对账>
	 * @日期:2017年7月19日
	 * @作者:hesipeng
	 * @param orderInfoQueryVo
	 * @return 财务后台对账统计数据
	 */
	OrderInfoCustom selectFinancialAuditListSum(OrderInfoQueryVo orderInfoQueryVo);
	
	/**
	 * @描述:<商户后台财务对账单日订单筛选>
	 * @日期:2017年7月19日
	 * @作者:hesipeng
	 * @param orderInfoQueryVo
	 * @return 数据列表
	 */
	List<OrderInfoCustom> selectFinancialAuditListForOneDayBySelective(OrderInfoQueryVo orderInfoQueryVo);
	
	/**
	 * @描述:<商户后台财务对账单日订单汇总>
	 * @日期:2017年7月19日
	 * @作者:hesipeng
	 * @param orderInfoQueryVo
	 * @return 汇总数据
	 */
	OrderInfoCustom selectFinancialAuditForOneDaySum(OrderInfoQueryVo orderInfoQueryVo);
	//更新订单状态
	int updateOrderStatusByOrderId(OrderInfo orderInfo);
	//根据条件筛选订单
	List<LinkedHashMap<String, Object>> getOrderInfoAllListByType(OrderInfo orderInfo);
	//根据条件统计商铺收入
	List<LinkedHashMap<String, Object>> getSellerIncomeAllListByType(OrderInfo orderInfo);
	//查询详细订单根据任务id
	List<LinkedHashMap<String, Object>> getOrderInfoListByTaskId(Integer id);
	//查询订单信息
	List<LinkedHashMap<String, Object>> getOrderInfoListById(Integer id);
	//查询店铺信息
	List<LinkedHashMap<String, Object>> getSellerInfoBySellerId(OrderInfo orderInfo);
	//查询优惠券信息
	List<LinkedHashMap<String, Object>> getCouponInfoBySellerId(OrderInfo orderInfo);
	//查询订单未完成
	List<LinkedHashMap<String, Object>> getOrderInfoByOrderStatus(OrderInfo orderInfo);
	//查询订单未完成数量
	List<LinkedHashMap<String, Object>> getOrderInfoNumByOrderStatus(OrderInfo orderInfo);
	//查询订单按日期分类
	List<LinkedHashMap<String, Object>> getfinancialAuditAllByType(OrderInfo orderInfo);
	List<LinkedHashMap<String, Object>> getOrderInfoAllListByCity(OrderInfo orderInfo);
	List<LinkedHashMap<String, Object>> getfinancialAuditAllBySellerId(OrderInfo orderInfo);
	//今日订单	
	List<LinkedHashMap<String, Object>> getfinancialAuditOneByTypeMgr(OrderInfo orderInfo);
	List<LinkedHashMap<String, Object>> getSellerIncomeAllListByTypeMgr(OrderInfo orderInfo);
	//商户结款付款订单
	List<LinkedHashMap<String, Object>> getpayForMoneyOneByTypeMgr(OrderInfo orderInfo);
	List<LinkedHashMap<String, Object>> getpayForMoneyOneNumByTypeMgr(OrderInfo orderInfo);
	//按日期、店铺统计订单数量和收支金额
	List<LinkedHashMap<String, Object>> getfinancialAuditNumByType(OrderInfo orderInfo);
	List<LinkedHashMap<String, Object>> getSellerIncomeAllNumByCity(OrderInfo orderInfo);
	List<LinkedHashMap<String, Object>> getfinancialAuditNumBySellerId(OrderInfo orderInfo);
	
    int updateOrderInfoById(Integer id);
    //商户结算查询商户结算信息
    List<LinkedHashMap<String, Object>> getFinancialAccountById(OrderInfo orderInfo);
    //查询店铺结算信息
    List<LinkedHashMap<String, Object>> getFinancialAccountListById(OrderInfo orderInfo);
    
    String selectCountTotal(String companyORseller);
    

    int deleteByPrimaryKey(Long id);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);


    OrderInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);

    
    /**
     * 运营数据订单统计
     * @param orderInfoQueryVo
     * @return
     */
    List<OrderInfoCustom> selectOrderCountListByOrderInfoQueryVo(OrderInfoQueryVo orderInfoQueryVo);
	
	//根据订单编号查询订单信息
	HashMap<String,Object> selectByOrderId(Long orderId);
	
	//查询订单支付
	List<HashMap<String,Object>> selectPayByOrderId(Long orderId);
	
	BigDecimal countAllBySellerIdAndTime(LinkedHashMap<String,Object> count);
	
	List<LinkedHashMap<String,Object>> getSellerInfoByType(LinkedHashMap<String,Object> obj);
	/**
	 * @描述:<查询商家消费情况>
	 * @日期:2017年7月1日
	 * @作者:hesipeng
	 * @param hashMap
	 * @return 消费列表
	 */
	List<Map<String,Object>> selectSellerPay(HashMap<String,Object> hashMap);
	/**
	 * @描述:<查询商家消费统计>
	 * @日期:2017年9月15日
	 * @作者:hesipeng
	 * @param hashMap
	 * @return 消费统计
	 */
	Map<String,Object> selectSellerPaySum(HashMap<String,Object> hashMap);
	LinkedHashMap<String,Object> getcountNumListBySellerId(LinkedHashMap<String,Object> obj);
	
	//待付款 数据统计
	List<LinkedHashMap<String,Object>> getfinancialUnpayStatic(OrderInfo orderInfo);
	//待付款账期时段
	List<LinkedHashMap<String,Object>> getfinancialUnpayDate(OrderInfo orderInfo); 
	//待付款 数据列表查询
	List<LinkedHashMap<String,Object>> getfinancialUnpayList(Map orderInfo);
	//准备查询待付款的订单时间范围
	OrderInfo getOrderUnpayTime(OrderInfo orderInfo); 
	//待付款日订单统计
	List<LinkedHashMap<String,Object>> getOrderUnpayStatic(OrderInfo orderInfo);
	//查询待付款的订单明细
	List<LinkedHashMap<String,Object>> getOrderUnpayList(OrderInfo orderInfo); 
	//订单情况统计
	List<Map<String,Object>> selectOrderMoneyByTime(HashMap<String,Object> time);
	
}