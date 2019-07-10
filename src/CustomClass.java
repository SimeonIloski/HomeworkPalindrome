import java.util.Objects;

public class CustomClass {
   private String parameter1;
   private String parameter2;

    public CustomClass(String parameter1, String parameter2) {
        this.parameter1 = parameter1;
        this.parameter2 = parameter2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomClass that = (CustomClass) o;
        return parameter1.equals(that.parameter1) &&
                parameter2.equals(that.parameter2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameter1, parameter2);
    }
}
