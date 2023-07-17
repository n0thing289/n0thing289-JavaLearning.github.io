package dao_.test;

import dao_.dao.ActorDAO;
import dao_.domain.Actor;
import org.junit.Test;

import java.util.List;

public class testDAO {
    @Test
    //测试ActorDAO 对actor表的crud
    public void testActorDAO(){
        ActorDAO actorDAO = new ActorDAO();
        //1. 查询
        List<Actor> actors = actorDAO.queryMultiply("select * from actor where id >= ?", Actor.class, 1);
        for (Actor a :
                actors) {
//            System.out.println(a);
        }

        //2. 查询单行记录
        Actor actor = actorDAO.querySingle("select * from actor where id >= ?", Actor.class, 1);
        System.out.println(actor);

        //3. 查询单行单列
        Object o = actorDAO.queryScalar("select name from actor where id >= ?", 6);
        System.out.println(o);

        //4. dml
        int update = actorDAO.update("insert into actor values(9, 'DAO','男', '2000-1-1', '119')");
        System.out.println(update>0?"ok":"没有影响");
    }

}
