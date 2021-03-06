package by.suprun.task1.entity;

import java.util.Objects;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class CustomArrayParameters {
    private OptionalInt max;
    private OptionalInt min;
    private OptionalDouble avg;
    private OptionalDouble sum;

    public CustomArrayParameters() {
    }

    public CustomArrayParameters(int newMax, int newMin, double newAvg, long newSum) {
        max = OptionalInt.of(newMax);
        min = OptionalInt.of(newMin);
        avg = OptionalDouble.of(newAvg);
        sum = OptionalDouble.of(newSum);
    }

    public OptionalInt getMax() {
        return max;
    }

    public void setMax(int newMax) {
        max = OptionalInt.of(newMax);
    }

    public void setMin(int newMax) {
        min = OptionalInt.of(newMax);
    }

    public OptionalInt getMin() {
        return min;
    }

    public void setAvg(double newMax) {
        avg = OptionalDouble.of(newMax);
    }

    public OptionalDouble getAvg() {
        return avg;
    }

    public OptionalDouble getSum() {
        return sum;
    }

    public void setSum(double newMax) {
        sum = OptionalDouble.of(newMax);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArrayParameters temp = (CustomArrayParameters) o;
        return Objects.equals(sum, temp.sum) && Objects.equals(max, temp.max)
                && Objects.equals(min, temp.min) && Objects.equals(avg, temp.avg);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ArrayStatistics{");
        sb.append("max = ").append(max.getAsInt());
        sb.append(", min = ").append(min.getAsInt());
        sb.append(", avg = ").append(avg.getAsDouble());
        sb.append(", sum = ").append(sum.getAsDouble());
        sb.append('}');
        return sb.toString();
    }


}
