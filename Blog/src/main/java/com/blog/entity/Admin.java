package com.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String avatar;
    private Date createTime;
    private Date updateTime;

    private List<Blog> blogs = new ArrayList<>();
}
