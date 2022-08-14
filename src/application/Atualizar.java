package application;

import java.sql.Connection;
import java.sql.PreparedStatement;

import db.DB;

public class Atualizar {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
		}
	}

}
