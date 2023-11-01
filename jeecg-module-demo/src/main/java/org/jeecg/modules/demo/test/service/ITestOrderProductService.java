package org.jeecg.modules.demo.test.service;

import org.jeecg.modules.demo.test.entity.TestOrderProduct;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * @Description: 订单产品明细
 * @Author: jeecg-boot
 * @Date:   2023-11-01
 * @Version: V1.0
 */
public interface ITestOrderProductService extends IService<TestOrderProduct> {

	/**
	 * 通过主表id查询子表数据
	 *
	 * @param mainId 主表id
	 * @return List<TestOrderProduct>
	 */
	public List<TestOrderProduct> selectByMainId(String mainId);
}
