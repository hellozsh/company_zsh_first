package company.zsh.first.service;

import company.zsh.first.dao.custom.PersonMapper;
import company.zsh.first.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author zhousuhua
 * @date 25/1/21 下午9:46
 */
@Service
public class FirstService {

    @Autowired
    private PersonMapper personMapper;

    public void addOnePerson() {
        System.out.println(" zhousuhua ======== 开始写入数据  personMapper:"+personMapper.toString());
        personMapper.insertPerson();
    }

    public int addOnePerson(Person person) {

      return personMapper.insertOnePerson(person);
    }

    public int addOnePersonWithTime(Person person, Date time) {

        return personMapper.insertOnePersonWithTime(person, time);
    }

    public Long addOnePersonReturnId(Person person, Date time) {

        personMapper.insertOnePersonReturnId(person, time);
        return person.getId();
    }

    public List<Person> getPersons() {

      return personMapper.selectPersons();
    }

    public void deletePerson(Integer id) {

        personMapper.deletePerson(id);
    }
}
