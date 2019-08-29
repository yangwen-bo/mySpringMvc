package com.myspringmvc;

/**
 * @Author yangwen-bo
 * @Date 2019/8/27.
 * @Version 1.0
 *
 * 自定义视图解析器 用于将业务方法的返回值解析为物理视图 + 模型数据，返回客户端
 */
public class MyViewResolver {
    private String prefix;
    private String suffix;
    public String getPrefix() {
        return prefix;
    }
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    public String getSuffix() {
        return suffix;
    }
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
    @Override
    public String toString() {
        return "MyViewResolver [prefix=" + prefix + ", suffix=" + suffix + "]";
    }

    public String jspMapping(String value){
        return this.prefix+value+this.suffix;
    }
}
