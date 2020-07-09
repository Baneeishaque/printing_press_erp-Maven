package ndk.printing_press.bll;

import DSST007_1_CUS13.bll.WorkOrder;
import DSST007_1_CUS13.dal.WorkOrder_DAL;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class WorkOrderBLL {

    public List<WorkOrder> getWorkOrders() throws SQLException {

        WorkOrder_DAL workOrderEntry_DAL = new WorkOrder_DAL();
        return workOrderEntry_DAL.getWorkOrders();
    }

    public void loadJobNameJComboBox(JComboBox<WorkOrder> jComboBoxWorkOrder) {

        try {
            jComboBoxWorkOrder.removeAllItems();

            List<WorkOrder> workOrders = getWorkOrders();

            for (int i = 0; i < workOrders.size(); i++) {

                jComboBoxWorkOrder.addItem(workOrders.get(i));
            }
            jComboBoxWorkOrder.setSelectedItem("");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }
}
