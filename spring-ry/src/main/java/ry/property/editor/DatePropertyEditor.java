package ry.property.editor;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: xzy
 * @date: 2024/1/16
 */
public class DatePropertyEditor extends PropertyEditorSupport {
    private String format = "yyyy-MM-dd";

    public void setFormat(String format) {
        this.format = format;
    }
    @Override
    public void setAsText(String s) throws IllegalArgumentException {
        System.out.println("arg0:" + s);
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            Date d = sdf.parse(s);
            this.setValue(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
