package com.company.project.entity.sys;

import com.company.project.entity.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 代码生成
 *
 * @author wenbin
 * @version V1.0
 * @date 2020年3月18日
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysGenerator extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String tableName;

    private Date createTime;

    private String tableComment;

}
