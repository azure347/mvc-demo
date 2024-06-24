package cn.whao.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * ClassName: Constans
 * Package: cn.whao.common
 * Description:
 *
 * @Author wanghao
 * @Create 2024-06-24 14:56
 * @Version 1.0
 */
public class Constants {

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public enum ResponseCode {
        SUCCESS("0000", "成功"),
        UN_ERROR("0001", "未知失败"),
        ILLEGAL_PARAMETER("0002", "非法参数"),
        INDEX_DUP("0003", "主键冲突");

        private String code;
        private String info;
    }
}
