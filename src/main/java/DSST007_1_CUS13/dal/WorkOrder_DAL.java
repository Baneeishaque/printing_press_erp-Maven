/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSST007_1_CUS13.dal;

import DSST007_1_CUS13.bll.WorkOrder;
import DSST007_1_CUS13.pll.DatabaseConnection;
import java.io.UnsupportedEncodingException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author praveen
 */
public class WorkOrder_DAL {

    String operation = null;
    static boolean proc_stat = false;
    static boolean error = false;
    static int row = 0;

    ArrayList<String> custDetArray = new ArrayList();
    ArrayList workOrderEntryDetailsArr = new ArrayList();

    //Insert work order details into db ---------------------------------------
    public void insertWorkOrderDetailsToDB(String workorderid, String customer, String orderdate, String demitype, String colourtype, ArrayList<String> colourList, String sheets, String length, String width, String gsm, String plate, String design, String rate, String supplier, String manufacturer, String delivery_by, String delivery_date, String deliverytime, String am_pm, String printer_note, String cutter_note, String delivery_note, String picture, String image_format, String print_status, String colour_plate, String cyan, String magenta, String yellow, String black, String workordername, String design_charge, String plate_charge, String parcelAgency) {

        Connection con = null;
        PreparedStatement prepstmt = null;

        try {

            con = DatabaseConnection.createConnection();

            String sql = "INSERT INTO print_work_order (workorderid, customer, orderdate, demitype, sheets, length, width, gsm, plate, design, rate, supplier, manufacturer, delivery_by, delivery_date, deliverytime, am_pm, printer_note, cutter_note, delivery_note, image, image_format, status, colour_plate, cyan, magenta, yellow, black, description, design_charge, plate_charge,parcel_agency) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            prepstmt = con.prepareStatement(sql);

            prepstmt.setString(1, workorderid);
            prepstmt.setString(2, customer);
            prepstmt.setString(3, orderdate);
            prepstmt.setString(4, demitype);
            prepstmt.setString(5, sheets);
            prepstmt.setString(6, length);
            prepstmt.setString(7, width);
            prepstmt.setString(8, gsm);
            prepstmt.setString(9, plate);
            prepstmt.setString(10, design);
            prepstmt.setString(11, rate);
            prepstmt.setString(12, supplier);
            prepstmt.setString(13, manufacturer);
            prepstmt.setString(14, delivery_by);
            prepstmt.setString(15, delivery_date);
            prepstmt.setString(16, deliverytime);
            prepstmt.setString(17, am_pm);
            prepstmt.setString(18, printer_note);
            prepstmt.setString(19, cutter_note);
            prepstmt.setString(20, delivery_note);
            //String to BLOB
            Blob blobData = null;
            if (picture != null) {

                byte[] byteData = picture.getBytes("UTF-8");//Better to specify encoding
                blobData = con.createBlob();
                blobData.setBytes(1, byteData);
                prepstmt.setBlob(21, blobData);

            } else {

                prepstmt.setBlob(21, blobData);
                image_format = null;

            }
            prepstmt.setString(22, image_format);
            prepstmt.setString(23, print_status);
            prepstmt.setString(24, colour_plate);
            prepstmt.setString(25, cyan);
            prepstmt.setString(26, magenta);
            prepstmt.setString(27, yellow);
            prepstmt.setString(28, black);
            prepstmt.setString(29, workordername);
            prepstmt.setString(30, design_charge);
            prepstmt.setString(31, plate_charge);
            prepstmt.setString(32, parcelAgency);

            row = prepstmt.executeUpdate();

            proc_stat = true;

        } catch (UnsupportedEncodingException | SQLException e) {

            JOptionPane.showMessageDialog(null, "WorkOrderEntry_DAL : insertWorkOrderDetailsToDB(): " + e);
            error = true;

        } finally {

            try {

                if (con != null) {

                    con.close();

                }

                if (prepstmt != null) {

                    prepstmt.close();

                }

            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex);

            }

        }

    }

    private void saveColourPlate(String workOrderId, String colourPlate, ArrayList<String> colourList) {

        Connection con = null;
        PreparedStatement prepstmt = null;

        ArrayList<String> colourArray = new ArrayList();
        colourArray.add("cyan");
        colourArray.add("magenta");
        colourArray.add("yellow");
        colourArray.add("black");

        try {
            for (int i = 0; i < colourArray.size(); i++) {
                con = DatabaseConnection.createConnection();

                String sql = "INSERT INTO colour_table (workorderid, colour_plate, colour, subcolour) VALUES (?,?,?,?)";
                prepstmt = con.prepareStatement(sql);

                prepstmt.setString(1, workOrderId);
                prepstmt.setString(2, colourPlate);
                prepstmt.setString(3, colourArray.get(i));
                prepstmt.setString(4, colourList.get(i));

                row = prepstmt.executeUpdate();
            }

            proc_stat = true;

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "WorkOrderEntry_DAL : saveColourPlate(): " + e);
            error = true;

        } finally {

            try {

                if (con != null) {

                    con.close();

                }

                if (prepstmt != null) {

                    prepstmt.close();

                }

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, ex);

            }

        }

    }

    //Get customer list from database
