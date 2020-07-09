package ndk.printing_press.dal;

import DSST007_1_CUS13.pll.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import ndk.printing_press.model.CustomerModal;

public class CustomerDAL {

    public List<CustomerModal> getCustomers() {

        @SuppressWarnings("CollectionWithoutInitialCapacity")
        List<CustomerModal> customers = new ArrayList<>();

        PreparedStatement preparedStatement;
        ResultSet resultSet;

        try {
            String sql = "SELECT\n"
                    + "  `id`,\n"
                    + "  `name`,\n"
                    + "  `address1`,\n"
                    + "  `address2`,\n"
                    + "  `city`,\n"
                    + "  `district`,\n"
                    + "  `state`,\n"
                    + "  `country`,\n"
                    + "  `pincode`,\n"
                    + "  `regdate`,\n"
                    + "  `phone2`,\n"
                    + "  `phone1`,\n"
                    + "  `fax`,\n"
                    + "  `email`,\n"
                    + "  `bankname`,\n"
                    + "  `accname`,\n"
                    + "  `branch`,\n"
                    + "  `ifsc`,\n"
                    + "  `accno`,\n"
                    + "  `userid`,\n"
                    + "  `process`,\n"
                    + "  `datetime`,\n"
                    + "  `customerid`,\n"
                    + "  `CST`,\n"
                    + "  `TIN`,\n"
                    + "  `GSTIN`,\n"
                    + "  `PAN`\n"
                    + "FROM\n"
                    + "  `customer_registration`;";

            preparedStatement = DatabaseConnection.createConnection().prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                CustomerModal customer = new CustomerModal();
                customer.setName(resultSet.getString("name"));
                customers.add(customer);
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " :" + e);
        }
        return customers;
    }
}
