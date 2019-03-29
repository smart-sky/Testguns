package cn.stylefeng.guns.modular.order.dao;

import cn.stylefeng.guns.modular.order.po.BizOrder;
import cn.stylefeng.guns.modular.order.po.BizOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BizOrderMapper {
    int countByExample(BizOrderExample example);

    int deleteByExample(BizOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BizOrder record);

    int insertSelective(BizOrder record);

    List<BizOrder> selectByExample(BizOrderExample example);

    BizOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BizOrder record, @Param("example") BizOrderExample example);

    int updateByExample(@Param("record") BizOrder record, @Param("example") BizOrderExample example);

    int updateByPrimaryKeySelective(BizOrder record);

    int updateByPrimaryKey(BizOrder record);
}