//    public ArrayList<String> getCustomerDetailsFromDB() throws SQLException {
//
//        Connection con;
//        PreparedStatement prepstmt;
//        ResultSet rs;
//
//        con = DatabaseConnection.createConnection();
//
//        String sql_1 = "SELECT id,name FROM customer_registration ";
//        prepstmt = con.prepareStatement(sql_1);
//        rs = prepstmt.executeQuery();
//        while (rs.next()) {
//            
//            String id = rs.getString("id");
//            String name = rs.getString("name");
//            String name_id = name + " | " + id;
//            custDetArray.add(name_id);
//        }
//
//        rs.close();
//        prepstmt.close();
//        con.close();
//
//        return custDetArray;
//    }
    public ArrayList<String> getWorkOrdersFromDB(String customer) {

        //TODO : Rewrite
        Connection con = null;
        PreparedStatement prepstmt = null;
        ResultSet rs = null;

        @SuppressWarnings("CollectionWithoutInitialCapacity")
        ArrayList<String> workOrderIdArray = new ArrayList<>();

        try {

            con = DatabaseConnection.createConnection();

            String sql_1 = "SELECT workorderid FROM print_work_order ";
            prepstmt = con.prepareStatement(sql_1);
            rs = prepstmt.executeQuery();
            while (rs.next()) {

                String workorderid = rs.getString("workorderid");
                workOrderIdArray.add(workorderid);
            }
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "WorkOrderEntry_DAL : getWorkOrdersFromDB(): " + e);

        } finally {

            try {
                if (rs != null) {

                    rs.close();
                }
                if (prepstmt != null) {

                    prepstmt.close();
                }
                if (con != null) {

                    con.close();
                }
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex);
            }
        }
        return workOrderIdArray;
    }

    public ArrayList<String> getWorkOrderDetailsFromDB(String workorderid) {
        Connection con = null;
        PreparedStatement prepstmt = null;
        ResultSet rs = null;

        try {
            con = DatabaseConnection.createConnection();

            String sql = "SELECT orderdate,demitype,sheets,length,width,gsm,plate,design,rate,supplier,manufacturer,delivery_by,delivery_date,deliverytime,am_pm,printer_note,cutter_note,delivery_note,image,image_format,customer,colour_plate,cyan,magenta,yellow,black,description,plate_charge,design_charge,print_sheet_count,final_print_count,parcel_agency FROM print_work_order WHERE workorderid=? ";
            prepstmt = con.prepareStatement(sql);
            prepstmt.setString(1, workorderid);
            rs = prepstmt.executeQuery();

            while (rs.next()) {
                workOrderEntryDetailsArr.add(rs.getDate("orderdate"));          //0
                workOrderEntryDetailsArr.add(rs.getString("demitype"));         //1
                workOrderEntryDetailsArr.add(rs.getString("colour_plate"));     //3
                workOrderEntryDetailsArr.add(rs.getString("cyan"));             //4
                workOrderEntryDetailsArr.add(rs.getString("magenta"));          //5
                workOrderEntryDetailsArr.add(rs.getString("yellow"));           //6
                workOrderEntryDetailsArr.add(rs.getString("black"));            //7
                workOrderEntryDetailsArr.add(rs.getString("sheets"));           //8
                workOrderEntryDetailsArr.add(rs.getString("length"));           //9
                workOrderEntryDetailsArr.add(rs.getString("width"));            //10
                workOrderEntryDetailsArr.add(rs.getString("gsm"));              //11
                workOrderEntryDetailsArr.add(rs.getString("plate"));            //12
                workOrderEntryDetailsArr.add(rs.getString("design"));           //13
                workOrderEntryDetailsArr.add(rs.getString("rate"));             //14
                workOrderEntryDetailsArr.add(rs.getString("supplier"));         //15
                workOrderEntryDetailsArr.add(rs.getString("manufacturer"));     //16
                workOrderEntryDetailsArr.add(rs.getString("delivery_by"));      //17
                workOrderEntryDetailsArr.add(rs.getDate("delivery_date"));      //18
                workOrderEntryDetailsArr.add(rs.getString("deliverytime"));     //19
                workOrderEntryDetailsArr.add(rs.getString("am_pm"));            //20
                workOrderEntryDetailsArr.add(rs.getString("printer_note"));     //21
                workOrderEntryDetailsArr.add(rs.getString("cutter_note"));      //22
                workOrderEntryDetailsArr.add(rs.getString("delivery_note"));    //22

                if (rs.getBlob("image") == null) {
                    workOrderEntryDetailsArr.add("NULL");
                } else {
                    //Blob to String
                    Blob blob = rs.getBlob("image");
                    String photostr = new String(blob.getBytes(1l, (int) blob.length()));
                    workOrderEntryDetailsArr.add(photostr);                     //23
                }

                workOrderEntryDetailsArr.add(rs.getString("customer"));         //24
                workOrderEntryDetailsArr.add(rs.getString("description"));      //25
                workOrderEntryDetailsArr.add(rs.getString("plate_charge"));     //26
                workOrderEntryDetailsArr.add(rs.getString("design_charge"));    //27
                workOrderEntryDetailsArr.add(rs.getString("image_format"));    //28
                workOrderEntryDetailsArr.add(rs.getString("print_sheet_count"));    //29
                workOrderEntryDetailsArr.add(rs.getString("final_print_count"));    //30
                workOrderEntryDetailsArr.add(rs.getString("parcel_agency"));    //31
            }
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "WorkOrderEntry_DAL : getWorkOrderDetailsFromDB(): " + e);

        } finally {

            try {

                if (rs != null) {

                    rs.close();

                }
                if (prepstmt != null) {

                    prepstmt.close();

                }
                if (con != null) {

                    con.close();

                }

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, ex);

            }

        }

        return workOrderEntryDetailsArr;
    }

    class GetSubColours {

        ArrayList<String> colourDetArr = new ArrayList<>();
        String workorderid;
        String colourPlate;

        public GetSubColours(String workorderid) {

            this.workorderid = workorderid;

        }

        public void getSubColours() {

            Connection con = null;
            PreparedStatement prepstmt = null;
            ResultSet rs = null;

            try {

                con = DatabaseConnection.createConnection();

                String sql = "SELECT colour_plate,subcolour FROM colour_table WHERE workorderid=? ";
                prepstmt = con.prepareStatement(sql);
                prepstmt.setString(1, workorderid);
                rs = prepstmt.executeQuery();
                while (rs.next()) {

                    this.colourPlate = rs.getString("colour_plate");
                    colourDetArr.add(rs.getString("subcolour"));

                }
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e);

            } finally {

                try {

                    if (rs != null) {

                        rs.close();

                    }
                    if (prepstmt != null) {

                        prepstmt.close();

                    }
                    if (con != null) {

                        con.close();

                    }

                } catch (Exception ex) {

                    JOptionPane.showMessageDialog(null, ex);

                }

            }

        }

        public ArrayList<String> getColourDetArr() {
            return colourDetArr;
        }

        public String getColourPlate() {
            return colourPlate;
        }

    }

    public List<WorkOrder> getWorkOrders() throws SQLException {
        
        Connection con;
        PreparedStatement prepstmt;
        ResultSet rs;
        @SuppressWarnings("CollectionWithoutInitialCapacity")
        List<WorkOrder> workOrders = new ArrayList<>();

        con = DatabaseConnection.createConnection();

        //Use Model class
        String sql = "SELECT DISTINCT description FROM print_work_order";
        prepstmt = con.prepareStatement(sql);
        rs = prepstmt.executeQuery();
        
        while (rs.next()) {
        
            WorkOrder workOrderEntry_BLL = new WorkOrder();
            workOrderEntry_BLL.setDescription(rs.getString("description"));
            workOrders.add(workOrderEntry_BLL);
        }
        rs.close();
        prepstmt.close();
        con.close();

        return workOrders;
    }

    //Get delivery party list from print_work_order
    public List getDeliveryPartiesList() throws SQLException {
        Connection con;
        PreparedStatement prepstmt;
        ResultSet rs;
        List<WorkOrder> delPartyList = new ArrayList<>();

        con = DatabaseConnection.createConnection();

        String sql = "SELECT DISTINCT delivery_by FROM print_work_order";
        prepstmt = con.prepareStatement(sql);
        rs = prepstmt.executeQuery();
        while (rs.next()) {
            WorkOrder workOrderEntry_BLL = new WorkOrder();
            workOrderEntry_BLL.setDelivery_by(rs.getString("delivery_by"));
            delPartyList.add(workOrderEntry_BLL);
        }

        rs.close();
        prepstmt.close();
        con.close();

        return delPartyList;
    }

    

    //Update work order details into db ---------------------------------------
    public void upateWorkOrderDetails(String workorderid, String customer, String orderdate, String demitype, String colourtype, ArrayList<String> colourList, String sheets, String length, String width, String gsm, String plate, String design, String rate, String supplier, String manufacturer, String delivery_by, String delivery_date, String deliverytime, String am_pm, String printer_note, String cutter_note, String delivery_note, String picture, String image_format, String print_status, String colour_plate, String cyan, String magenta, String yellow, String black, String workordername, String plate_charge, String design_charge, String print_sheet_count, String final_print_count) throws Exception {

        Connection con = null;
        PreparedStatement prepstmt = null;

        con = DatabaseConnection.createConnection();

        String sql = "UPDATE print_work_order SET workorderid=?, customer=?, orderdate=?, demitype=?, sheets=?, length=?, width=?, gsm=?, plate=?, design=?, rate=?, supplier=?, manufacturer=?, delivery_by=?, delivery_date=?, deliverytime=?, am_pm=?, printer_note=?, cutter_note=?, delivery_note=?, image=?, image_format=?, status=?, colour_plate=?, cyan=?, magenta=?, yellow=?, black=?, description=?, plate_charge=?, design_charge=?, print_sheet_count=?, final_print_count=? WHERE workorderid=?";
        prepstmt = con.prepareStatement(sql);

        prepstmt.setString(1, workorderid);
        prepstmt.setString(2, customer);
        prepstmt.setString(3, orderdate);
        prepstmt.setString(4, demitype);
        prepstmt.setString(5, sheets);
        prepstmt.setString(6, length);
        prepstmt.setString(7, width);
        prepstmt.setString(8, gsm);
        prepstmt.setString(9, plate);
        prepstmt.setString(10, design);
        prepstmt.setString(11, rate);
        prepstmt.setString(12, supplier);
        prepstmt.setString(13, manufacturer);
        prepstmt.setString(14, delivery_by);
        prepstmt.setString(15, delivery_date);
        prepstmt.setString(16, deliverytime);
        prepstmt.setString(17, am_pm);
        prepstmt.setString(18, printer_note);
        prepstmt.setString(19, cutter_note);
        prepstmt.setString(20, delivery_note);
        //String to BLOB
        Blob blobData = null;
        if (picture != null) {

            byte[] byteData = picture.getBytes("UTF-8");//Better to specify encoding
            blobData = con.createBlob();
            blobData.setBytes(1, byteData);
            prepstmt.setBlob(21, blobData);

        } else {

            prepstmt.setBlob(21, blobData);
            image_format = null;

        }
        prepstmt.setString(22, image_format);
        prepstmt.setString(23, print_status);
        prepstmt.setString(24, colour_plate);
        prepstmt.setString(25, cyan);
        prepstmt.setString(26, magenta);
        prepstmt.setString(27, yellow);
        prepstmt.setString(28, black);
        prepstmt.setString(29, workordername);
        prepstmt.setString(30, plate_charge);
        prepstmt.setString(31, design_charge);
        prepstmt.setString(32, print_sheet_count);
        prepstmt.setString(33, final_print_count);
        prepstmt.setString(34, workorderid);

        row = prepstmt.executeUpdate();

        prepstmt.close();
        con.close();

    }

    //Return operation status ----------------------------------------
    public String operation_status() {

        if (proc_stat == true && error == false && row != 0) {

            operation = "success";

        } else {

            operation = "fail";

        }

        return operation;

    }

}
