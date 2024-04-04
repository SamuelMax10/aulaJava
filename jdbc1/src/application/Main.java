package application;

import db.DB;
import db.DbExeption;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        Connection con = DB.getConexao();
        DB.fechaConexao();
    }
}