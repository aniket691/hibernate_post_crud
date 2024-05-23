package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entities.Post;
import com.app.utils.HibernateUtils;

public class PostDaoImpl implements PostDao {

	public void createPost(Post post) {
		Transaction transaction = null;
		try (Session session = HibernateUtils.getFactory().openSession()) {
			transaction = session.beginTransaction();
			session.save(post);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	@Override
	public Post getPost(Long id) {
		try (Session session = HibernateUtils.getFactory().openSession()) {
			return session.get(Post.class, id);
		}
	}

	@Override
	public void updatePost(Post post) {
		Transaction transaction = null;
		try (Session session = HibernateUtils.getFactory().openSession()) {
			transaction = session.beginTransaction();
			session.update(post);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	@Override
	public void deletePost(Long id) {
		Transaction transaction = null;
		try (Session session = HibernateUtils.getFactory().openSession()) {
			transaction = session.beginTransaction();
			Post post = session.get(Post.class, id);
			if (post != null) {
				session.delete(post);
				transaction.commit();
			}
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	@Override
	public List<Post> getAllPosts() {
		try (Session session = HibernateUtils.getFactory().openSession()) {
			return session.createQuery("from Post", Post.class).list();
		}
	}
}
