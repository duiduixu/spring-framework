package ry.property.editor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import java.util.Date;

/**
 * @author: xzy
 * @date: 2024/1/22
 */
public class DataPropertyEditorRegistrar implements PropertyEditorRegistrar {

    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry){
        registry.registerCustomEditor(Date.class, new DatePropertyEditor());
    }
}
