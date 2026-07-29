package com.sena.laboratorio.controller;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.sena.laboratorio.model.Usuario;
import com.sena.laboratorio.service.UsuarioService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/usuarios") 
public class UsuarioController{
    private final UsuarioService s;
    public UsuarioController(UsuarioService s){this.s=s;}

    @GetMapping ("/listar")
    public List<Usuario> listar(){return s.listar();}

    @GetMapping ("/listar/{id}")
    public Usuario listarPorId(@PathVariable Integer id){
        return s.listarPorId(id);
    }
    
    @PostMapping ("/guardar")
    public Usuario guardar(@RequestBody Usuario u){return s.guardar(u);}

    @DeleteMapping ("/eliminar/{id}") 
    public void eliminar(@PathVariable Integer id){s.eliminar(id);}

    @PutMapping("/actualizar/{id}")
    public Usuario actualizar(@PathVariable Integer id, @RequestBody Usuario u) {
        u.setId(id);
        return s.guardar(u);
    }

}