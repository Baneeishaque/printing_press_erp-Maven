package ndk.printing_press.bll;

import java.util.List;
import javax.swing.JComboBox;
import ndk.printing_press.dal.CustomerDAL;
import ndk.printing_press.model.CustomerModal;

public class CustomerBLL {

    public List<CustomerModal> getCustomers() {

        return new CustomerDAL().getCustomers();
    }

    public void loadCustomerJComboBox(JComboBox<CustomerModal> customerJComboBox) {

        customerJComboBox.removeAllItems();
        List<CustomerModal> customers = getCustomers();
        for (int i = 0; i < customers.size(); i++) {

            customerJComboBox.addItem(customers.get(i));
        }
        customerJComboBox.setSelectedItem("");
    }
}
