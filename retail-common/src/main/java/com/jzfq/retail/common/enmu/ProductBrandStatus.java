package com.jzfq.retail.common.enmu;

/**
 * @Author lizhe lizhe@juzifenqi.com
 * @Date 2018年06月27日 16:34
 * @Description: 商品品牌审核状态
 */
public enum ProductBrandStatus {

    CREATE(0,"创建"),
    UNDER_REVIEW(1,"提交审核"),
    AUDIT_SUCCESS(2,"显示中"),
    AUDIT_FAILURE(3,"审核失败"),
    DELETE(4,"删除");

    /**
     * 返回码
     */
    private int code;

    /**
     * 返回结果描述
     */
    private String message;

    ProductBrandStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
