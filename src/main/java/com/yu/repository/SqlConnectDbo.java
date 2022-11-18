package com.yu.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.yu.model.*;
@Repository
public class SqlConnectDbo {
	@Autowired
	JdbcTemplate jdbcTemplate;

	static final String SQL = "select * from Customer1";

	public List<Customer1> Read() {
		List<Customer1> customers = new ArrayList<Customer1>();

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL);

		for (Map<String, Object> row : rows) {
			Customer1 customer = new Customer1();

			customer.setCustNo((int) row.get("Cust_id"));
			customer.setCustName((String) row.get("Cust_name"));
			customer.setCountry((String) row.get("Country"));

			customers.add(customer);
		}

		return customers;

	}

}
