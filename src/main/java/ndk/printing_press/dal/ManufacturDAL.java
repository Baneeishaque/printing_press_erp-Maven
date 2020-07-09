package ndk.printing_press.dal;

import DSST007_1_CUS13.pll.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ndk.printing_press.model.ManufacturerModal;

public class ManufacturDAL {
    
    public List<ManufacturerModal> getMfrList() throws SQLException {
    
        Connection con;
        PreparedStatement prepstmt;
        ResultSet rs;
        @SuppressWarnings("CollectionWithoutInitialCapacity")
        List<ManufacturerModal> manufacturers = new ArrayList<>();

        con = DatabaseConnection.createConnection();

        //TODO : Use Model
        String sql = "SELECT DISTINCT mfrname FROM mfr_registration";
        prepstmt = con.prepareStatement(sql);
        rs = prepstmt.executeQuery();
        
        while (rs.next()) {
        
            ManufacturerModal manufacturer=new ManufacturerModal();
            manufacturer.setMfrName(rs.getString("mfrname"));
            manufacturers.add(manufacturer);
        }

        rs.close();
        prepstmt.close();
        con.close();

        return manufacturers;
    }
}
