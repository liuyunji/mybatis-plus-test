package com.awake.demo2.mybatisplustestdemo2.sys.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author awake
 * @since 2019-04-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Getter
@Setter
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String userName;

    private String password;

    private Integer age;

    private Integer sex;


}
