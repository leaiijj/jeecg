package org.jeecg.modules.demo.test.mapper;

import java.util.List;
import org.jeecg.modules.demo.test.entity.TestOrderCustomer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: 订单客户
 * @Author: jeecg-boot
 * @Date:   2023-11-01
 * @Version: V1.0
 */
public interface TestOrderCustomerMapper extends BaseMapper<TestOrderCustomer> {

	/**
	 * 通过主表id删除子表数据
	 *
	 * @param mainId 主表id
	 * @return boolean
	 */
	public boolean deleteByMainId(@Param("mainId") String mainId);

  /**
   * 通过主表id查询子表数据
   *
   * @param mainId 主表id
   * @return List<TestOrderCustomer>
   */
	public List<TestOrderCustomer> selectByMainId(@Param("mainId") String mainId);
}
