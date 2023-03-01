package zhihu.A_PatternOfBuilder.A3_BuilderPattern.A_JavaObjType;

public class Customer {

    public static void main(String[] args) {
        // 购买一杯原味奶茶
        MilkTea milkTea = new MilkTea.Builder("原味").build();
        show(milkTea);

        // 购买一杯巧克力味不加冰奶茶
        MilkTea milkTea2 = new MilkTea.Builder("原味").setIce(false).build();
        show(milkTea2);

        // 购买一杯草莓味大杯加冰不加珍珠的奶茶
        MilkTea milkTea3 = new MilkTea.Builder("原味").setSize("大杯").setPearl(false).setIce(true).build();
        show(milkTea3);
    }

    private static void show(MilkTea milkTea) {
        String pearl;
        if (milkTea.getPearl()) {
            pearl = "加珍珠";
        } else {
            pearl = "不加珍珠";
        }
        String ice;
        if (milkTea.getIce()) {
            ice = "加冰";
        } else {
            ice = "不加冰";
        }
        System.out.println("一份" + milkTea.getSize() + "、"
                + pearl + "、"
                + ice + "的"
                + milkTea.getType() + "奶茶");
    }
}
