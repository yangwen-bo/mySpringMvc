/**
 * @Author yangwen-bo
 * @Date 2019/8/28.
 * @Version 1.0
 */
public interface myInterface {
    public boolean contains(String mobile);

    public static final class InterClass implements myInterface{
        //由自己创建自己的实例化对象
        private static final InterClass instance = new InterClass();
        //外部获取此实例化对象
        public static final InterClass getInterClass(){
            return instance;
        }

        //具体实现contains的那个类 在这里做此内部类的一个私有属性
        private specificClass specificClass;

        public specificClass getSpecificClass(){
            return specificClass;
        }

        public void setSpecificClass(specificClass specificClass){
            this.specificClass = specificClass;
        }

        //实现该对外提供的方法
        public boolean contains(String mobile) {
            return specificClass.contains(mobile);
        }
    }
}
