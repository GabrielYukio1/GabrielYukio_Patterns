public class PercentageDiscount implements DiscountStrategy {
    private final double percent;

    public PercentageDiscount(double percent) {
        this.percent = percent;
    }

    @Override
    public double apply(double subtotal) {
        return Math.max(0, subtotal * (1 - percent / 100));
    }
}
