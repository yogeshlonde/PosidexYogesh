package com.hba.accessor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hba.entities.Singer;
import com.hba.helper.SessionFactoryHelper;

public class SingerAccessor {
	public Singer getSinger(int singerId) {
		Singer singer = null;
		SessionFactory sessionFactory = null;
		Session session = null;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			singer = (Singer) session.get(Singer.class, singerId);
		}finally {
			if (session != null) {
				session.close();
			}
		}
		return singer;
	}
	
	public int saveSinger(Singer singer) {
		Session session = null;
		Transaction transaction = null;
		SessionFactory sessionFactory = null;
		boolean flag = false;
		int result = 0;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			result = (int) session.save(singer);
			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				}else {
					transaction.rollback();
				}
			}
			if (session != null) {
				session.close();
			}
		}
		return result;
	}
}



















