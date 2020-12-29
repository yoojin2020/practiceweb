package com.bitcamp.practiceweb.test.mapper;

import com.bitcamp.practiceweb.test.vo.TestVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TestMapper {
    List<TestVo> selectTest();
}
