package alttab_sprint_4;

public class Trash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //String formul="+73x^2+7x+6";
       String formul="2x+777x^2+88";
       String terimler="+-/.";
       int katsayi_kare=0;
       
      
      
       String gecici="";
       
       for(int i=formul.indexOf("x^2")-1;i>=0;i--)
       {
           if(Character.isDigit(formul.charAt(i)))
           {
                gecici+=formul.charAt(i);
                if(i==0)
                    katsayi_kare=Integer.parseInt(gecici);
           }
           else
           {
               String tersgecici=new Trash().tersCevir(gecici);
               if(formul.charAt(i)=='+')
                   katsayi_kare=Integer.parseInt(tersgecici);
               else if(formul.charAt(i)=='-')
                   katsayi_kare=-Integer.parseInt(tersgecici);
               
                   
           }
       }
        System.out.println(katsayi_kare);
    }
    public String tersCevir(String gelen)
    {
        String tersgecici="";
               //stringi ters çeviriyoruz bknz stack mantığı
               for(int z=gelen.length()-1;z>=0;z--)
                   tersgecici+=gelen.charAt(z);
               return tersgecici;
    }
}