/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteka.a1;

/**
 *
 * @author aurel
 */
public class CitalacDO {
    public int id;
    public String ime,prezime,adresa,jmbg;

    @Override
    public String toString() {
        return id + " - " + ime + " " + prezime;
    }
    
}
