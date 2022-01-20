package jpabook.jpashop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        //em은 사용하고 바로바로 버려야한다
        EntityManager em = emf.createEntityManager();
        // 모든데이터 변경은 transaction 안에서 실행해야한다
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        //code
        try {


            tx.commit(); // DB에 쿼리가 날라가는 순간
        }catch (Exception e){
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
