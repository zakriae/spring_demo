package country.service.impl;

import org.springframework.beans.factory.FactoryBean;

public class GermanyBeanFactory implements FactoryBean<Germany> {
	@Override
	public Germany getObject() throws Exception {
		return new Germany();
	}
	
	@Override
	public Class<?> getObjectType() {
		return Germany.class;
	}
	
	@Override
	public boolean isSingleton() {
		return false;
	}
}
