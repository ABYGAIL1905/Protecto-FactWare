package com.example.demo.controlador;

import com.example.demo.modelo.Usuario;
import com.example.demo.repositorio.IUsuarioDao;
import com.example.demo.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class UsuarioControlador {

    private String usu;
    private String pas;

    @Autowired
    private IUsuarioService sU;

    @Autowired
    IUsuarioDao rU;

    //listar todos los usuarios
    @GetMapping("/listU")
    public List<Usuario> index() {
        return sU.findAll();
    }

    //Buscar un usuario
    @GetMapping("/buscU/{id}")
    public Usuario findById(Long id) {
        return sU.findById(id);
    }

    //Guardar
    @PutMapping("/savU")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario save(@RequestBody Usuario usuario) {
        return sU.save(usuario);
    }

    //Modificar Usuario
    @PutMapping("/modiU/{id}")
    public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id) {
        Usuario usuarioN = sU.findById(id);
        usuarioN.setUser(usuario.getUser());
        usuarioN.setPassword(usuario.getPassword());
        return sU.save(usuarioN);
    }

    //Eliminar Usuario
    @DeleteMapping("/delU/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        sU.delete(id);
    }

    //Iniciar login
    @PostMapping("/signin")
    public Usuario IniciarSesion(@RequestBody Usuario usuario) throws Exception {

//        usu="";
//        pas="";

        try {
            Usuario usr = rU.buscarRol(usuario.getUser(), usuario.getPassword());
           return usr;
            
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
        
        

//        // COMPROBAR SI EXISTE EL NOMBRE DE USUARIO EN NUESTRA BD..
//        if (rU.existsByUser(usuario.getUser())) {
//
//            // COMPROBAR SI CONINCIDE USUARIO Y CONTRASEÑA EN NUESTRA BD..
//            if (rU.existsByPassword(usuario.getPassword())) {
//                usu=usuario.getUser();
//                pas=usuario.getPassword();
//                System.out.println(usuario.getUser() + " " + usuario.getPassword());
//                return ;
//
//            } else {
//
//                throw new Exception("Error: Datos Erroneos!");
//            }
//
//        } else {
//
//            throw new Exception("Error: Datos Erroneos!");
//        }
    }

    @GetMapping("/rol")
    public Usuario BuscarRol() throws Exception {
        // COMPROBAR SI EXISTE EL NOMBRE DE USUARIO EN NUESTRA BD..
        if (rU.existsByUser(usu)) {

            // COMPROBAR SI CONINCIDE USUARIO Y CONTRASEÑA EN NUESTRA BD..
            if (rU.existsByPassword(pas)) {

                System.out.println(usu + " " + pas + " " + rU.buscarRol(usu, pas));
                return rU.buscarRol(usu, pas);

            } else {

                throw new Exception("Error: Datos Erroneos!");
            }

        } else {

            throw new Exception("Error: Datos Erroneos!");
        }
    }
}
