package cn.whao.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Result
 * Package: cn.whao.common
 * Description:
 *
 * @Author wanghao
 * @Create 2024-06-24 14:58
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    private String code;
    private String info;

    public static Result buildSuccess() {
        return new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo());
    }


    public static Result buildFail() {

        return new Result(Constants.ResponseCode.UN_ERROR.getCode(), Constants.ResponseCode.UN_ERROR.getInfo());
    }
}
