/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.business.custom.impl;

import java.rmi.ConnectException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.chef.business.custom.AddCheffBO;
import lk.ijse.chef.dto.AddChefDTO;
import lk.ijse.chef.entity.AddChef;
import lk.ijse.chef.repository.RepositroyFactory;
import lk.ijse.chef.repository.custom.AddChefRepository;
import lk.ijse.chef.resource.DBConnection;

/**
 *
 * @author Thilini Hansika
 */
public class AddChefBoImpl implements AddCheffBO {

    private AddChefRepository repository;

    public AddChefBoImpl() throws Exception {
        repository = (AddChefRepository) RepositroyFactory.getInstance().getRepository(RepositroyFactory.RepositoryTypes.ADDCHEF);
    }

    @Override
    public List<AddChefDTO> getAallChef() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        repository.setConnection(connection);
        List<AddChef> addChef = repository.findAll();
        DBConnection.getInstance().releaseConnection(connection);
        if (addChef != null) {
            List<AddChefDTO> allChef = new ArrayList<>();
            for (AddChef add : addChef) {
                AddChefDTO a = new AddChefDTO(add.getChefId(),
                        add.getChefName());
                allChef.add(a);

            }
            return allChef;
        } else {
            return null;
        }

    }

    @Override
    public AddChefDTO searchChefByName(String name) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        repository.setConnection(connection);

        AddChef findByName = repository.findByName(name);

        AddChefDTO chefDTO = new AddChefDTO();
        chefDTO.setChefId(findByName.getChefId());
        chefDTO.setChefName(findByName.getChefName());
        DBConnection.getInstance().releaseConnection(connection);

        return chefDTO;

    }

    @Override
    public AddChefDTO searchByID(int aid) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        repository.setConnection(connection);

        AddChef findByName = repository.findById(aid);

        AddChefDTO chefDTO = new AddChefDTO();
        chefDTO.setChefId(findByName.getChefId());
        chefDTO.setChefName(findByName.getChefName());
        DBConnection.getInstance().releaseConnection(connection);

        return chefDTO;

    }

}
