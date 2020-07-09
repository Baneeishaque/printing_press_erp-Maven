package ndk.printing_press.bll;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import ndk.printing_press.dal.ManufacturDAL;
import ndk.printing_press.model.ManufacturerModal;

public class ManufacturBLL {

    public List<ManufacturerModal> getmanufactures() throws SQLException {

        return new ManufacturDAL().getMfrList();
    }

    public void loadManufacturerJComboBox(JComboBox<ManufacturerModal> jComboBoxManufacturer) {

        try {
            jComboBoxManufacturer.removeAllItems();

            List<ManufacturerModal> mfrList = getmanufactures();

            for (int i = 0; i < mfrList.size(); i++) {

                jComboBoxManufacturer.addItem(mfrList.get(i));
            }
            jComboBoxManufacturer.setSelectedItem("");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }
}
