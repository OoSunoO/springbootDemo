package com.solar.service;


import com.solar.mapper.DemoMapper;
import com.solar.pojo.Fee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈业务层〉
 *
 * @author Sun
 * @create 2019/1/6
 * @since 1.0.0
 */
@Service
public class DemoService {
    @Autowired
    DemoMapper demoMapper;

    public Fee query(Long id) {
        Fee result = demoMapper.selectByPrimaryKey(id);
        System.out.println(result);
        return result;
    }
}