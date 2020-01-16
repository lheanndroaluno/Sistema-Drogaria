package br.com.proj.drogaria.util;

import org.hibernate.Session;
import org.junit.Test;

public class HibernateUtilTestes {
	@Test
	public void conectar() {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSessoes().close();
	}

}
