package pers.hanchao.myssm.test.file;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import pers.hanchao.myssm.test.mvc.JsonResult;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * 简单的文件上传：用于展示MultiPartFile
 * Created by 韩超 on 2018/2/8.
 */
@Component
@RequestMapping("file")
public class FileUtilsDemo {
    private final static Logger LOGGER = Logger.getLogger(FileUtilsDemo.class);

    /**
     * <p>Title: 文件上传</p>
     * @author 韩超@bksx 2018/2/8 11:12
     */
    @PostMapping("/upload")
    public String upload(HttpServletRequest request, @RequestBody MultipartFile[] multiFiles,Model model){
        //获取上传根目录
        String uploadRootPath = request.getServletContext().getRealPath("upload");
        LOGGER.info("当前上传文件根路径：" + uploadRootPath);
        File rootFile = new File(uploadRootPath);
        //判断目录是否存在，不存在层级目录
        if (!rootFile.exists()){
            rootFile.mkdirs();
        }
        //设置返回值，默认为成功
        JsonResult jsonResult = new JsonResult();
        //上传目录
        try {
            for (MultipartFile file : multiFiles){
                //如果文件不为空，则可以上传
                if (null != file){
                    File serverFile = new File(rootFile.getAbsolutePath() + File.separator + file.getOriginalFilename());
                    LOGGER.info("当前上传文件路径：" + serverFile.getAbsolutePath());
                    if (serverFile.exists()){
                        serverFile.delete();
                    }
                    file.transferTo(serverFile);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            LOGGER.info("文件上传失败！");
            //设置返回消息为失败
            jsonResult.setCode(-1);
            jsonResult.setMessage("文件上传失败！");
        }
        model.addAttribute("result",jsonResult);
        return "test/file";
    }
}
