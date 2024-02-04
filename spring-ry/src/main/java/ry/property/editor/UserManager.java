package ry.property.editor;

import java.util.Date;

/**
 * @author: xzy
 * @date: 2024/1/16
 */
public class UserManager {
    private Date dataValue;

    public Date getDataValue() {
        return dataValue;
    }

    public void setDataValue(Date dataValue) {
        this.dataValue = dataValue;
    }

    @Override
    public String toString() {
        return "UserManager{" +
                "dataValue=" + dataValue +
                '}';
    }
}
