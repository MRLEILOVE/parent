package com.leigq.springboot.core;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

/**
 * <p>
 *
 * @author: asus
 * @date: 2018-12-07 09:33
 */
@Data
public class User {

    @Excel(name = "ID")
    private Long id;
    @Excel(name = "用户名")
    private String userName;
    @Excel(name = "密码")
    private String password;
    @Excel(name = "真实姓名")
    private String trueName;

}
