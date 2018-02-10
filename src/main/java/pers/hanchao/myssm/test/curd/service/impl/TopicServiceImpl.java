package pers.hanchao.myssm.test.curd.service.impl;

import com.github.pagehelper.PageHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.hanchao.myssm.test.curd.dao.TopicDao;
import pers.hanchao.myssm.test.curd.entity.TopicEntity;
import pers.hanchao.myssm.test.curd.service.TopicService;

import java.util.List;

/**
 * <p>增删改查简单测试+事务</p>
 * @author hanchao 2018/2/8 23:43
 **/
@Service
public class TopicServiceImpl implements TopicService {
    private static final Logger LOGGER = Logger.getLogger(TopicServiceImpl.class);

    @Autowired
    private TopicDao topicDao;

    /**
     * <p>简单测试事务注解和增删改查</p>
     * @author hanchao 2018/2/8 23:45
     **/
    @Override
    public void curdTest() {
        //查询所有
        LOGGER.info("查询所有");
        LOGGER.info(this.topicDao.selectAll());
        //查询所有(分页)
        System.out.println();
        PageHelper.startPage(0,10);
        LOGGER.info("查询所有（分页）");
        //将Page类型转换成List
        List<TopicEntity> topicEntityList = topicDao.selectAll();
        LOGGER.info(topicEntityList);
        //通过lambda表达式输出集合信息
        topicEntityList.forEach(LOGGER::info);
        //插入一个，查询所有
        System.out.println();
        LOGGER.info("插入一个");
        TopicEntity newTopic = new TopicEntity();
        newTopic.setId(100);
        newTopic.setTitle("新增的标题");
        newTopic.setScore(200);
        newTopic.setAnswer("新增的答案");
        this.topicDao.insert(newTopic);
        LOGGER.info(this.topicDao.selectAll());
        //查询一个
        System.out.println();
        LOGGER.info("查询一个");
        LOGGER.info(this.topicDao.selectByPrimaryKey(99999));
        //修改一个，然后查询
        System.out.println();
        LOGGER.info("修改一个");
        newTopic = new TopicEntity();
        newTopic.setId(1);
        newTopic.setTitle("修改的标题");
        newTopic.setScore(1000);
        newTopic.setAnswer("修改的答案");
        this.topicDao.updateByPrimaryKey(newTopic);
        LOGGER.info(this.topicDao.selectByPrimaryKey(99999));
        //删除一个，然后查询
        System.out.println();
        LOGGER.info("删除一个，然后查询");
        this.topicDao.deleteByPrimaryKey(99999);
        LOGGER.info(this.topicDao.selectByPrimaryKey(99999));
    }
}
