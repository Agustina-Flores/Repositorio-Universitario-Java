
package persistencia;

import modelo.*;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class ConfigHibernate {
   private static SessionFactory sessionFactory;

    public static void load(){

        try {
            AnnotationConfiguration config = new AnnotationConfiguration();
            config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/ormClinica");
            config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
            config.setProperty("hibernate.connection.username", "root");
            config.setProperty("hibernate.connection.password", ""); //cambiar
            config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
            config.setProperty("hibernate.show_sql", "true");
            config.setProperty("hibernate.hbm2ddl.auto", "update" );
            config.setProperty("hibernate.c3p0.min_size","0");
            config.setProperty("hibernate.c3p0.max_size","7");
            config.setProperty("hibernate.c3p0.timeout","100");
            config.setProperty("hibernate.c3p0.max_elements","100");
            config.setProperty("hibernate.c3p0.idle_test_period","100");
            config.setProperty("hibernate.c3p0.autoCommitOnClose","true");
            config.setProperty("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");

            config.addPackage("Entidades");
            config.addAnnotatedClass(DetalleHistoriaClinica.class);
            config.addAnnotatedClass(Domicilio.class);
            config.addAnnotatedClass(Empleado.class);
            config.addAnnotatedClass(Especialidad.class);
            config.addAnnotatedClass(HistoriaClinica.class);
            config.addAnnotatedClass(Medico.class);
            config.addAnnotatedClass(Paciente.class);
            config.addAnnotatedClass(Persona.class);
            config.addAnnotatedClass(Turno.class);

            sessionFactory = config.buildSessionFactory();
        }
        catch (Exception e) {
           System.out.println("Error: HibernateUtil.HibernateException: " + e.getMessage());
        }
        catch (Throwable ex) {
           ex.printStackTrace();
        }
    }

    public synchronized static Session openSession() {
		return getSessionFactory().openSession();
	}

	public static void closeSession(Session session) {
		session.close();
	}

	public synchronized static SessionFactory getSessionFactory() {
		if(sessionFactory == null)
			load();

		return sessionFactory;
	}

	public synchronized static void closeSessionFactory() {
		try {
			if(sessionFactory != null) {
				sessionFactory.close();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			sessionFactory = null;
		}
	}

	public boolean saveEntity(Session sezion, Object o) {
		Transaction tx = null;

		if(!sezion.getTransaction().isActive())
			tx = sezion.beginTransaction();

		sezion.saveOrUpdate(o);

		if(tx != null)
			tx.commit();

		return true;
	}

	public boolean deleteEntity(Session sezion, Object o) {
		Transaction tx = sezion.beginTransaction();

		sezion.delete(o);

		tx.commit();

		return true;
	}

	public boolean updateEntity(Session sezion, Object o) {
		Transaction tx = null;

		if(!sezion.getTransaction().isActive())
			tx = sezion.beginTransaction();

		sezion.update(o);

		if(tx != null)
			tx.commit();

		return true;
	}

	public boolean deleteEntitys(Session sezion, List entities) {

		for(Iterator i = entities.iterator(); i.hasNext();) {
			Object o = (Object)i.next();

			sezion.delete(o);
		}

		return true;
	}
	public void destroy() {
		closeSessionFactory();
	}

}
