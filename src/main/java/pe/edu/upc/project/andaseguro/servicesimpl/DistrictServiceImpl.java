package pe.edu.upc.project.andaseguro.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.project.andaseguro.entities.Direction;
import pe.edu.upc.project.andaseguro.entities.District;
import pe.edu.upc.project.andaseguro.repositories.IDistrictRepository;
import pe.edu.upc.project.andaseguro.servicesinterfaces.IDistrictService;

import java.util.List;
import java.util.Optional;

@Service
public class DistrictServiceImpl implements IDistrictService {

    @Autowired
    private IDistrictRepository districtRepository;

    @Override
    public void insert(District district) {
        districtRepository.save(district);
    }

    @Override
    public List<District> list() {
        return districtRepository.findAll();
    }

    @Override
    public void delete(int idDistrict) {
        districtRepository.deleteById(idDistrict);
    }

    @Override
    public List<District> searchName(String nameDistrict) {
        return districtRepository.searchName(nameDistrict);
    }
}
