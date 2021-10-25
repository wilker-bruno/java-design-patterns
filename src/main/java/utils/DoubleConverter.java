package utils;

import com.opencsv.bean.AbstractBeanField;

public class DoubleConverter extends AbstractBeanField<String, Double> {
    @Override
    protected Object convert(String value) {
        if (value.contains("\""))
            value = value.replace("\"", "");
        if (value.contains(","))
            value = value.replace(",", ".");
        return Double.parseDouble(value);
    }
}
