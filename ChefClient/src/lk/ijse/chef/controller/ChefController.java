/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.controller;

import java.awt.Dialog;
import java.util.List;
import lk.ijse.chef.connector.ProxHandler;
import lk.ijse.chef.dto.AddChefDTO;
import lk.ijse.chef.dto.ChefDTO;
import lk.ijse.chef.dto.OrdersDTO;
import lk.ijse.chef.service.ServiceFactory;
import lk.ijse.chef.service.custom.AddChefService;
import lk.ijse.chef.service.custom.ChefService;
import lk.ijse.chef.service.custom.OrderService;
import lk.ijse.chef.service.custom.OrdersQueueService;
import lk.ijse.jasper.IJSEJasperViewer;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Thilini Hansika
 */
public class ChefController {

    public static boolean addOrder(OrdersDTO cdto) throws Exception {
        OrderService orderService = (OrderService) ProxHandler.getInstance().getService(ServiceFactory.ServiceTypes.ORDERS);
        return orderService.addOrder(cdto);
    }

    public static OrdersDTO getOrder() throws Exception {
        OrdersQueueService ordersQueueService = (OrdersQueueService) ProxHandler.getInstance().getService(ServiceFactory.ServiceTypes.ORDERS_QUEUE);
        return ordersQueueService.getOrderFromQueue();
    }

    public static List<OrdersDTO> getAllOrders() throws Exception {
        OrderService orderService = (OrderService) ProxHandler.getInstance().getService(ServiceFactory.ServiceTypes.ORDERS);
        return orderService.getAllOrders();
    }

    public static boolean addOrder(ChefDTO dto) throws Exception {
        //      ChefService Service = (ChefService) ProxHandler.getInstance().getService(ServiceFactory.ServiceTypes.CHEF);
        ChefService service = (ChefService) ProxHandler.getInstance().getService(ServiceFactory.ServiceTypes.CHEF);
        System.out.println("AB" + dto);
        boolean addChefOrder = service.addChefOrder(dto);
        System.out.println("adsa" + dto);
        return addChefOrder;

    }
    public static List<AddChefDTO> getAllChef() throws Exception{
        AddChefService acs=(AddChefService) ProxHandler.getInstance().getService(ServiceFactory.ServiceTypes.ADDCHEF);
        return acs.getAllChef();
    }
    public static AddChefDTO searchChefByName(String name) throws Exception {
        AddChefService chefService = (AddChefService) ProxHandler.getInstance().getService(ServiceFactory.ServiceTypes.ADDCHEF);
        return chefService.searchChefByName(name);
    }
    public  static  List<ChefDTO>getAllChefOrder()throws Exception{
        ChefService c=(ChefService) ProxHandler.getInstance().getService(ServiceFactory.ServiceTypes.CHEF);
        return  c.getAllChef();
    }
    public  static  List<ChefDTO>findByChefId(int id)throws Exception{
        ChefService cs=(ChefService) ProxHandler.getInstance().getService(ServiceFactory.ServiceTypes.CHEF);
        return cs.findByChefId(id);
    }
    public  static List<OrdersDTO>findByOID(int id)throws Exception{
        OrderService orderService=(OrderService) ProxHandler.getInstance().getService(ServiceFactory.ServiceTypes.ORDERS);
          return orderService.findByOID(id);
    }
    public static AddChefDTO searchByAddChefID(int id )throws Exception{
        AddChefService acdto=(AddChefService) ProxHandler.getInstance().getService(ServiceFactory.ServiceTypes.ADDCHEF);
        return acdto.findByAddChefId(id);
 
    }
    
    public static void chef( )throws Exception{
        JasperPrint filledReport=null;

            IJSEJasperViewer frmJasperViewer = new IJSEJasperViewer(filledReport);
            frmJasperViewer.setTitle("My Report");
            frmJasperViewer.setSize(1600, 720);
            frmJasperViewer.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
            frmJasperViewer.setVisible(true);

    }
}
