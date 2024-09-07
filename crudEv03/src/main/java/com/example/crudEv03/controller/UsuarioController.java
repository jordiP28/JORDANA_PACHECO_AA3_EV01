package com.example.crudEv03.controller;

import com.example.crudEv03.entity.Usuario;
import com.example.crudEv03.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path ="api/v1/usuarios")

public class UsuarioController {
  @Autowired
    private  UsuarioService usuarioService;


    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    @GetMapping
    public List<Usuario>  getAll(){
        return usuarioService.getUsuarios();
    }
    @GetMapping("/{id_usuario}")
    public Optional<Usuario> getBId(@PathVariable("id_usuario") Long id_usuario){
        return usuarioService.getUsuario(id_usuario);
    }
    @PostMapping
    public void SaveUpdate(@RequestBody Usuario usuario){
         usuarioService.saveOrUpdate(usuario);
         }
    @DeleteMapping("/{id_usuario}")
    public void SaveUpdate(@PathVariable("id_usuario") Long id_usuario){
        usuarioService.delete(id_usuario);
    }

}
