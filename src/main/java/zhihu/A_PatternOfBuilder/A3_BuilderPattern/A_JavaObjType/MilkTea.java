package zhihu.A_PatternOfBuilder.A3_BuilderPattern.A_JavaObjType;

/**
 * 目前常用构建者模式
 */
public class MilkTea {

    private final String type;

    private final String size;

    private final Boolean pearl;

    private final Boolean ice;

    public MilkTea(Builder builder) {
        this.type = builder.type;
        this.size = builder.size;
        this.pearl = builder.pearl;
        this.ice = builder.ice;
    }


    public static class Builder{
        private final String type;

        // 默认中杯
        private String size = "中杯";

        // 默认加珍珠
        private Boolean pearl = true;

        // 默认不加冰
        private Boolean ice = false;

        /**
         * 构造函数则为必填项
         * @param type
         */
        public Builder(String type) {
            this.type = type;
        }

        /**
         * 设置备选项并返回Builder对象
         * @param size
         * @return
         */
        public Builder  setSize(String size) {
            this.size = size;
            return this;
        }

        public Builder  setPearl(Boolean pearl) {
            this.pearl = pearl;
            return this;
        }

        public Builder  setIce(Boolean ice) {
            this.ice = ice;
            return this;
        }

        public MilkTea build(){
            return new MilkTea(this);
        }
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public Boolean getPearl() {
        return pearl;
    }

    public Boolean getIce() {
        return ice;
    }
}
