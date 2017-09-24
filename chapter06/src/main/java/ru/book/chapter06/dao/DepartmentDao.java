package ru.book.chapter06.dao;

import ru.book.chapter06.model.Department;
import java.util.List;

public interface DepartmentDao {

    Department createDepartment(Department department);

    Department updateDepartment(Department department);

    Department getDepartmentById(int id);

    void removeDepartment(Department department);

    List<Department> findDepartments();

}
