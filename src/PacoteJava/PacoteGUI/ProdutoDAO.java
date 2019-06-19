package PacoteJava.PacoteGUI;

import java.sql.*;
import java.util.*;

public class ProdutoDAO {

    private Connection con;

    public ProdutoDAO(Connection con) {
        setCon(con);
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

}
