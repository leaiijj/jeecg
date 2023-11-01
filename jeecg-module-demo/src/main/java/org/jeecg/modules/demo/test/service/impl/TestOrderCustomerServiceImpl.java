package org.jeecg.modules.demo.test.service.impl;

import org.jeecg.modules.demo.test.entity.TestOrderCustomer;
import org.jeecg.modules.demo.test.mapper.TestOrderCustomerMapper;
import org.jeecg.modules.demo.test.service.ITestOrderCustomerService;
import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: 订单客户
 * @Author: jeecg-boot
 * @Date:   2023-11-01
 * @Version: V1.0
 */
@Service
public class TestOrderCustomerServiceImpl extends ServiceImpl<TestOrderCustomerMapper, TestOrderCustomer> implements ITestOrderCustomerService {
	
	@Autowired
	private TestOrderCustomerMapper testOrderCustomerMapper;
	
	@Override
	public List<TestOrderCustomer> selectByMainId(String mainId) {
		return testOrderCustomerMapper.selectByMainId(mainId);
	}
}
