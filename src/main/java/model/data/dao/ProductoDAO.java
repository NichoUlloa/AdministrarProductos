package model.data.dao;

import model.Producto;
import org.jooq.*;
import org.jooq.impl.DSL;

import java.util.ArrayList;
import java.util.List;

import static org.jooq.impl.DSL.*;
import static org.jooq.impl.SQLDataType.VARCHAR;
public class ProductoDAO {
    // metodo agregarProducto
    public static void agregarProducto(DSLContext query, Producto producto){
        Table tablaProducto= table(name("Producto"));
        Field[] columnas = tablaProducto.fields("nombreProducto","idProducto","marca");
        query.insertInto(tablaProducto, columnas[0], columnas[1],columnas[2])
                .values(producto.getNombreProducto(),producto.getIdProducto(),producto.getMarca().toString())
                .execute();
    }

    // metodo eliminarProducto
    public static void eliminarProducto(DSLContext query, String idProducto) {
        Table tablaProducto = table(name("Producto"));
        query.delete(tablaProducto).where(field("idProducto").eq(idProducto)).execute();
    }

}
// ejemplo de metodo agregar
// public static void agregarEstudiante(DSLContext query, Estudiante estudiante){
//        Table tablaEstudiante= table(name("Estudiante"));
//        Field[] columnas = tablaEstudiante.fields("rut","nombre","matricula","codigo_carrera");
//        query.insertInto(tablaEstudiante, columnas[0], columnas[1],columnas[2],columnas[3])
//                .values(estudiante.getRut(),estudiante.getNombre(),estudiante.getMatricula(),estudiante.getCarrera().getCodigoCarrera())
//                .execute();
//    }


// ejemplo
//  public void eliminarEstudiante(DSLContext query, String rut){
//        Table tablaEstudiante= table(name("Estudiante"));
//        query.delete(DSL.table("Estudiante")).where(DSL.field("rut").eq(rut)).execute();
//    }

