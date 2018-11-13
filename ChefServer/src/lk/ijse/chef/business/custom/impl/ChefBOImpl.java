/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.business.custom.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.chef.business.custom.ChefBO;
import lk.ijse.chef.dto.ChefDTO;
import lk.ijse.chef.entity.Chef;
import lk.ijse.chef.entity.Orders;
import lk.ijse.chef.repository.RepositroyFactory;
import lk.ijse.chef.repository.custom.ChefRepository;
import lk.ijse.chef.repository.custom.impl.ChefRepositoryImpl;
import lk.ijse.chef.resource.DBConnection;

/**
 *
 * @author Thilini Hansika
 */
public class ChefBOImpl implements ChefBO {

    private ChefRepository chefRepository;

    public ChefBOImpl() throws Exception {;
        this.chefRepository = (ChefRepository) RepositroyFactory.getInstance().getRepository(RepositroyFactory.RepositoryTypes.CHEF);
    }

    @Override
    public boolean addChef(ChefDTO chef) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();

        chefRepository.setConnection(connection);

        Chef c = new Chef(chef.getOid(),
                chef.getChefID(),
                chef.getDate(),
                chef.getCustomerName(),
                chef.getSpentTime(),
                chef.getPreparedBun()
        );

        boolean save = chefRepository.save(c);
        DBConnection.getInstance().releaseConnection(connection);
        return save;
    }

    @Override
    public List<ChefDTO> getAallChef() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        chefRepository.setConnection(connection);
        List<Chef> chef = chefRepository.findAll();
        DBConnection.getInstance().releaseConnection(connection);
        if (chef != null) {
            List<ChefDTO> allChef = new ArrayList<>();
            for (Chef c : chef) {
                ChefDTO dTO = new ChefDTO(c.getOid(),
                        c.getChefID(),
                        c.getDate(),
                        c.getCustomerName(),
                        c.getSpentTime(),
                        c.getPreparedBun());
                allChef.add(dTO);

            }
            return allChef;
        } else {
            return null;
        }
    }

    @Override
    public List<ChefDTO> findByChefId(int id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        chefRepository.setConnection(connection);

        List<Chef> findOrdersByChefID = chefRepository.findByIdChef(id);

        List<ChefDTO> ordersDTOs = new ArrayList<>();

        DBConnection.getInstance().releaseConnection(connection);

        for (Chef orders : findOrdersByChefID) {
            ordersDTOs.add(new ChefDTO(
                    orders.getChefID(),
                    orders.getOid(),
                    orders.getDate(),
                    orders.getCustomerName(),
                    orders.getSpentTime(),
                    orders.getPreparedBun())
            );

        }
        return ordersDTOs;
    }

}
