package com.fathyman.mapper;

import com.fathyman.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    public List<User> findAll();
}
