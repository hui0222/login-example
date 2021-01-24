package com.example.login.dao;

import com.example.login.domain.Member;

import java.util.List;


public interface UserMapper {

    public Member readUser(String username);

    public List<String> readAuthority(String username);

}