package pers.hanchao.myssm.test.mvc;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.List;

/**
 * <p>校验工具类</p>
 * @author hanchao 2018/2/7 23:34
 **/
public class ValidationUtils {

    /**
     * <p>进行校验，如果有错误，将结果赋给jsonResult，并返回false;如果无错误，则返回true</p>
     * @author hanchao 2018/2/7 23:33
     **/
    public static boolean validateAndSetJsonResult(BindingResult bindingResult, JsonResult jsonResult){
        if (bindingResult.hasErrors()){
            StringBuffer errors = new StringBuffer();
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            for (ObjectError objectError : allErrors){
                errors.append(objectError.getDefaultMessage() + "\n");
            }
            jsonResult.setCode(-1);
            jsonResult.setMessage(errors.toString());
            return false;
        }else {
            return true;
        }
    }
}
