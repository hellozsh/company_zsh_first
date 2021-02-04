package company.zsh.first.service;

import company.zsh.first.dao.auto.TPersonMapper;
import company.zsh.first.model.auto.TPerson;
import company.zsh.first.model.auto.TPersonExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhousuhua
 * @date 3/2/21 下午7:40
 */
@Service
public class AutoService {

    @Autowired
    private TPersonMapper tPersonMapper;

    public List<TPerson> getPersonInPage(Integer page, Integer pageSize) {

        // TPersonExample 条件过滤类
        TPersonExample personExample = new TPersonExample();

        personExample.or()
                .andAgeNotBetween(0, 10);

        personExample.or()
                .andAgeIn(Arrays.asList(19, 29, 39));

        personExample.setOrderByClause("id");

        personExample.setLimit(pageSize);

        personExample.setOffset(page * pageSize);

        return tPersonMapper.selectByExample(personExample);
    }
}
