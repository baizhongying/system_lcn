package com.bai.system.common.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultData{
    /**
     * 状态
     */
    public String status = "SUCCESS";
    /**
     * 状态名称
     */
    public String statusName;
    /**
     * 状态
     */
    public Object data;
}
