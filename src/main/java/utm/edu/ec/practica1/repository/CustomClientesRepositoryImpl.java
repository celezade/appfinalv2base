package utm.edu.ec.practica1.repository;

import org.springframework.beans.factory.annotation.Autowired;
import utm.edu.ec.practica1.entity.Clientes;
import utm.edu.ec.practica1.entity.Provider;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

public class CustomClientesRepositoryImpl implements CustomClientesRepository{
    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Clientes> findClientesByValue(String cedula) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Clientes> query = cb.createQuery(Clientes.class);
        Root<Clientes> clientes = query.from(Clientes.class);
        List<Predicate> predicates = new ArrayList<>();

        Path<String> cedulaPath = clientes.get("cedula");
        //Path<String> namePath = provider.get("name");
        predicates.add(cb.equal(cedulaPath, cedula));
//        predicates.add(cb.like(namePath, "%3"));

        query.select(clientes).where(cb.and(predicates
                .toArray(new Predicate[0]))).orderBy((cb.desc(cedulaPath)));
        return entityManager.createQuery(query).getResultList();
    }
}
