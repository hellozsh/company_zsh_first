package company.zsh.first.dao.custom;

import company.zsh.first.model.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.Date;
import java.util.List;

/**
 * @author zhousuhua
 * @date 26/1/21 下午3:10
 */

@Mapper
public interface PersonMapper {

    int insertPerson();

    /*
    没有用@Param, 于是mybatis默认为_prameter的变量引用此实例，在xml中访问
    */
    int insertOnePerson(Person person);

    int insertOnePersonWithTime(@Param("person") Person person, @Param("time")Date time);

    int insertOnePersonReturnId(@Param("person") Person person, @Param("time")Date time);

    List<Person> selectPersons();

    int updatePerson();

    void deletePerson(Integer id);
}
