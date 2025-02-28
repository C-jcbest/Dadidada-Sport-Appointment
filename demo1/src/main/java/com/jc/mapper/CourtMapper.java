package com.jc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jc.entity.pojo.Court;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CourtMapper extends BaseMapper<Court> {
    List<Court> selectAll();
}
