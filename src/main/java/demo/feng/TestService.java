package demo.feng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TestService {

    @Autowired
    private TestDao testDao;

    public void aa() {

        testDao.aa();

    }

    public void userdelete(int id) {
        testDao.userdelete(id);
    }


    public List<User> queryUser() {

        return testDao.userquery();

    }

    public void insert(User user) {
        testDao.insertuser(user);
//        int a=1/0;
//        报错在 service 里有用  事务
    }

    public void update(User user) {

        testDao.userupdate(user);

    }

    public User queryid(int id) {
        User user = testDao.queryid(id);

        return user;
    }

}
