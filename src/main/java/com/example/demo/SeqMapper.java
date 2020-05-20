package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SeqMapper {

    void createSequence(@Param("name") String name,
                        @Param("step") Integer step);
}
