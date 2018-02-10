package pers.hanchao.myssm.test.curd.service;

import org.springframework.transaction.annotation.Transactional;

public interface TopicService {
    @Transactional
    void curdTest();
}
