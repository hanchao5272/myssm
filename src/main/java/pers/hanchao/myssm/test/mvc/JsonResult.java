package pers.hanchao.myssm.test.mvc;

import java.util.List;
import java.util.Objects;

public class JsonResult<E> {
    /** 响应状态 */
    private Integer code = 1;
    /** 响应消息 */
    private String message = "success!";
    /** 响应内容 */
    private List<E> list;

    /**
     * <p>添加一个对象</p>
     * @author hanchao 2018/2/8 23:27
     **/
    public void addList(E object) {
        this.list.add(object);
    }
    @Override
    public String toString() {
        return "JsonResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", list=" + list +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JsonResult<?> that = (JsonResult<?>) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(message, that.message) &&
                Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {

        return Objects.hash(code, message, list);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<E> getList() {
        return list;
    }

    public void setList(List<E> list) {
        this.list = list;
    }
}
