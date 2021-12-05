package country.dao;

import country.service.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class DataAccessImpl implements DataAccess {
	@Autowired
	DataSource dataSource;
	
	@Override
	public Country getCountryByCode() {
		try {
			
			Connection connection = dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT 1;");
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				resultSet.getInt(1);
			}
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return null;
	}
}
