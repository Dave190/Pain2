/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Maximiliano
 */
public class Persona {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getFecha_De_Nacimiento() {
        return Fecha_De_Nacimiento;
    }

    public void setFecha_De_Nacimiento(int Fecha_De_Nacimiento) {
        this.Fecha_De_Nacimiento = Fecha_De_Nacimiento;
    }

    public String getLugar_De_Nacimiento() {
        return Lugar_De_Nacimiento;
    }

    public void setLugar_De_Nacimiento(String Lugar_De_Nacimiento) {
        this.Lugar_De_Nacimiento = Lugar_De_Nacimiento;
    }

    public String getEstado_Civil() {
        return Estado_Civil;
    }

    public void setEstado_Civil(String Estado_Civil) {
        this.Estado_Civil = Estado_Civil;
    }

    public String getDireccion_De_HAbitacion() {
        return Direccion_De_HAbitacion;
    }

    public void setDireccion_De_HAbitacion(String Direccion_De_HAbitacion) {
        this.Direccion_De_HAbitacion = Direccion_De_HAbitacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getNumero_Familiar() {
        return Numero_Familiar;
    }

    public void setNumero_Familiar(int Numero_Familiar) {
        this.Numero_Familiar = Numero_Familiar;
    }
    private String nombre;
    private String apellido;
    private int CI;
    private char sexo;
    private int Fecha_De_Nacimiento;
    private String Lugar_De_Nacimiento;
    private String Estado_Civil;
    private String Direccion_De_HAbitacion;
    private int telefono;
    private String profesion;
    private String ocupacion;
    private int Numero_Familiar;  
}


// - Nombres: string
// - Apellidos: string
// - CI: int
// - Sexo: char
// - Fecha_de_Nacimiento: date
// - Lugar_de_Nacimiento: string
// - EstadoCivil: bool
// - Direccion_de_habitacion: string
// - Telefono: int
// - Profesion: string
// - Ocupacion: string
// - Numero_de_telefono_familiar: int
