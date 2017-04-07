package com.unai;

import static org.jooq.impl.DSL.using;
import static com.unai.jooq.generated.Tables.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;

public class App {
	
	private static final String username = "postgres";
	private static final String password = "unai";
	private static final String url = "jdbc:postgresql://localhost:5432/test";
	
	public static void main(String [] args) {
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			DSLContext create = using(conn, SQLDialect.POSTGRES_9_5);
			Result<Record> result = create.select().from(TEST).fetch();
			
			result.forEach(r -> {
				Integer id = r.getValue(TEST.ID);
				String firstName = r.getValue(TEST.FIRSTNAME);
				String lastName = r.getValue(TEST.LASTNAME);
				
				System.out.println(String.format("ID: %d, first name: %s, last name: %s", id, firstName, lastName));
			});
			
			create.insertInto(TEST).columns(TEST.ID, TEST.FIRSTNAME, TEST.LASTNAME).values(100, "Iratxe", "Gonzalez").execute();
			
			System.out.println("Values now are:");
			result = create.select().from(TEST).fetch();
			result.forEach(r -> {
				Integer id = r.getValue(TEST.ID);
				String firstName = r.getValue(TEST.FIRSTNAME);
				String lastName = r.getValue(TEST.LASTNAME);
				
				System.out.println(String.format("ID: %d, first name: %s, last name: %s", id, firstName, lastName));
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}