package org.jeecg.modules.demo.test.service;

import org.jeecg.modules.demo.test.entity.TestOrderCustomer;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * @Description: 订单客户
 * @Author: jeecg-boot
 * @Date:   2023-11-01
 * @Version: V1.0
 */
public interface ITestOrderCustomerService extends IService<TestOrderCustomer> {

	/**
	 * 通过主表id查询子表数据
	 *
	 * @param mainId 主表id
	 * @return List<TestOrderCustomer>
	 */
	public List<TestOrderCustomer> selectByMainId(String mainId);
}
