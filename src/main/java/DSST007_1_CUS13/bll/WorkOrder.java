/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSST007_1_CUS13.bll;

import DSST007_1_CUS13.dal.PrintAndDeliveryQueue_DAL;
import DSST007_1_CUS13.dal.WorkOrder_DAL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ndk.printing_press.dal.ManufacturDAL;

/**
 *
 * @author praveen
 */
public class WorkOrder {

    String id, workorderid, customer, orderdate, demitype, sheets, length, width, gsm, plate, design, rate, supplier, manufacturer, delivery_by, delivery_date, deliverytime, am_pm, printer_note, cutter_note, delivery_note, image, image_format, userid, process, datetime, description, colour_plate, cyan, magenta, yellow, black, status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWorkorderid() {
        return workorderid;
    }

    public void setWorkorderid(String workorderid) {
        this.workorderid = workorderid;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public String getDemitype() {
        return demitype;
    }

    public void setDemitype(String demitype) {
        this.demitype = demitype;
    }

    public String getSheets() {
        return sheets;
    }

    public void setSheets(String sheets) {
        this.sheets = sheets;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDelivery_by() {
        return delivery_by;
    }

    public void setDelivery_by(String delivery_by) {
        this.delivery_by = delivery_by;
    }

    public String getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(String delivery_date) {
        this.delivery_date = delivery_date;
    }

    public String getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(String deliverytime) {
        this.deliverytime = deliverytime;
    }

    public String getAm_pm() {
        return am_pm;
    }

    public void setAm_pm(String am_pm) {
        this.am_pm = am_pm;
    }

    public String getPrinter_note() {
        return printer_note;
    }

    public void setPrinter_note(String printer_note) {
        this.printer_note = printer_note;
    }

    public String getCutter_note() {
        return cutter_note;
    }

    public void setCutter_note(String cutter_note) {
        this.cutter_note = cutter_note;
    }

    public String getDelivery_note() {
        return delivery_note;
    }

    public void setDelivery_note(String delivery_note) {
        this.delivery_note = delivery_note;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage_format() {
        return image_format;
    }

    public void setImage_format(String image_format) {
        this.image_format = image_format;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColour_plate() {
        return colour_plate;
    }

    public void setColour_plate(String colour_plate) {
        this.colour_plate = colour_plate;
    }

    public String getCyan() {
        return cyan;
    }

    public void setCyan(String cyan) {
        this.cyan = cyan;
    }

    public String getYellow() {
        return yellow;
    }

    public void setYellow(String yellow) {
        this.yellow = yellow;
    }

    public String getBlack() {
        return black;
    }

    public void setBlack(String black) {
        this.black = black;
    }

    public String getMagenta() {
        return magenta;
    }

    public void setMagenta(String magenta) {
        this.magenta = magenta;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //Pass work order details for save
    public void getWorkOrderDetailsForSave(String workorderid, String customer, String orderdate, String demitype, String colourtype, ArrayList<String> colourList, String sheets, String length, String width, String gsm, String plate, String design, String rate, String supplier, String manufacturer, String delivery_by, String delivery_date, String deliverytime, String am_pm, String printer_note, String cutter_note, String delivery_note, String picture, String image_format, String print_status, String colour_plate, String cyan, String magenta, String yellow, String black, String workordername, String design_charge, String plate_charge, String parcelAgency) {

        WorkOrder_DAL workOrderEntry_DAL = new WorkOrder_DAL();
        workOrderEntry_DAL.insertWorkOrderDetailsToDB(workorderid, customer, orderdate, demitype, colourtype, colourList, sheets, length, width, gsm, plate, design, rate, supplier, manufacturer, delivery_by, delivery_date, deliverytime, am_pm, printer_note, cutter_note, delivery_note, picture, image_format, print_status, colour_plate, cyan, magenta, yellow, black, workordername, design_charge, plate_charge, parcelAgency);

    }

//    public ArrayList<String> getCustomerDetails() throws SQLException {
//
//        WorkOrder_DAL workOrderEntry_DAL = new WorkOrder_DAL();
//        return workOrderEntry_DAL.getCustomerDetailsFromDB();
//    }

    //Get work orders from WorkOrder_DAL
    public ArrayList<String> getWorkOrders(String customer) {

        WorkOrder_DAL workOrderEntry_DAL = new WorkOrder_DAL();
        return workOrderEntry_DAL.getWorkOrdersFromDB(customer);

    }

    //Get work order details from WorkOrder_DAL
    public ArrayList getWorkOrderDetails(String workorderid) {
        WorkOrder_DAL workOrderEntry_DAL = new WorkOrder_DAL();
        return workOrderEntry_DAL.getWorkOrderDetailsFromDB(workorderid);
    }

    //Get operation status ------------------------------------------
    public String get_operation_status() {

        WorkOrder_DAL workOrderEntry_DAL = new WorkOrder_DAL();
        return workOrderEntry_DAL.operation_status();

    }

    //Get workorder details for print queue
    public List getPrintWorkOrderDetails() throws Exception {
        PrintAndDeliveryQueue_DAL printAndDeliveryQueue_DAL = new PrintAndDeliveryQueue_DAL();
        return printAndDeliveryQueue_DAL.getPrintWorkOrderDetails();
    }

    //Get delivery date from print work order
    public String getDelDate(WorkOrder workOrderEntry_BLL, String workorderid) throws Exception {
        PrintAndDeliveryQueue_DAL printAndDeliveryQueue_DAL = new PrintAndDeliveryQueue_DAL();
        return printAndDeliveryQueue_DAL.getDelDate(workOrderEntry_BLL, workorderid);
    }

    //Get no of sheets from print work order
    public String getNoOfSheets(WorkOrder workOrderEntry_BLL, String workorderid) throws Exception {
        PrintAndDeliveryQueue_DAL printAndDeliveryQueue_DAL = new PrintAndDeliveryQueue_DAL();
        return printAndDeliveryQueue_DAL.getNoOfSheets(workOrderEntry_BLL, workorderid);
    }

    //Get name of delivery party
    public String getDeliveryBy(WorkOrder workOrderEntry_BLL, String workorderid) throws Exception {
        PrintAndDeliveryQueue_DAL printAndDeliveryQueue_DAL = new PrintAndDeliveryQueue_DAL();
        return printAndDeliveryQueue_DAL.getDeliveryBy(workOrderEntry_BLL, workorderid);
    }

    //Get delivery parties list
    public List getDeliveryPartiesList() throws SQLException {
        WorkOrder_DAL workOrderEntry_DAL = new WorkOrder_DAL();
        return workOrderEntry_DAL.getDeliveryPartiesList();
    }

    

    

    //Update work order details into print_work_order---------------------------------------
    public void upateWorkOrderDetails(String workorderid, String customer, String orderdate, String demitype, String colourtype, ArrayList<String> colourList, String sheets, String length, String width, String gsm, String plate, String design, String rate, String supplier, String manufacturer, String delivery_by, String delivery_date, String deliverytime, String am_pm, String printer_note, String cutter_note, String delivery_note, String picture, String image_format, String print_status, String colour_plate, String cyan, String magenta, String yellow, String black, String workordername, String plate_charge, String design_charge, String print_sheet_count, String final_print_count) throws Exception {
        WorkOrder_DAL workOrderEntry_DAL = new WorkOrder_DAL();
        workOrderEntry_DAL.upateWorkOrderDetails(workorderid, customer, orderdate, demitype, colourtype, colourList, sheets, length, width, gsm, plate, design, rate, supplier, manufacturer, delivery_by, delivery_date, deliverytime, am_pm, printer_note, cutter_note, delivery_note, picture, image_format, print_status, colour_plate, cyan, magenta, yellow, black, workordername, plate_charge, design_charge, print_sheet_count, final_print_count);
    }

    @Override
    public String toString() {
        return description;
    }
}
