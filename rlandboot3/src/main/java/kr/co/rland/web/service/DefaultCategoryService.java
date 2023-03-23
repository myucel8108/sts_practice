package kr.co.rland.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.rland.web.entity.Category;
import kr.co.rland.web.repository.CategoryRepository;

@Service
public class DefaultCategoryService implements CatagoryService{

	@Autowired
	private CategoryRepository repository;
	
	@Override
	public List<Category> getList() {
		// TODO Auto-generated method stub
		int category = 0;
		return repository.findAll();
	}

	@Override
	public String getNameById(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).getName();
	}




}
