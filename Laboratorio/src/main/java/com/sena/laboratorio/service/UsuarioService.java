package com.sena.laboratorio.service;
import org.springframework.stereotype.Service;
import java.util.*;
import com.sena.laboratorio.model.Usuario; 
import com.sena.laboratorio.repository.UsuarioRepository;
@Service public class UsuarioService{
    private final UsuarioRepository r;
    public UsuarioService(UsuarioRepository r){this.r=r;}
    
    public List<Usuario> listar(){
        return r.findAll();
    }
    public Usuario listarPorId(Integer id){
        return r.findById(id).orElse(null);
    }
    public Usuario guardar(Usuario u){
        return r.save(u);
    }
    public void eliminar(Integer id){
        r.deleteById(id);
    }
    }