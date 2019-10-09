package com.example.TechnologiesMicroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TechnologiesService {
    @Autowired
    private TechnologiesRepository tr;

    public List<Technologies> getTechnologies(){
        List<Technologies> ls=new ArrayList<>();
        tr.findAll().forEach(ls::add);
        return ls;
    }
    public void setTechnologies(Technologies technologies) {
        tr.save(technologies);
    }
}
