/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbch8;

/**
 *
 * @author NoahFranck
 */

/**
 * Write the definition of a class  PlayListEntry containing:
An instance variable  title of type  String , initialized  to the empty String.
An instance variable  artist of type  String , initialized  to the empty String.
An instance variable  playCount of type  int , initialized  to 0.
In addition, your PlayList class  definition should provide an appropriately 
* named  "get" method  and "set" method  for each of these. 
No constructor  need be defined. 
 * @author NoahFranck
 */
public class PlayListEntry {
    private String title = "";
    private String artist = "";
    private int playCount;
    
    public void setTitle(String a){
        title = a;
    }
    
    public void setArtist(String b){
        artist = b;
    }
    
    public void setPlayCount(int a){
        playCount = a;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public int getPlayCount(){
        return playCount;
    }
}
