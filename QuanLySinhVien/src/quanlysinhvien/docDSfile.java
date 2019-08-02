/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;
   import java.io.File;
import java.io.FilenameFilter;
/**
 *
 * @author yumil
 */
public class docDSfile  implements FilenameFilter {
 
    @Override
    public boolean accept(File dir, String name) {
 
        if (name.endsWith(".csv")) {
            return true;
        }
 
        return false;
    }
    
}
