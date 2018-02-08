package pers.hanchao.myssm.test.curd.dao;

import org.springframework.stereotype.Repository;
import pers.hanchao.myssm.test.curd.entity.TopicEntity;
import java.util.List;

/**
 * <p>话题Dao</p>
 * @author hanchao 2018/2/8 23:39
 **/
@Repository
public interface TopicDao {
    /**
     * 根据主键删除数据库的记录
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(TopicEntity record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    TopicEntity selectByPrimaryKey(Integer id);

    /**
     * 获取全部数据库记录
     *
     */
    List<TopicEntity> selectAll();

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(TopicEntity record);
}